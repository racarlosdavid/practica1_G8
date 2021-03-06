/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import usac.edu.gt.entity.Pago;
import usac.edu.gt.session.local.PagoFacadeLocal;
import usac.edu.gt.entity.Pago;
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
    
    @Override
    public double calcularServicio(double cantidad){
        double total=0;
        if (cantidad<0){
            System.out.println("Error, debe ingresar un numero positivo");
        }else{
            total=cantidad+(cantidad*0.1);
        }
        
        return total;
    } 
    
    @Override
    public double PagoIVA(double dato)
    {
        double iva = dato*0.12;
        
        double totalsiva = dato-iva;
        
        System.out.println("Precio: " + dato);
        System.out.println("IVA: " + iva);
        System.out.println("Total sin IVA:" + totalsiva);
        
        return iva;
    }
    
    @Override
    public double subtotales(List<Pago> lpago){
        double subtotal =0;
        for(Pago pag : lpago){
            subtotal+=pag.getTotal();
        }
        System.out.println("Total: "+subtotal);
        return subtotal;
    }
    public double restarCincoPorciento(double cantidad1,double cantidad2, double cantidad3){
        double resultado = cantidad1 + cantidad2;
        resultado = resultado + cantidad3;
        resultado = resultado - (resultado * 0.05);
        return resultado;
    }
    
    @Override
    public double Pago(double recibido, Pago p) {
        System.out.println("double recibido "+recibido);
        System.out.println("Total "+p.getTotal());
        return recibido + Pago.getTotal();
    }
    
    public double RestaTotales(Pago pago1,Pago pago2){
        double result= pago1.getTotal() - pago2.getTotal();
        if(result>0){
            return result;
        }else{
            System.err.println("ERROR: la resta de los totales no fue positivo");
            return 0;
        }
    }
    
    @Override
    public void crearPago(PagoFacade pago) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.create(pago);
        userTransaction.commit(); 

    }
}
