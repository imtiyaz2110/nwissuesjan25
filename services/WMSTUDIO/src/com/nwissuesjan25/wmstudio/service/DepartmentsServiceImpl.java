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
 * ServiceImpl object for domain model class Departments.
 * @see com.nwissuesjan25.wmstudio.Departments
 */
@Service("WMSTUDIO.DepartmentsService")
public class DepartmentsServiceImpl implements DepartmentsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentsServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIO.DepartmentsDao")
    private WMGenericDao<Departments, Short> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Departments, Short> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
     public Page<Departments> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Departments create(Departments departments) {
        LOGGER.debug("Creating a new departments with information: {}" , departments);
        return this.wmGenericDao.create(departments);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Departments delete(Short departmentsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting departments with id: {}" , departmentsId);
        Departments deleted = this.wmGenericDao.findById(departmentsId);
        if (deleted == null) {
            LOGGER.debug("No departments found with id: {}" , departmentsId);
            throw new EntityNotFoundException(String.valueOf(departmentsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Departments> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all departmentss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Departments> findAll(Pageable pageable) {
        LOGGER.debug("Finding all departmentss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Departments findById(Short id) throws EntityNotFoundException {
        LOGGER.debug("Finding departments by id: {}" , id);
        Departments departments=this.wmGenericDao.findById(id);
        if(departments==null){
            LOGGER.debug("No departments found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return departments;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Departments update(Departments updated) throws EntityNotFoundException {
        LOGGER.debug("Updating departments with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Short id = (Short)updated.getDepartmentId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

