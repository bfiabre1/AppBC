/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.controllers;

import bf.gov.finances.dgsi.appbc.entites.Client;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import bf.gov.finances.dgsi.appbc.services.ClientServiceClt;

/**
 *
 * @author DGSI
 */
@ManagedBean(name="clientControllerClt")
@SessionScoped
public class ClientControllerClt extends AbstractControllerFactA<Client,ClientServiceClt> implements Serializable {
      @Inject
      ClientServiceClt ejbFacade;
      int nbelt=0;

    public int getNbelt() {
        return nbelt;
    }

    public void setNbelt(int nbelt) {
        this.nbelt = nbelt;
    }
     
   
    @Override
    public ClientServiceClt getFacade() {
        return ejbFacade;
    }
    
    @Override
    public void initializer(){
        selected=new Client();
        System.out.print("Coucou2");
    }
    public void recherchera(){
    if (selected==null)
           initializer();
     else
         rechercher(selected.getCodeClient());
    }
    
    //Méthode pour gérer la recherche des pays par code
    @Override
    public Client findByCode(String codeClient){
        return getFacade().findBycode(codeClient);
    }
   public boolean afficherListe(){
       if (getListe()==null) {System.out.print("Liste Vide");return false; }
       else return true;
   }
}
