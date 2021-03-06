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
 * ServiceImpl object for domain model class EmpDetailsView.
 * @see com.nwissuesjan25.wmstudio.EmpDetailsView
 */
@Service("WMSTUDIO.EmpDetailsViewService")
public class EmpDetailsViewServiceImpl implements EmpDetailsViewService {


    private static final Logger LOGGER = LoggerFactory.getLogger(EmpDetailsViewServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIO.EmpDetailsViewDao")
    private WMGenericDao<EmpDetailsView, EmpDetailsViewId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<EmpDetailsView, EmpDetailsViewId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
     public Page<EmpDetailsView> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public EmpDetailsView create(EmpDetailsView empdetailsview) {
        LOGGER.debug("Creating a new empdetailsview with information: {}" , empdetailsview);
        return this.wmGenericDao.create(empdetailsview);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public EmpDetailsView delete(EmpDetailsViewId empdetailsviewId) throws EntityNotFoundException {
        LOGGER.debug("Deleting empdetailsview with id: {}" , empdetailsviewId);
        EmpDetailsView deleted = this.wmGenericDao.findById(empdetailsviewId);
        if (deleted == null) {
            LOGGER.debug("No empdetailsview found with id: {}" , empdetailsviewId);
            throw new EntityNotFoundException(String.valueOf(empdetailsviewId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<EmpDetailsView> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all empdetailsviews");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<EmpDetailsView> findAll(Pageable pageable) {
        LOGGER.debug("Finding all empdetailsviews");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public EmpDetailsView findById(EmpDetailsViewId id) throws EntityNotFoundException {
        LOGGER.debug("Finding empdetailsview by id: {}" , id);
        EmpDetailsView empdetailsview=this.wmGenericDao.findById(id);
        if(empdetailsview==null){
            LOGGER.debug("No empdetailsview found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return empdetailsview;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public EmpDetailsView update(EmpDetailsView updated) throws EntityNotFoundException {
        LOGGER.debug("Updating empdetailsview with information: {}" , updated);
        this.wmGenericDao.update(updated);

        EmpDetailsViewId id = new EmpDetailsViewId();
        id.setEmployeeId(updated.getEmployeeId());
        id.setJobId(updated.getJobId());
        id.setManagerId(updated.getManagerId());
        id.setDepartmentId(updated.getDepartmentId());
        id.setLocationId(updated.getLocationId());
        id.setCountryId(updated.getCountryId());
        id.setFirstName(updated.getFirstName());
        id.setLastName(updated.getLastName());
        id.setSalary(updated.getSalary());
        id.setCommissionPct(updated.getCommissionPct());
        id.setDepartmentName(updated.getDepartmentName());
        id.setJobTitle(updated.getJobTitle());
        id.setCity(updated.getCity());
        id.setStateProvince(updated.getStateProvince());
        id.setCountryName(updated.getCountryName());
        id.setRegionName(updated.getRegionName());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


