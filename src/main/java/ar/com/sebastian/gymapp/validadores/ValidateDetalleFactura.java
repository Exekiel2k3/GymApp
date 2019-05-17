/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.validadores;

import ar.com.sebastian.gymapp.entidades.DetalleFactura;

/**
 *
 * @author sebas
 */
public class ValidateDetalleFactura extends Validator{

    private DetalleFactura detalleFactura;
    
    public ValidateDetalleFactura(DetalleFactura df){
        super();
        this.detalleFactura = df;
    }

    private boolean validateDetalle(){
        return this.detalleFactura.getDetalle().isEmpty();
    }

    @Override
    public boolean validate(){
        return validateDetalle();
    }
}
