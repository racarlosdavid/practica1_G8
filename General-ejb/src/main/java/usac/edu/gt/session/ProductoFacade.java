/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author cristianhp
 */
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal {
    @Resource
    private EJBContext ejbContext;
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;
    @Override
    public void insertarproducto(ProductoFacade productito) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.create(productito);
        userTransaction.commit(); 

    }
    
    @Override
    public void editarproducto(ProductoFacade productito) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.edit(productito);
        userTransaction.commit(); 

    }
}
