/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.entity;

import java.util.LinkedList;

/**
 *
 * @author iDavi
 */
@Entity
public class Pago {
    LinkedList<String> listaProductos;
    double total;
    double correlativo;
    String observaciones;

    public LinkedList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(double correlativo) {
        this.correlativo = correlativo;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
