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
public class Domicilio {
    
    private String calle;
    private String numero;
    private int piso;
    private String unidad;

    public Domicilio(){
        this.calle = "";
        this.numero = "";
        this.piso = 0;
        this.unidad = "";		
    }

    public Domicilio(String calle, String numero, int piso, String unidad){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.unidad = unidad;		
    }

    public void setCalle(String calle){
        this.calle = calle;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setPiso(int piso){
        this.piso = piso;
    }

    public void setUnidad(String unidad){
        this.unidad = unidad;
    }

    public String getCalle(){
        return this.calle;
    }

    public String getNumero(){
        return this.numero;
    }

    public int getPiso(){
        return this.piso;
    }

    public String getUnidad(){
        return this.unidad;
    }
}