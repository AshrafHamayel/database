/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproj;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ashraf Hamayel
 */
@Entity
@Table(name = "FLOOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Floor.findAll", query = "SELECT f FROM Floor f")
    , @NamedQuery(name = "Floor.findByFloorId", query = "SELECT f FROM Floor f WHERE f.floorId = :floorId")
    , @NamedQuery(name = "Floor.findByFloorSpace", query = "SELECT f FROM Floor f WHERE f.floorSpace = :floorSpace")})
public class Floor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FLOOR_ID")
    private Integer floorId;
    @Column(name = "FLOOR_SPACE")
    private Long floorSpace;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeFloor")
    private Collection<Stores> storesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "floorNumber")
    private Collection<Employee> employeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adFloor")
    private Collection<Advertising> advertisingCollection;

    public Floor() {
    }

    public Floor(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Long getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(Long floorSpace) {
        this.floorSpace = floorSpace;
    }

    @XmlTransient
    public Collection<Stores> getStoresCollection() {
        return storesCollection;
    }

    public void setStoresCollection(Collection<Stores> storesCollection) {
        this.storesCollection = storesCollection;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @XmlTransient
    public Collection<Advertising> getAdvertisingCollection() {
        return advertisingCollection;
    }

    public void setAdvertisingCollection(Collection<Advertising> advertisingCollection) {
        this.advertisingCollection = advertisingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (floorId != null ? floorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Floor)) {
            return false;
        }
        Floor other = (Floor) object;
        if ((this.floorId == null && other.floorId != null) || (this.floorId != null && !this.floorId.equals(other.floorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiproj.Floor[ floorId=" + floorId + " ]";
    }
    
}
