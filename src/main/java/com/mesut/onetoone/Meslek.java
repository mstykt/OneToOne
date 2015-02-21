/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.onetoone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author mesut
 */
@Entity
public class Meslek implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer meslekId;
    private String meslekAdi;
    @OneToOne //Bu annotasyon kaldırılınca yine onetoone olur ancak unidirectional yani tek yönlü erişim olur
    private Personel personel;

    public Integer getMeslekId() {
        return meslekId;
    }

    public void setMeslekId(Integer meslekId) {
        this.meslekId = meslekId;
    }

    public String getMeslekAdi() {
        return meslekAdi;
    }

    public void setMeslekAdi(String meslekAdi) {
        this.meslekAdi = meslekAdi;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (meslekId != null ? meslekId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meslek)) {
            return false;
        }
        Meslek other = (Meslek) object;
        return (this.meslekId != null || other.meslekId == null) && (this.meslekId.equals(other.meslekId) || this.meslekId == null);
    }

    @Override
    public String toString() {
        return "com.mesut.onetoone.Meslek[ id=" + meslekId + " ]";
    }
    
}
