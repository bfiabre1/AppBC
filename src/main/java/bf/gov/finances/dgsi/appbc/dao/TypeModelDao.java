/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

import bf.gov.finances.dgsi.appbc.entites.TypeModel;
import javax.ejb.Stateless;

/**
 *
 * @author DGSI
 */
@Stateless
public class TypeModelDao extends MyDao<TypeModel> {

    public TypeModelDao() {
        super(TypeModel.class);
    }
     public TypeModel findByCode(String codeTypeModel){
        //final CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
        //criteriaQuery.select(criteriaQuery.from(Pays.class));
       return (TypeModel)em.createNamedQuery("TypeModel.findBycodeTypeModel").setParameter("cdTypeModel", codeTypeModel).getSingleResult();
      //  return (Pays)em.createQuery("SELECT a FROM pays a WHERE a.codePays = ?").setParameter(1, codepays).getSingleResult();
        
    }
}
