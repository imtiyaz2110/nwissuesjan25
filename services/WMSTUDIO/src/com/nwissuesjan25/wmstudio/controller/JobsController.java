/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.nwissuesjan25.wmstudio.service.EmployeesService;
import com.nwissuesjan25.wmstudio.service.JobHistoryService;
import com.nwissuesjan25.wmstudio.service.JobsService;


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
 * Controller object for domain model class Jobs.
 * @see com.nwissuesjan25.wmstudio.Jobs
 */

@RestController(value = "WMSTUDIO.JobsController")
@Api(value = "/WMSTUDIO/Jobs", description = "Exposes APIs to work with Jobs resource.")
@RequestMapping("/WMSTUDIO/Jobs")
public class JobsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobsController.class);

	@Autowired
	@Qualifier("WMSTUDIO.JobsService")
	private JobsService jobsService;


    @Autowired
    @Qualifier("WMSTUDIO.EmployeesService")
    private EmployeesService employeesService;


    @Autowired
    @Qualifier("WMSTUDIO.JobHistoryService")
    private JobHistoryService jobHistoryService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Jobs instances matching the search criteria.")
	public Page<Jobs> findJobss( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Jobss list");
		return jobsService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Jobs instances.")
	public Page<Jobs> getJobss(Pageable pageable) {
		LOGGER.debug("Rendering Jobss list");
		return jobsService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Jobs instances.")
	public Long countAllJobss() {
		LOGGER.debug("counting Jobss");
		Long count = jobsService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Jobs instance associated with the given id.")
    public Jobs getJobs(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Getting Jobs with id: {}" , id);
        Jobs instance = jobsService.findById(id);
        LOGGER.debug("Jobs details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Jobs instance associated with the given id.")
    public boolean deleteJobs(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Jobs with id: {}" , id);
        Jobs deleted = jobsService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Jobs instance associated with the given id.")
    public Jobs editJobs(@PathVariable("id") String id, @RequestBody Jobs instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Jobs with id: {}" , instance.getJobId());
        instance.setJobId(id);
        instance = jobsService.update(instance);
        LOGGER.debug("Jobs details with id: {}" , instance);
        return instance;
    }


    @RequestMapping(value="/{id:.+}/employeeses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the employeeses instance associated with the given id.")
     public Page<Employees> findAssociatedemployeeses(Pageable pageable, @PathVariable("id") String id){
        LOGGER.debug("Fetching all associated employeeses");
        return employeesService.findAssociatedValues(id,"jobs","jobId", pageable);
   }

    @RequestMapping(value="/{id:.+}/jobHistories", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the jobHistories instance associated with the given id.")
     public Page<JobHistory> findAssociatedjobHistories(Pageable pageable, @PathVariable("id") String id){
        LOGGER.debug("Fetching all associated jobHistories");
        return jobHistoryService.findAssociatedValues(id,"jobs","jobId", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Jobs instance.")
	public Jobs createJobs(@RequestBody Jobs instance) {
		LOGGER.debug("Create Jobs with information: {}" , instance);
		instance = jobsService.create(instance);
		LOGGER.debug("Created Jobs with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setJobsService(JobsService service) {
		this.jobsService = service;
	}
}

