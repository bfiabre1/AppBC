/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.services;

import bf.gov.finances.dgsi.appbc.dao.PaysDao;
import bf.gov.finances.dgsi.appbc.entites.Pays;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author DGSI
 */
@Stateless
public class PaysServiceClt extends AbstracServiceFact<Pays>{
    @Inject
     PaysDao dao;

    @Override
    public PaysDao getDao() {
        return dao;
    }
     public Pays findBycode(String code ){
       return dao.findByCode(code);
    }

    public PaysServiceClt() {
        
    }

    
}
