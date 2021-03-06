/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Regions generated by hbm2java
 */
@Entity
@Table(name="`REGIONS`"
    ,schema="HR"
)

public class Regions  implements java.io.Serializable {

    private BigDecimal regionId;
    private String regionName;
    private Set<Countries> countrieses = new HashSet<Countries>(0);

    public Regions() {
    }


    @Id 
    

    @Column(name="`REGION_ID`", nullable=false)
    public BigDecimal getRegionId() {
        return this.regionId;
    }
    
    public void setRegionId(BigDecimal regionId) {
        this.regionId = regionId;
    }

    

    @Column(name="`REGION_NAME`", length=25)
    public String getRegionName() {
        return this.regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="regions")
    public Set<Countries> getCountrieses() {
        return this.countrieses;
    }
    
    public void setCountrieses(Set<Countries> countrieses) {
        this.countrieses = countrieses;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Regions) )
		    return false;

		 Regions that = (Regions) o;

		 return ( (this.getRegionId()==that.getRegionId()) || ( this.getRegionId()!=null && that.getRegionId()!=null && this.getRegionId().equals(that.getRegionId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getRegionId() == null ? 0 : this.getRegionId().hashCode() );

         return result;
    }


}

