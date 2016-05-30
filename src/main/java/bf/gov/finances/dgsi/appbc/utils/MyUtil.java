/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.utils;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author DGSI
 */
@Named(value ="myUtil" )
public class MyUtil {
   public static void ajoutMessageErreur(String msg){
       FacesMessage facemsg= new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
       FacesContext.getCurrentInstance().addMessage(null, facemsg);
   }
    public static void ajoutMessageErreur(Exception e,String msgdefaut){
       String msg= e.getLocalizedMessage();
        if (msg!=null && msg.length()>0)
            ajoutMessageErreur(msg);
        else  
          ajoutMessageErreur(msgdefaut);
    } 
     public static void ajoutMessageErreurs(List<String> messages){
         for (String message : messages){
             ajoutMessageErreur(message);
         }
     }
    public static void AjoutMessageSuccess(String msg){
         FacesMessage facemsg= new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
         FacesContext.getCurrentInstance().addMessage(null, facemsg);
    }
    public static SelectItem[] getSelectItems(List<?> entities, boolean selectOne){
       int size = selectOne ? entities.size() +1 : entities.size() ;
       SelectItem[] items = new SelectItem[size];
       int i=0;
       if (selectOne){
       items[0] = new SelectItem("","---");
       i++;
       }
       for (Object x : entities){
           items[i++] = new SelectItem(x,x.toString());
       }
       return items;
    }

public static String getRequestParameter(String key){
return  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
}
public static Object getObjectFromRequestParameter(String requestParameterName, Converter converter,UIComponent component){
    String theId=MyUtil.getRequestParameter(requestParameterName);
    return converter.getAsObject(FacesContext.getCurrentInstance(), component, theId);
}
}