/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades;

/**
 *
 * @author sebas
 */
public class DetalleFactura {

    private String detalle;
    private float monto;

    public DetalleFactura(String detalle, float monto) {
        this.detalle = detalle;
        this.monto = monto;
    }

    public void setMonto(float monto){
        this.monto = monto;
    }

    public void setDetalle(String detalle){
        this.detalle = detalle;
    }

    public float getMonto(){
        return this.monto;
    }

    public String getDetalle(){
        return this.detalle;
    }
}