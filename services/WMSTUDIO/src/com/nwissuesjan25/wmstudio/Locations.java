/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Locations generated by hbm2java
 */
@Entity
@Table(name="`LOCATIONS`"
    ,schema="HR"
)

public class Locations  implements java.io.Serializable {

    private short locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private Countries countries;
    private Set<Departments> departmentses = new HashSet<Departments>(0);

    public Locations() {
    }


    @Id 
    

    @Column(name="`LOCATION_ID`", nullable=false, precision=4)
    public short getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(short locationId) {
        this.locationId = locationId;
    }

    

    @Column(name="`STREET_ADDRESS`", length=40)
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    

    @Column(name="`POSTAL_CODE`", length=12)
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    

    @Column(name="`CITY`", nullable=false, length=30)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    

    @Column(name="`STATE_PROVINCE`", length=25)
    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`COUNTRY_ID`")
    public Countries getCountries() {
        return this.countries;
    }
    
    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="locations")
    public Set<Departments> getDepartmentses() {
        return this.departmentses;
    }
    
    public void setDepartmentses(Set<Departments> departmentses) {
        this.departmentses = departmentses;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Locations) )
		    return false;

		 Locations that = (Locations) o;

		 return (this.getLocationId()==that.getLocationId());
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + this.getLocationId();

         return result;
    }


}

