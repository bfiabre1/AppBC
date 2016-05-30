/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.Pays;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class PaysDao extends MyDao<Pays> {
    
    public PaysDao() {
        super(Pays.class);
    }
    public Pays findByCode(String codeville){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (Pays)em.createNamedQuery("Pays.findBycodePays").setParameter("cdpays", codeville).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
    
    
}
