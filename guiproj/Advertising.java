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
@Table(name = "ADVERTISING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advertising.findAll", query = "SELECT a FROM Advertising a")
    , @NamedQuery(name = "Advertising.findByAdOwner", query = "SELECT a FROM Advertising a WHERE a.adOwner = :adOwner")
    , @NamedQuery(name = "Advertising.findByAdPrice", query = "SELECT a FROM Advertising a WHERE a.adPrice = :adPrice")
    , @NamedQuery(name = "Advertising.findByAdTime", query = "SELECT a FROM Advertising a WHERE a.adTime = :adTime")
    , @NamedQuery(name = "Advertising.findByAdStartDate", query = "SELECT a FROM Advertising a WHERE a.adStartDate = :adStartDate")
    , @NamedQuery(name = "Advertising.findByAdId", query = "SELECT a FROM Advertising a WHERE a.adId = :adId")})
public class Advertising implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "AD_OWNER")
    private String adOwner;
    @Basic(optional = false)
    @Column(name = "AD_PRICE")
    private int adPrice;
    @Basic(optional = false)
    @Column(name = "AD_TIME")
    private String adTime;
    @Basic(optional = false)
    @Column(name = "AD_START_DATE")
    private String adStartDate;
    @Id
    @Basic(optional = false)
    @Column(name = "AD_ID")
    private Integer adId;
    @JoinColumn(name = "AD_FLOOR", referencedColumnName = "FLOOR_ID")
    @ManyToOne(optional = false)
    private Floor adFloor;

    public Advertising() {
    }

    public Advertising(Integer adId) {
        this.adId = adId;
    }

    public Advertising(Integer adId, String adOwner, int adPrice, String adTime, String adStartDate) {
        this.adId = adId;
        this.adOwner = adOwner;
        this.adPrice = adPrice;
        this.adTime = adTime;
        this.adStartDate = adStartDate;
    }

    public String getAdOwner() {
        return adOwner;
    }

    public void setAdOwner(String adOwner) {
        this.adOwner = adOwner;
    }

    public int getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(int adPrice) {
        this.adPrice = adPrice;
    }

    public String getAdTime() {
        return adTime;
    }

    public void setAdTime(String adTime) {
        this.adTime = adTime;
    }

    public String getAdStartDate() {
        return adStartDate;
    }

    public void setAdStartDate(String adStartDate) {
        this.adStartDate = adStartDate;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Floor getAdFloor() {
        return adFloor;
    }

    public void setAdFloor(Floor adFloor) {
        this.adFloor = adFloor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adId != null ? adId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advertising)) {
            return false;
        }
        Advertising other = (Advertising) object;
        if ((this.adId == null && other.adId != null) || (this.adId != null && !this.adId.equals(other.adId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiproj.Advertising[ adId=" + adId + " ]";
    }
    
}
