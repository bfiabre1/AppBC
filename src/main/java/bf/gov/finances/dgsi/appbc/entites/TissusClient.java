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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author DGSI
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "TissusClient.findAll", query = "SELECT a FROM TissusClient a"),
    @NamedQuery(name = "TissusClient.findBycodeClient", query = "SELECT a FROM TissusClient a WHERE a.codeTissus = :cdTissus")})

public class TissusClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codeTissus;
    private String couleurTissus;
    private String codeClientTissus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeTissus() {
        return codeTissus;
    }

    public void setCodeTissus(String codeTissus) {
        this.codeTissus = codeTissus;
    }

    public String getCouleurTissus() {
        return couleurTissus;
    }

    public void setCouleurTissus(String couleurTissus) {
        this.couleurTissus = couleurTissus;
    }

    public String getCodeClientTissus() {
        return codeClientTissus;
    }

    public void setCodeClientTissus(String codeClientTissus) {
        this.codeClientTissus = codeClientTissus;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TissusClient)) {
            return false;
        }
        TissusClient other = (TissusClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.TissusClient[ id=" + id + " ]";
    }
    
}
