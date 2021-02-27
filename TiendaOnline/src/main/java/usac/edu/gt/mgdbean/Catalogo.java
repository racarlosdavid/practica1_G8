/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.mgdbean;

@Named
@RequestScoped
public class Catalogo {
    private String nombreAplicacion;
    
    @EJB
    Private CatalogoFacadeLocal catalogoFacadeLocal;
    
    public void init(){
        nombreAplicacion="Catalogo";
    }
    
    public void destroy(){
    }
    
    public String getNombreAplicacion(){
        return nombreAplicacion;
    }
    public void setNombreAplicacion(String x1){
        this.nombreAplicacion=x1;
    }
}

