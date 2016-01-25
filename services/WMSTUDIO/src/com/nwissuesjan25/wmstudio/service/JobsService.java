/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.nwissuesjan25.wmstudio.*;

/**
 * Service object for domain model class Jobs.
 * @see com.nwissuesjan25.wmstudio.Jobs
 */

public interface JobsService {
   /**
	 * Creates a new jobs.
	 * 
	 * @param created
	 *            The information of the created jobs.
	 * @return The created jobs.
	 */
	public Jobs create(Jobs created);

	/**
	 * Deletes a jobs.
	 * 
	 * @param jobsId
	 *            The id of the deleted jobs.
	 * @return The deleted jobs.
	 * @throws EntityNotFoundException
	 *             if no jobs is found with the given id.
	 */
	public Jobs delete(String jobsId) throws EntityNotFoundException;

	/**
	 * Finds all jobss.
	 * 
	 * @return A list of jobss.
	 */
	public Page<Jobs> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Jobs> findAll(Pageable pageable);
	
	/**
	 * Finds jobs by id.
	 * 
	 * @param id
	 *            The id of the wanted jobs.
	 * @return The found jobs. If no jobs is found, this method returns
	 *         null.
	 */
	public Jobs findById(String id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a jobs.
	 * 
	 * @param updated
	 *            The information of the updated jobs.
	 * @return The updated jobs.
	 * @throws EntityNotFoundException
	 *             if no jobs is found with given id.
	 */
	public Jobs update(Jobs updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the jobss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the jobs.
	 */

	public long countAll();


    public Page<Jobs> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

