/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.services;

//import dao.VilleDao;
import bf.gov.finances.dgsi.appbc.dao.VilleDao1;
import bf.gov.finances.dgsi.appbc.entites.Ville;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author DGSI
 */
@Stateless
public class VilleServiceClt extends AbstracServiceFact<Ville> {
    @Inject
     VilleDao1 dao;

    @Override
    public VilleDao1 getDao() {
        return dao;
    }
     public Ville findBycode(String code ){
       return dao.findByCode(code);
    }

    public VilleServiceClt() {
    }
     
}
