/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.mgdbean;

/**
 *
 * @author Pablo
 */
@Named
@RequestScoped
public class registroProducto {
    private String nombreProducto;
    
    @PostConstructpr
    public void init(){
        nombreProducto="Producto";
    }
    
    @PreDestroy
    public void destroy(){
    }
    
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void setNombreProducto(String nomprod){
        this.nombreProducto=nomprod;
    }

}
