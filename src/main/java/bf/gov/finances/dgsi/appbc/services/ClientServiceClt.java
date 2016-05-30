/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.appbc.services;

import bf.gov.finances.dgsi.appbc.dao.ClientDao;
import bf.gov.finances.dgsi.appbc.entites.Client;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author DGSI
 */
@Stateless
public class ClientServiceClt extends AbstracServiceFact<Client>{
    @Inject
    ClientDao dao;
   
    @Override
    public ClientDao getDao() {
        return dao;
    }

    public ClientServiceClt() {
    }
    public Client findBycode(String code ){
       return dao.findByCode(code);
    }

    
}
