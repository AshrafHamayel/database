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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ashraf Hamayel
 */
@Entity
@Table(name = "TENANT_OWNER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TenantOwner.findAll", query = "SELECT t FROM TenantOwner t")
    , @NamedQuery(name = "TenantOwner.findByTenantOwnerName", query = "SELECT t FROM TenantOwner t WHERE t.tenantOwnerName = :tenantOwnerName")
    , @NamedQuery(name = "TenantOwner.findByTenantOwnerId", query = "SELECT t FROM TenantOwner t WHERE t.tenantOwnerId = :tenantOwnerId")
    , @NamedQuery(name = "TenantOwner.findByTenantOwnerPhone", query = "SELECT t FROM TenantOwner t WHERE t.tenantOwnerPhone = :tenantOwnerPhone")
    , @NamedQuery(name = "TenantOwner.findByIdStore", query = "SELECT t FROM TenantOwner t WHERE t.idStore = :idStore")
    , @NamedQuery(name = "TenantOwner.findByAddress", query = "SELECT t FROM TenantOwner t WHERE t.address = :address")
    , @NamedQuery(name = "TenantOwner.findBySex", query = "SELECT t FROM TenantOwner t WHERE t.sex = :sex")
    , @NamedQuery(name = "TenantOwner.findByStoreType", query = "SELECT t FROM TenantOwner t WHERE t.storeType = :storeType")
    , @NamedQuery(name = "TenantOwner.findByContractStartDate", query = "SELECT t FROM TenantOwner t WHERE t.contractStartDate = :contractStartDate")
    , @NamedQuery(name = "TenantOwner.findByContractEndDate", query = "SELECT t FROM TenantOwner t WHERE t.contractEndDate = :contractEndDate")})
public class TenantOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "TENANT_OWNER_NAME")
    private String tenantOwnerName;
    @Basic(optional = false)
    @Column(name = "TENANT_OWNER_ID")
    private int tenantOwnerId;
    @Column(name = "TENANT_OWNER_PHONE")
    private Long tenantOwnerPhone;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_STORE")
    private Integer idStore;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "SEX")
    private String sex;
    @Basic(optional = false)
    @Column(name = "STORE_TYPE")
    private String storeType;
    @Basic(optional = false)
    @Column(name = "CONTRACT_START_DATE")
    private String contractStartDate;
    @Basic(optional = false)
    @Column(name = "CONTRACT_END_DATE")
    private String contractEndDate;

    public TenantOwner() {
    }

    public TenantOwner(Integer idStore) {
        this.idStore = idStore;
    }

    public TenantOwner(Integer idStore, String tenantOwnerName, int tenantOwnerId, String address, String sex, String storeType, String contractStartDate, String contractEndDate) {
        this.idStore = idStore;
        this.tenantOwnerName = tenantOwnerName;
        this.tenantOwnerId = tenantOwnerId;
        this.address = address;
        this.sex = sex;
        this.storeType = storeType;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }

    public String getTenantOwnerName() {
        return tenantOwnerName;
    }

    public void setTenantOwnerName(String tenantOwnerName) {
        this.tenantOwnerName = tenantOwnerName;
    }

    public int getTenantOwnerId() {
        return tenantOwnerId;
    }

    public void setTenantOwnerId(int tenantOwnerId) {
        this.tenantOwnerId = tenantOwnerId;
    }

    public Long getTenantOwnerPhone() {
        return tenantOwnerPhone;
    }

    public void setTenantOwnerPhone(Long tenantOwnerPhone) {
        this.tenantOwnerPhone = tenantOwnerPhone;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
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
        if (!(object instanceof TenantOwner)) {
            return false;
        }
        TenantOwner other = (TenantOwner) object;
        if ((this.idStore == null && other.idStore != null) || (this.idStore != null && !this.idStore.equals(other.idStore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiproj.TenantOwner[ idStore=" + idStore + " ]";
    }
    
}
