/*Generated by WaveMaker Studio*/

package com.nwissuesjan25.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name="`EMPLOYEES`"
    ,schema="HR"
)

public class Employees  implements java.io.Serializable {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private BigDecimal salary;
    private BigDecimal commissionPct;
    private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);
    private Departments departmentsByDepartmentId;
    private Employees employeesByManagerId;
    private Set<Employees> employeesesForManagerId = new HashSet<Employees>(0);
    private Jobs jobs;
    private Set<Departments> departmentsesForManagerId = new HashSet<Departments>(0);

    public Employees() {
    }


    @Id 
    

    @Column(name="`EMPLOYEE_ID`", nullable=false, precision=6)
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    

    @Column(name="`FIRST_NAME`", length=20)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    

    @Column(name="`LAST_NAME`", nullable=false, length=25)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    @Column(name="`EMAIL`", nullable=false, length=25)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    

    @Column(name="`PHONE_NUMBER`", length=20)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`HIRE_DATE`", nullable=false)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    

    @Column(name="`SALARY`", precision=8)
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    

    @Column(name="`COMMISSION_PCT`", precision=2)
    public BigDecimal getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="employees")
    public Set<JobHistory> getJobHistories() {
        return this.jobHistories;
    }
    
    public void setJobHistories(Set<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`DEPARTMENT_ID`")
    public Departments getDepartmentsByDepartmentId() {
        return this.departmentsByDepartmentId;
    }
    
    public void setDepartmentsByDepartmentId(Departments departmentsByDepartmentId) {
        this.departmentsByDepartmentId = departmentsByDepartmentId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`MANAGER_ID`")
    @JsonIgnoreProperties({"employeesByManagerId", "employeesesForManagerId"})
    public Employees getEmployeesByManagerId() {
        return this.employeesByManagerId;
    }
    
    public void setEmployeesByManagerId(Employees employeesByManagerId) {
        this.employeesByManagerId = employeesByManagerId;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="employeesByManagerId")
    public Set<Employees> getEmployeesesForManagerId() {
        return this.employeesesForManagerId;
    }
    
    public void setEmployeesesForManagerId(Set<Employees> employeesesForManagerId) {
        this.employeesesForManagerId = employeesesForManagerId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`JOB_ID`", nullable=false)
    public Jobs getJobs() {
        return this.jobs;
    }
    
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="employeesByManagerId")
    public Set<Departments> getDepartmentsesForManagerId() {
        return this.departmentsesForManagerId;
    }
    
    public void setDepartmentsesForManagerId(Set<Departments> departmentsesForManagerId) {
        this.departmentsesForManagerId = departmentsesForManagerId;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Employees) )
		    return false;

		 Employees that = (Employees) o;

		 return ( (this.getEmployeeId()==that.getEmployeeId()) || ( this.getEmployeeId()!=null && that.getEmployeeId()!=null && this.getEmployeeId().equals(that.getEmployeeId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getEmployeeId() == null ? 0 : this.getEmployeeId().hashCode() );

         return result;
    }


}
