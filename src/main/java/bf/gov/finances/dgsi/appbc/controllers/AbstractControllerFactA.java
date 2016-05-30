/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.controllers;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.persistence.criteria.Expression;
import bf.gov.finances.dgsi.appbc.services.AbstracServiceFact;
import bf.gov.finances.dgsi.appbc.utils.MyUtil;

/**
 *
 * @author DGSI
 */
public class AbstractControllerFactA<T extends Serializable, Fact extends AbstracServiceFact> {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DGSI
 */

    boolean v=false;  // booléen qui est uliser pour gérer le boutons rechercher
    boolean h=false;  // booléen utiliser pour gérer le boutons enregistrer 
    private boolean k=false; //booléen utiliser pour gérer les maj (créer et éditer)
    boolean m=false; // booléen pour gérer le bouton supprimer
     boolean n=false;  // booléen pour gérer le bouton pour gérer le bouton supprimer
    T  selected;
     // Fact ejbFacade;
     private List liste=null;
    public Fact getFacade() {
        return null;
    }

    public List<T> getListe() {
        // if (liste==null)
          return getFacade().findAll();
      // return liste; 
    }
   
    public T find(Object id){
        selected=(T)getFacade().find(id);
        return selected;
    } 
    
    public T getSelected() {
        return selected;
    }

    public void setSelected(T selected) {
        this.selected = selected;
    }
    
    public boolean isV() {
        return v;
    }

    public boolean isK() {
        return k;
    }

    public boolean isM() {
        return m;
    }

    public void setM(boolean m) {
        this.m = m;
    }

    public boolean isN() {
        return n;
    }

    public void setN(boolean n) {
        this.n = n;
    }
    
    public void setK(boolean k) {
        this.k = k;
    }
    
    public boolean isH() {
        return h;
    }

    public void setH(boolean h) {
        this.h = h;
    }
    
    //  private MyUtil myUtil;
    public void setV(boolean v) {
        this.v = v;
    } 
    
    public void afficherBtSupprimer(){
     if (selected==null){
        initializer();
        m=true;
        n=true; 
        //v=false;
     } else if ((selected!=null)&&(n==true)){
         persister("DELETE");
         m=false;
        n=false; 
     } 
    }
    public boolean afficherBtSupp(){
        if (selected==null) {
            return true;
        } else if ((selected!=null)&&(n==true) &&(m==false)){
            return true;
        } else return false;
    }
    public void afficherBtNouveau(){
        initializer();
        // ces trois variables permettre de gérer les cas où il n'y a le bouton enregistrer, annuler
        v=true;
        h=true;
        k=true;
        n=false;
        
        
    }
    public boolean afficherBtRechercher(){
       if (selected==null)
          return true;    
       else if((selected!=null) && (v==false))
          return true;
        else
          return false;
    } 
    
    // Méthode utilisé pour  gérer l'affichage du bouton modifier 
    public void afficherBtModif(){
        initializer();
        v=false;
        h=true;
        n=false;
    }
     // Méthode utilisé pour  gérer l'affichage du bouton enregistrerer 
    public boolean afficherBtEnregistrer(){
       if((selected!=null) && (v==true) &&(h==true))
          return true;
        else
          return false;
    } 
    public void initializer(){
        
    }
    //private List<Pays> listePays=null; 
    
    //
     public String fermer(){
        selected=null;
        return "/index";
    }
    public void annuler(){    
       // selected1.setCodePays("A");
       selected=null;
       v=false;
       h=false;
       k=false;
        //return "/pays/frmPays";
    }
   //
    
    //Méthode pour créer l'ajout des pays par code
    public void  persist(){
        System.out.println("ici ");
        persister("CREATE");
        v=false;
        k=false;
       // return "/ville/frmVille";
    }
    //Méthode pour mettre à jour les pays
    public void maj(){
         // System.out.println("ici MAJ  ");
        if ((k==true)&&(v==true)&&(h==true)){
         persist();
         //System.out.println("ici MAJ persist  ");
         h=false;
        } else{
          edit();
          h=false;
        }
            
    }
    //Méthode pour mettre à jour l'édition des pays//Méthode pour mettre à jour les pays
    public void edit(){
        persister("EDIT");
         v=false;
    }
    
   
    public void ajouter(){
        getFacade().persist(selected);
    }
    
    public void supprimer(){
        getFacade().remove(selected);
    }
    
    public void modifier(){
        getFacade().edit(selected);
    } 
    
   public T findByCode(String code){
        return null;
    }
    
   public void rechercher(String code){
        if (selected==null){
            initializer();
        System.out.print("vf" + selected.toString());
        }
            //return false;
        else{
            try{
            selected=findByCode(code); 
            v=true;
           if(n==true) {h=false; m=false; System.out.print("Suppression OK");}  // pour que le bouton supprimer s'affiche après la recherche
            } catch(Exception e){
                MyUtil.ajoutMessageErreur("Aucun Enregistrement trouvé");
            }
            
        }
   }
    
    public void persister(String action){
        System.out.println("ici AZ  "+selected.toString());
        if (selected!=null){
         try{ 
             if (action.equalsIgnoreCase("DELETE")){
              // getFacade().remove(selected1);
              supprimer();
               selected=null;
               MyUtil.AjoutMessageSuccess("Suppression Effectuée avec Succès");
             }
             else if(action.equalsIgnoreCase("CREATE")){
                // System.out.println("ici 2" + selected.getCodePays());
            //getFacade().persist(selected1);
            ajouter();
            liste=getListe();
            System.out.println("ici 4");
            //initialization();
            MyUtil.AjoutMessageSuccess("Enregistrement Effectué avec Succès");
            selected=null;
             }
            else{
                   // getFacade().edit(selected);
                   modifier();
            System.out.println("ici A4");
            MyUtil.AjoutMessageSuccess("Modification Effectuée avec Succès");
                 selected = null;
                    }
               
             
         }catch (EJBException ex){
             //System.out.println("ici 3");
             String msg ="";
             Throwable cause = ex.getCause();
             if (cause!=null){
                 msg= cause.getLocalizedMessage();
             }
             if (msg.length()>0)
                 MyUtil.ajoutMessageErreur(msg);
              else
                 MyUtil.ajoutMessageErreur(ex, "Erreur de Persistence des données");
             } catch(Exception e){
                 Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null,e);
                 MyUtil.ajoutMessageErreur(e, "Erreur de Persistence des données");
             }
         }
      //  System.out.print("AFIN");
        }
public List<T> findByCodeA( Expression<Boolean> p){
    return getFacade().findByCodeA(p);
}
}
