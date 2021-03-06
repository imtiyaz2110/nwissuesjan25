/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import javax.persistence.Embeddable;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * JobHistoryId generated by hbm2java
 */
@Embeddable
public class JobHistoryId  implements java.io.Serializable {

    private Integer employeeId;
    private Date startDate;

    public JobHistoryId() {
    }


    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof JobHistoryId) )
		    return false;

		 JobHistoryId that = (JobHistoryId) o;

         return ( (this.getEmployeeId()==that.getEmployeeId()) || ( this.getEmployeeId()!=null && that.getEmployeeId()!=null && this.getEmployeeId().equals(that.getEmployeeId()) ) )
 && ( (this.getStartDate()==that.getStartDate()) || ( this.getStartDate()!=null && that.getStartDate()!=null && this.getStartDate().equals(that.getStartDate()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getEmployeeId() == null ? 0 : this.getEmployeeId().hashCode() );
         result = 37 * result + ( getStartDate() == null ? 0 : this.getStartDate().hashCode() );

         return result;
    }


}

