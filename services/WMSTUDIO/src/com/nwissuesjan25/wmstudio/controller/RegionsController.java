/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.nwissuesjan25.wmstudio.service.CountriesService;
import com.nwissuesjan25.wmstudio.service.RegionsService;
import java.math.BigDecimal;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;

import com.nwissuesjan25.wmstudio.*;
import com.nwissuesjan25.wmstudio.service.*;


/**
 * Controller object for domain model class Regions.
 * @see com.nwissuesjan25.wmstudio.Regions
 */

@RestController(value = "WMSTUDIO.RegionsController")
@Api(value = "/WMSTUDIO/Regions", description = "Exposes APIs to work with Regions resource.")
@RequestMapping("/WMSTUDIO/Regions")
public class RegionsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegionsController.class);

	@Autowired
	@Qualifier("WMSTUDIO.RegionsService")
	private RegionsService regionsService;


    @Autowired
    @Qualifier("WMSTUDIO.CountriesService")
    private CountriesService countriesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Regions instances matching the search criteria.")
	public Page<Regions> findRegionss( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Regionss list");
		return regionsService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Regions instances.")
	public Page<Regions> getRegionss(Pageable pageable) {
		LOGGER.debug("Rendering Regionss list");
		return regionsService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Regions instances.")
	public Long countAllRegionss() {
		LOGGER.debug("counting Regionss");
		Long count = regionsService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Regions instance associated with the given id.")
    public Regions getRegions(@PathVariable("id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Getting Regions with id: {}" , id);
        Regions instance = regionsService.findById(id);
        LOGGER.debug("Regions details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Regions instance associated with the given id.")
    public boolean deleteRegions(@PathVariable("id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Regions with id: {}" , id);
        Regions deleted = regionsService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Regions instance associated with the given id.")
    public Regions editRegions(@PathVariable("id") BigDecimal id, @RequestBody Regions instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Regions with id: {}" , instance.getRegionId());
        instance.setRegionId(id);
        instance = regionsService.update(instance);
        LOGGER.debug("Regions details with id: {}" , instance);
        return instance;
    }


    @RequestMapping(value="/{id:.+}/countrieses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the countrieses instance associated with the given id.")
     public Page<Countries> findAssociatedcountrieses(Pageable pageable, @PathVariable("id") BigDecimal id){
        LOGGER.debug("Fetching all associated countrieses");
        return countriesService.findAssociatedValues(id,"regions","regionId", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Regions instance.")
	public Regions createRegions(@RequestBody Regions instance) {
		LOGGER.debug("Create Regions with information: {}" , instance);
		instance = regionsService.create(instance);
		LOGGER.debug("Created Regions with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setRegionsService(RegionsService service) {
		this.regionsService = service;
	}
}

