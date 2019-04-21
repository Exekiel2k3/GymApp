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
public class Telefono {
    
    private String numero;
    private String tipoTelefono;
    
    public Telefono(){
        this.numero = "";
        this.tipoTelefono = "";
    }

    public Telefono(String numero, String tipoTelefono){
        this.numero = numero;
        this.tipoTelefono = tipoTelefono;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getTipoTelefono(){
        return this.tipoTelefono;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTipoTelefono(String tipoTelefono){
        this.tipoTelefono = tipoTelefono;
    }
    
}
