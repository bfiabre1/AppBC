/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.controllers;

import bf.gov.finances.dgsi.appbc.entites.Ville;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import bf.gov.finances.dgsi.appbc.services.VilleServiceClt;
import bf.gov.finances.dgsi.appbc.utils.MyUtil;

/**
 *
 * @author DGSI
 */
@ManagedBean(name = "villeControllerClt")
@SessionScoped
public class VilleControllerClt extends AbstractControllerFactA<Ville,VilleServiceClt> implements Serializable{
    @Inject
     VilleServiceClt ejbFacade;
      int nbelt=0;

    public int getNbelt() {
        return nbelt;
    }

    public void setNbelt(int nbelt) {
        this.nbelt = nbelt;
    }
     
   
    @Override
    public VilleServiceClt getFacade() {
        return ejbFacade;
    }
    
    @Override
    public void initializer(){
        selected=new Ville();
        System.out.print("Coucou2");
    }
    public void recherchera(){
    if (selected==null)
           initializer();
     else
         rechercher(selected.getCodeVille());
    }
    
    //Méthode pour gérer la recherche des pays par code
    @Override
    public Ville findByCode(String codeVille){
        return getFacade().findBycode(codeVille);
    }
   public boolean afficherListe(){
       if (getListe()==null) {System.out.print("Liste Vide");return false; }
       else return true;
   }
    
}
