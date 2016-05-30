/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.dao;

//import com.sun.xml.internal.org.jvnet.fastinfoset.RestrictedAlphabet;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

/**
 *
 * @author DGSI
 */
//@Stateless
public class MyDao <T extends  Serializable> implements Serializable{
    private static final long serialVersionUID = 1L;

	private final Class<T> clazz;

    //@SuppressWarnings("cdi-ambiguous-dependency")
    @PersistenceContext(unitName="AppBCPU")
     EntityManager em;
    CriteriaBuilder cb;

    public MyDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T find(Object id) {
        return em.find(clazz, id);
    }

    public void remove(T entity) {
        em.remove(em.merge(entity));
        em.flush();
    }

    public T edit(T entity) {
        System.out.print("Lab");
        T t = em.merge(entity);
        System.out.print("Lab1");
        em.flush();
        return t;
    }

    public void persist(T entity) {
        em.persist(entity);
    }
    

    public List<T> findAll() {
        final CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(clazz);
        criteriaQuery.select(criteriaQuery.from(clazz));
        return em.createQuery(criteriaQuery).getResultList();
    }

    public void deleteAll() {
        final CriteriaDelete<T> criteriaDelete = em.getCriteriaBuilder().createCriteriaDelete(clazz);
        criteriaDelete.from(clazz);
        em.createQuery(criteriaDelete).executeUpdate();
    }

    protected EntityManager getEntityManager() {
        return em;
    }

    protected Class<T> getClazz() {
        return clazz;
    }
    
    public CriteriaBuilder getCb(){
        return em.getCriteriaBuilder();
    }
     public List<T> findByCodeA( Expression<Boolean> p) {
        
        final CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(clazz);
        criteriaQuery.select(criteriaQuery.from(clazz)).where(p);
         
        return em.createQuery(criteriaQuery).getResultList();
    }
}
