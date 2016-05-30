/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.TissusClient;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class TissusClientDao extends MyDao<bf.gov.finances.dgsi.appbc.entites.TissusClient> {
    
    public TissusClientDao() {
        super(TissusClient.class);
    }
     public TissusClient findByCode(String codeTissus){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (TissusClient)em.createNamedQuery("TissusClient.findBycodeTissusClient").setParameter("cdTissusClient", codeTissus).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
}
