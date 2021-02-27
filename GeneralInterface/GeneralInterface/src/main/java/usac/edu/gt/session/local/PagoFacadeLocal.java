/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session.local;

import javax.ejb.Local;
import usac.edu.gt.entity.Pago;

/**
 *
 * @author romar
 */
@Local
public interface PagoFacadeLocal {
    Pago find(Object id);
    
    void create(Pago pago);

    void edit(Pago pago);

    void remove(Pago pago);
    
    public void insertar(Pago pago) throws Exception;
}
