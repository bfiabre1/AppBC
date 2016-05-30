/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.Model;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class ModelDao extends MyDao<Model> {
    
    public ModelDao() {
        super(Model.class);
    }
   public Model findByCode(String codeMod){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (Model)em.createNamedQuery("Model.findBycodeModel").setParameter("cdMod", codeMod).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    } 
}
