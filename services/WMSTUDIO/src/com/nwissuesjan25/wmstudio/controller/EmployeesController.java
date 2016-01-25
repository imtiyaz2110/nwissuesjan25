/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.nwissuesjan25.wmstudio.service.DepartmentsService;
import com.nwissuesjan25.wmstudio.service.EmployeesService;
import com.nwissuesjan25.wmstudio.service.JobHistoryService;


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
 * Controller object for domain model class Employees.
 * @see com.nwissuesjan25.wmstudio.Employees
 */

@RestController(value = "WMSTUDIO.EmployeesController")
@Api(value = "/WMSTUDIO/Employees", description = "Exposes APIs to work with Employees resource.")
@RequestMapping("/WMSTUDIO/Employees")
public class EmployeesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesController.class);

	@Autowired
	@Qualifier("WMSTUDIO.EmployeesService")
	private EmployeesService employeesService;


    @Autowired
    @Qualifier("WMSTUDIO.DepartmentsService")
    private DepartmentsService departmentsService;


    @Autowired
    @Qualifier("WMSTUDIO.JobHistoryService")
    private JobHistoryService jobHistoryService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Employees instances matching the search criteria.")
	public Page<Employees> findEmployeess( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Employeess list");
		return employeesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Employees instances.")
	public Page<Employees> getEmployeess(Pageable pageable) {
		LOGGER.debug("Rendering Employeess list");
		return employeesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Employees instances.")
	public Long countAllEmployeess() {
		LOGGER.debug("counting Employeess");
		Long count = employeesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Employees instance associated with the given id.")
    public Employees getEmployees(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Employees with id: {}" , id);
        Employees instance = employeesService.findById(id);
        LOGGER.debug("Employees details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Employees instance associated with the given id.")
    public boolean deleteEmployees(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Employees with id: {}" , id);
        Employees deleted = employeesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Employees instance associated with the given id.")
    public Employees editEmployees(@PathVariable("id") Integer id, @RequestBody Employees instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Employees with id: {}" , instance.getEmployeeId());
        instance.setEmployeeId(id);
        instance = employeesService.update(instance);
        LOGGER.debug("Employees details with id: {}" , instance);
        return instance;
    }


    @RequestMapping(value="/{id:.+}/employeesesForManagerId", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the employeesesForManagerId instance associated with the given id.")
     public Page<Employees> findAssociatedemployeesesForManagerId(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated employeesesForManagerId");
        return employeesService.findAssociatedValues(id,"employeesByManagerId","employeeId", pageable);
   }

    @RequestMapping(value="/{id:.+}/jobHistories", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the jobHistories instance associated with the given id.")
     public Page<JobHistory> findAssociatedjobHistories(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated jobHistories");
        return jobHistoryService.findAssociatedValues(id,"employees","employeeId", pageable);
   }

    @RequestMapping(value="/{id:.+}/departmentsesForManagerId", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the departmentsesForManagerId instance associated with the given id.")
     public Page<Departments> findAssociateddepartmentsesForManagerId(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated departmentsesForManagerId");
        return departmentsService.findAssociatedValues(id,"employeesByManagerId","employeeId", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Employees instance.")
	public Employees createEmployees(@RequestBody Employees instance) {
		LOGGER.debug("Create Employees with information: {}" , instance);
		instance = employeesService.create(instance);
		LOGGER.debug("Created Employees with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setEmployeesService(EmployeesService service) {
		this.employeesService = service;
	}
}

