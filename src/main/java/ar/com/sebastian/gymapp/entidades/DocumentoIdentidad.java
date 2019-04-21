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
public class DocumentoIdentidad {
    
    public String numero;

    public DocumentoIdentidad(String numero) {
        this.numero = numero;
    }

    public DocumentoIdentidad() {
        this.numero = "";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    } 
}
