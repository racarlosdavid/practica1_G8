/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import usac.edu.gt.entity.Pago;
import usac.edu.gt.session.local.PagoFacadeLocal;

/**
 *
 * @author romar
 */
@Stateless
public class PagoFacade extends AbstractFacade<Pago> implements PagoFacadeLocal{
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public PagoFacade() {
        super(Pago.class);
    }
    
    public double RestaTotales(Pago pago1,Pago pago2){
        return pago1.getTotal() - pago2.getTotal();
    }
}
