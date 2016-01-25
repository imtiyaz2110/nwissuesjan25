/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.nwissuesjan25.wmstudio.*;
/**
* Specifies methods used to obtain and modify Locations related information
* which is stored in the database.
*/
@Repository("WMSTUDIO.LocationsDao")
public class LocationsDao extends WMGenericDaoImpl <Locations, Short> {

    @Autowired
    @Qualifier("WMSTUDIOTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

