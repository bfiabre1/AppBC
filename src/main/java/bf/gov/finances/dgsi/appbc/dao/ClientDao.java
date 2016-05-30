/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.Client;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class ClientDao extends MyDao<Client>{

    public ClientDao() {
        super(Client.class);
    }
     public Client findByCode(String codeclient){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (Client)em.createNamedQuery("Client.findBycodeClient").setParameter("cdclient", codeclient).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
}
