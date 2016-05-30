/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.TenusClient;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class TenusClientDao extends MyDao<bf.gov.finances.dgsi.appbc.entites.TenusClient> {
    
    public TenusClientDao() {
        super(TenusClient.class);
    }
    public TenusClient findByCode(String codeTenus){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (TenusClient)em.createNamedQuery("TenusClient.findBycodeTenusClient").setParameter("cdTenusClient", codeTenus).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
}
