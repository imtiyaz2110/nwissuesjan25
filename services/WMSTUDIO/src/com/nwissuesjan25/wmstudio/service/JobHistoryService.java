/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.nwissuesjan25.wmstudio.*;

/**
 * Service object for domain model class JobHistory.
 * @see com.nwissuesjan25.wmstudio.JobHistory
 */

public interface JobHistoryService {
   /**
	 * Creates a new jobhistory.
	 * 
	 * @param created
	 *            The information of the created jobhistory.
	 * @return The created jobhistory.
	 */
	public JobHistory create(JobHistory created);

	/**
	 * Deletes a jobhistory.
	 * 
	 * @param jobhistoryId
	 *            The id of the deleted jobhistory.
	 * @return The deleted jobhistory.
	 * @throws EntityNotFoundException
	 *             if no jobhistory is found with the given id.
	 */
	public JobHistory delete(JobHistoryId jobhistoryId) throws EntityNotFoundException;

	/**
	 * Finds all jobhistorys.
	 * 
	 * @return A list of jobhistorys.
	 */
	public Page<JobHistory> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<JobHistory> findAll(Pageable pageable);
	
	/**
	 * Finds jobhistory by id.
	 * 
	 * @param id
	 *            The id of the wanted jobhistory.
	 * @return The found jobhistory. If no jobhistory is found, this method returns
	 *         null.
	 */
	public JobHistory findById(JobHistoryId id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a jobhistory.
	 * 
	 * @param updated
	 *            The information of the updated jobhistory.
	 * @return The updated jobhistory.
	 * @throws EntityNotFoundException
	 *             if no jobhistory is found with given id.
	 */
	public JobHistory update(JobHistory updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the jobhistorys in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the jobhistory.
	 */

	public long countAll();


    public Page<JobHistory> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

