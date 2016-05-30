/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.Mesures;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 s*/
@Stateless
public class MesuresDao extends MyDao<Mesures> {
    
    public MesuresDao() {
        super(Mesures.class);
    }
    public Mesures findByCode(String codeMes){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (Mesures)em.createNamedQuery("Mesures.findBycodeMesures").setParameter("cdmes", codeMes).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
    
}
