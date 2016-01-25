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
 * ServiceImpl object for domain model class Regions.
 * @see com.nwissuesjan25.wmstudio.Regions
 */
@Service("WMSTUDIO.RegionsService")
public class RegionsServiceImpl implements RegionsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(RegionsServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIO.RegionsDao")
    private WMGenericDao<Regions, BigDecimal> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Regions, BigDecimal> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
     public Page<Regions> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Regions create(Regions regions) {
        LOGGER.debug("Creating a new regions with information: {}" , regions);
        return this.wmGenericDao.create(regions);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions delete(BigDecimal regionsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting regions with id: {}" , regionsId);
        Regions deleted = this.wmGenericDao.findById(regionsId);
        if (deleted == null) {
            LOGGER.debug("No regions found with id: {}" , regionsId);
            throw new EntityNotFoundException(String.valueOf(regionsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Regions> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all regionss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Regions> findAll(Pageable pageable) {
        LOGGER.debug("Finding all regionss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions findById(BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Finding regions by id: {}" , id);
        Regions regions=this.wmGenericDao.findById(id);
        if(regions==null){
            LOGGER.debug("No regions found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return regions;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions update(Regions updated) throws EntityNotFoundException {
        LOGGER.debug("Updating regions with information: {}" , updated);
        this.wmGenericDao.update(updated);

        BigDecimal id = (BigDecimal)updated.getRegionId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


