/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.MesureChemise;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class MesureChemiseDao extends MyDao<MesureChemise> {
    
    public MesureChemiseDao() {
        super(MesureChemise.class);
    }
     public MesureChemise findByCode(String codeMes){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (MesureChemise)em.createNamedQuery("MesureChemise.findBycodeMesureChem").setParameter("cdmesChem", codeMes).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
}
