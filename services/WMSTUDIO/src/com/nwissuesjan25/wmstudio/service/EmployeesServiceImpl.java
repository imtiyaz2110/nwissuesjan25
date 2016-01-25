/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.nwissuesjan25.wmstudio.*;


/**
 * ServiceImpl object for domain model class Employees.
 * @see com.nwissuesjan25.wmstudio.Employees
 */
@Service("WMSTUDIO.EmployeesService")
public class EmployeesServiceImpl implements EmployeesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIO.EmployeesDao")
    private WMGenericDao<Employees, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Employees, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
     public Page<Employees> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Employees create(Employees employees) {
        LOGGER.debug("Creating a new employees with information: {}" , employees);
        return this.wmGenericDao.create(employees);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Employees delete(Integer employeesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting employees with id: {}" , employeesId);
        Employees deleted = this.wmGenericDao.findById(employeesId);
        if (deleted == null) {
            LOGGER.debug("No employees found with id: {}" , employeesId);
            throw new EntityNotFoundException(String.valueOf(employeesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Employees> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all employeess");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Employees> findAll(Pageable pageable) {
        LOGGER.debug("Finding all employeess");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Employees findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding employees by id: {}" , id);
        Employees employees=this.wmGenericDao.findById(id);
        if(employees==null){
            LOGGER.debug("No employees found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return employees;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Employees update(Employees updated) throws EntityNotFoundException {
        LOGGER.debug("Updating employees with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getEmployeeId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


