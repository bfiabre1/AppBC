/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.controllers;

import bf.gov.finances.dgsi.appbc.dao.PaysDao;
import bf.gov.finances.dgsi.appbc.entites.Pays;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Selection;
import bf.gov.finances.dgsi.appbc.services.AbstracServiceFact;
import bf.gov.finances.dgsi.appbc.services.PaysServiceClt;
import bf.gov.finances.dgsi.appbc.services.VilleServiceClt;

/**
 *
 * @author DGSI
 */
@ManagedBean(name = "paysControllerClt")
@SessionScoped
public class PaysControllerClt extends AbstractControllerFactA<Pays, PaysServiceClt> implements Serializable {
        @Inject
     PaysServiceClt ejbFacade; 

    public PaysServiceClt getEjbFacade() {
        return ejbFacade;
    }

    public PaysControllerClt() {
    }
     @Override
    public void initializer(){
        selected=new Pays();
        System.out.print("Coucou2");
    }
    public void recherchera(){
    if (selected==null)
           initializer();
     else
         rechercher(selected.getCodePays());
    }
    
    //Méthode pour gérer la recherche des pays par code
    @Override
    public Pays findByCode(String codePays){
        return getFacade().findBycode(codePays);
    }   
    public List<Pays> findByCodeB(){
       // Predicate p=Predicate.BooleanOperator
       
       // String ab = selected.getCodePays();
//        Predicate predicate =String.;
//       //Predicate j  codePays = selected.getCodePays();
//        String P_clause ="CodePays = " ;
//        P_clause.concat(selected.getCodePays()) ;
//        Expression<Boolean> b=
         
        return  null; 
    }
}
