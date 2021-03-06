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
 * Departments generated by hbm2java
 */
@Entity
@Table(name="`DEPARTMENTS`"
    ,schema="HR"
)

public class Departments  implements java.io.Serializable {

    private short departmentId;
    private String departmentName;
    private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);
    private Set<Employees> employeesesForDepartmentId = new HashSet<Employees>(0);
    private Employees employeesByManagerId;
    private Locations locations;

    public Departments() {
    }


    @Id 
    

    @Column(name="`DEPARTMENT_ID`", nullable=false, precision=4)
    public short getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(short departmentId) {
        this.departmentId = departmentId;
    }

    

    @Column(name="`DEPARTMENT_NAME`", nullable=false, length=30)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="departments")
    public Set<JobHistory> getJobHistories() {
        return this.jobHistories;
    }
    
    public void setJobHistories(Set<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="departmentsByDepartmentId")
    public Set<Employees> getEmployeesesForDepartmentId() {
        return this.employeesesForDepartmentId;
    }
    
    public void setEmployeesesForDepartmentId(Set<Employees> employeesesForDepartmentId) {
        this.employeesesForDepartmentId = employeesesForDepartmentId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`MANAGER_ID`")
    public Employees getEmployeesByManagerId() {
        return this.employeesByManagerId;
    }
    
    public void setEmployeesByManagerId(Employees employeesByManagerId) {
        this.employeesByManagerId = employeesByManagerId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`LOCATION_ID`")
    public Locations getLocations() {
        return this.locations;
    }
    
    public void setLocations(Locations locations) {
        this.locations = locations;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Departments) )
		    return false;

		 Departments that = (Departments) o;

		 return (this.getDepartmentId()==that.getDepartmentId());
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + this.getDepartmentId();

         return result;
    }


}

