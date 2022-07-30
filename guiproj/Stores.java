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
@Table(name = "STORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stores.findAll", query = "SELECT s FROM Stores s")
    , @NamedQuery(name = "Stores.findByIdStore", query = "SELECT s FROM Stores s WHERE s.idStore = :idStore")
    , @NamedQuery(name = "Stores.findByStorePricePerYear", query = "SELECT s FROM Stores s WHERE s.storePricePerYear = :storePricePerYear")
    , @NamedQuery(name = "Stores.findByStorePriceToOwn", query = "SELECT s FROM Stores s WHERE s.storePriceToOwn = :storePriceToOwn")})
public class Stores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_STORE")
    private Integer idStore;
    @Column(name = "STORE_PRICE_PER_YEAR")
    private Integer storePricePerYear;
    @Column(name = "STORE_PRICE_TO_OWN")
    private Integer storePriceToOwn;
    @JoinColumn(name = "STORE_FLOOR", referencedColumnName = "FLOOR_ID")
    @ManyToOne(optional = false)
    private Floor storeFloor;

    public Stores() {
    }

    public Stores(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getStorePricePerYear() {
        return storePricePerYear;
    }

    public void setStorePricePerYear(Integer storePricePerYear) {
        this.storePricePerYear = storePricePerYear;
    }

    public Integer getStorePriceToOwn() {
        return storePriceToOwn;
    }

    public void setStorePriceToOwn(Integer storePriceToOwn) {
        this.storePriceToOwn = storePriceToOwn;
    }

    public Floor getStoreFloor() {
        return storeFloor;
    }

    public void setStoreFloor(Floor storeFloor) {
        this.storeFloor = storeFloor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStore != null ? idStore.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stores)) {
            return false;
        }
        Stores other = (Stores) object;
        if ((this.idStore == null && other.idStore != null) || (this.idStore != null && !this.idStore.equals(other.idStore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiproj.Stores[ idStore=" + idStore + " ]";
    }
    
}
