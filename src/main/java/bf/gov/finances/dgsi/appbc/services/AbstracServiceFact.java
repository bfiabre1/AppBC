/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.services;

import bf.gov.finances.dgsi.appbc.dao.MyDao;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.criteria.Expression;

/**
 *
 * @author DGSI
 */
public class AbstracServiceFact<T extends Serializable > {
   
   // MyDao dao;
    public MyDao getDao(){
        return null;
    }
    public void remove( T p){
        getDao().remove(p);
    }
    public void deleteAll( T p){
        getDao().deleteAll();
    }
     public T find( Object id ){
       return (T)getDao().find(id);
    } 
      public void persist(T p){
        getDao().persist(p);
    }
       public List<T> findAll(){
        return getDao().findAll();
    }
     public void edit( T p){
         getDao().edit(p);
     }
    public List<T> findByCodeA(Expression<Boolean> p){
      return  getDao().findByCodeA(p);
    }
}
