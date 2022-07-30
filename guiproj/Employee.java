/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproj;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ashraf Hamayel
 */
@Entity
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findByEmployeeName", query = "SELECT e FROM Employee e WHERE e.employeeName = :employeeName")
    , @NamedQuery(name = "Employee.findByEmployeeId", query = "SELECT e FROM Employee e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "Employee.findByEmployeePhone", query = "SELECT e FROM Employee e WHERE e.employeePhone = :employeePhone")
    , @NamedQuery(name = "Employee.findByEmployeeSalary", query = "SELECT e FROM Employee e WHERE e.employeeSalary = :employeeSalary")
    , @NamedQuery(name = "Employee.findByEmployeeSex", query = "SELECT e FROM Employee e WHERE e.employeeSex = :employeeSex")
    , @NamedQuery(name = "Employee.findByEmployeeAddress", query = "SELECT e FROM Employee e WHERE e.employeeAddress = :employeeAddress")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;
    @Column(name = "EMPLOYEE_PHONE")
    private Long employeePhone;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_SALARY")
    private long employeeSalary;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_SEX")
    private String employeeSex;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_ADDRESS")
    private String employeeAddress;
    @JoinColumn(name = "FLOOR_NUMBER", referencedColumnName = "FLOOR_ID")
    @ManyToOne(optional = false)
    private Floor floorNumber;

    public Employee() {
    }

    public Employee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Integer employeeId, String employeeName, long employeeSalary, String employeeSex, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeSex = employeeSex;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Floor getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Floor floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiproj.Employee[ employeeId=" + employeeId + " ]";
    }
    
}
