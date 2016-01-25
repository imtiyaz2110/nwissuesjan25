/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Testtable generated by hbm2java
 */
@Entity
@Table(name="`TESTTABLE`"
    ,schema="HR"
)

public class Testtable  implements java.io.Serializable {

    private BigDecimal pkcolumn;
    private Date myDate;
    private Date myTimestampTimezone;
    private Date nrmlTimestmp;
    private Date timeStampLtz;

    public Testtable() {
    }


    @Id 
    

    @Column(name="`PKCOLUMN`", nullable=false)
    public BigDecimal getPkcolumn() {
        return this.pkcolumn;
    }
    
    public void setPkcolumn(BigDecimal pkcolumn) {
        this.pkcolumn = pkcolumn;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`MY_DATE`")
    public Date getMyDate() {
        return this.myDate;
    }
    
    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`MY_TIMESTAMP_TIMEZONE`", length=11)
    public Date getMyTimestampTimezone() {
        return this.myTimestampTimezone;
    }
    
    public void setMyTimestampTimezone(Date myTimestampTimezone) {
        this.myTimestampTimezone = myTimestampTimezone;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`NRML_TIMESTMP`", length=11)
    public Date getNrmlTimestmp() {
        return this.nrmlTimestmp;
    }
    
    public void setNrmlTimestmp(Date nrmlTimestmp) {
        this.nrmlTimestmp = nrmlTimestmp;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`TIME_STAMP_LTZ`", length=11)
    public Date getTimeStampLtz() {
        return this.timeStampLtz;
    }
    
    public void setTimeStampLtz(Date timeStampLtz) {
        this.timeStampLtz = timeStampLtz;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Testtable) )
		    return false;

		 Testtable that = (Testtable) o;

		 return ( (this.getPkcolumn()==that.getPkcolumn()) || ( this.getPkcolumn()!=null && that.getPkcolumn()!=null && this.getPkcolumn().equals(that.getPkcolumn()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getPkcolumn() == null ? 0 : this.getPkcolumn().hashCode() );

         return result;
    }


}
