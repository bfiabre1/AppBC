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
    @NamedQuery(name = "Client.findAll", query = "SELECT a FROM Client a"),
    @NamedQuery(name = "Client.findBycodeClient", query = "SELECT a FROM Client a WHERE a.codeClient = :cdclient")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomClt;
    private String prenomClt;
    private String telClt;
    private String codeClient;
    public String getNomClt() {
        return nomClt;
    }

    public void setNomClt(String nomClt) {
        this.nomClt = nomClt;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClt) {
        this.codeClient = codeClt;
    }
    
    public String getPrenomClt() {
        return prenomClt;
    }

    public void setPrenomClt(String prenomclt) {
        this.prenomClt = prenomclt;
    }

    public String getTelClt() {
        return telClt;
    }

    public void setTelClt(String telClt) {
        this.telClt = telClt;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Client[ id=" + id + " ]";
    }
    
}
