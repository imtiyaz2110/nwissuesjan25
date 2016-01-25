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
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Jobs generated by hbm2java
 */
@Entity
@Table(name="`JOBS`"
    ,schema="HR"
)

public class Jobs  implements java.io.Serializable {

    private String jobId;
    private String jobTitle;
    private Integer minSalary;
    private Integer maxSalary;
    private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);
    private Set<Employees> employeeses = new HashSet<Employees>(0);

    public Jobs() {
    }


    @Id 
    

    @Column(name="`JOB_ID`", nullable=false, length=10)
    public String getJobId() {
        return this.jobId;
    }
    
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Column(name="`JOB_TITLE`", nullable=false, length=35)
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    

    @Column(name="`MIN_SALARY`", precision=6)
    public Integer getMinSalary() {
        return this.minSalary;
    }
    
    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    

    @Column(name="`MAX_SALARY`", precision=6)
    public Integer getMaxSalary() {
        return this.maxSalary;
    }
    
    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="jobs")
    public Set<JobHistory> getJobHistories() {
        return this.jobHistories;
    }
    
    public void setJobHistories(Set<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="jobs")
    public Set<Employees> getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set<Employees> employeeses) {
        this.employeeses = employeeses;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Jobs) )
		    return false;

		 Jobs that = (Jobs) o;

		 return ( (this.getJobId()==that.getJobId()) || ( this.getJobId()!=null && that.getJobId()!=null && this.getJobId().equals(that.getJobId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getJobId() == null ? 0 : this.getJobId().hashCode() );

         return result;
    }


}

