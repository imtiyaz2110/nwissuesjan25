/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.math.BigDecimal;



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
 * ServiceImpl object for domain model class Testtable.
 * @see com.nwissuesjan25.wmstudio.Testtable
 */
@Service("WMSTUDIO.TesttableService")
public class TesttableServiceImpl implements TesttableService {


    private static final Logger LOGGER = LoggerFactory.getLogger(TesttableServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIO.TesttableDao")
    private WMGenericDao<Testtable, BigDecimal> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Testtable, BigDecimal> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
     public Page<Testtable> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Testtable create(Testtable testtable) {
        LOGGER.debug("Creating a new testtable with information: {}" , testtable);
        return this.wmGenericDao.create(testtable);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Testtable delete(BigDecimal testtableId) throws EntityNotFoundException {
        LOGGER.debug("Deleting testtable with id: {}" , testtableId);
        Testtable deleted = this.wmGenericDao.findById(testtableId);
        if (deleted == null) {
            LOGGER.debug("No testtable found with id: {}" , testtableId);
            throw new EntityNotFoundException(String.valueOf(testtableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Testtable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all testtables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Testtable> findAll(Pageable pageable) {
        LOGGER.debug("Finding all testtables");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Testtable findById(BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Finding testtable by id: {}" , id);
        Testtable testtable=this.wmGenericDao.findById(id);
        if(testtable==null){
            LOGGER.debug("No testtable found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return testtable;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Testtable update(Testtable updated) throws EntityNotFoundException {
        LOGGER.debug("Updating testtable with information: {}" , updated);
        this.wmGenericDao.update(updated);

        BigDecimal id = (BigDecimal)updated.getPkcolumn();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


