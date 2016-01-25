/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.nwissuesjan25.wmstudio.*;

/**
 * Service object for domain model class Employees.
 * @see com.nwissuesjan25.wmstudio.Employees
 */

public interface EmployeesService {
   /**
	 * Creates a new employees.
	 * 
	 * @param created
	 *            The information of the created employees.
	 * @return The created employees.
	 */
	public Employees create(Employees created);

	/**
	 * Deletes a employees.
	 * 
	 * @param employeesId
	 *            The id of the deleted employees.
	 * @return The deleted employees.
	 * @throws EntityNotFoundException
	 *             if no employees is found with the given id.
	 */
	public Employees delete(Integer employeesId) throws EntityNotFoundException;

	/**
	 * Finds all employeess.
	 * 
	 * @return A list of employeess.
	 */
	public Page<Employees> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Employees> findAll(Pageable pageable);
	
	/**
	 * Finds employees by id.
	 * 
	 * @param id
	 *            The id of the wanted employees.
	 * @return The found employees. If no employees is found, this method returns
	 *         null.
	 */
	public Employees findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a employees.
	 * 
	 * @param updated
	 *            The information of the updated employees.
	 * @return The updated employees.
	 * @throws EntityNotFoundException
	 *             if no employees is found with given id.
	 */
	public Employees update(Employees updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the employeess in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the employees.
	 */

	public long countAll();


    public Page<Employees> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
