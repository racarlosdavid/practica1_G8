/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

/**
 *
 * @author Sebastian
 */
public class operacionesBasicas {
    
    public int suma(int x, int y){
        int resultado=x+y;
        return resultado;
    }
    
    public int multiplica(int dato1, int dato2)
    {
      int resultado = dato1 * dato2;
      return resultado;
    }
    
    public int resta(int x, int y){ 
        int resultado=x-y; return resultado;
    }
    
    public String concatenar(String x, String y){
        String resultado=x+y;
        return resultado;
    }
    
}
