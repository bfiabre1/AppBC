/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DGSI
 */
@Entity
public class MesureChemise extends Mesures implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//     private String codeMesure; 
    private String epaule;
    private String poitrine;
    private String hanche;
    private String manche;
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCodeMesure() {
//        return codeMesure;
//    }
//
//    public void setCodeMesure(String codeMesure) {
//        this.codeMesure = codeMesure;
//    }

    public String getEpaule() {
        return epaule;
    }

    public void setEpaule(String epaule) {
        this.epaule = epaule;
    }

    public String getPoitrine() {
        return poitrine;
    }

    public void setPoitrine(String poitrine) {
        this.poitrine = poitrine;
    }

    public String getHanche() {
        return hanche;
    }

    public void setHanche(String hanche) {
        this.hanche = hanche;
    }

    public String getManche() {
        return manche;
    }

    public void setManche(String manche) {
        this.manche = manche;
    }
    
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof MesureChemise)) {
//            return false;
//        }
//        MesureChemise other = (MesureChemise) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "entites.MesureChemise[ id=" + id + " ]";
//    }
//    
}
