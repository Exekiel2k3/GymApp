/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.validadores;

import ar.com.sebastian.gymapp.entidades.Domicilio;

/**
 *
 * @author sebas
 */
public class ValidateDomicilio extends Validator{
	
    Domicilio domicilio;
    
    public ValidateDomicilio(Domicilio dm){
        super();
        this.domicilio = dm;
    }

    private boolean validateCalle(){
        return this.domicilio.getCalle().isEmpty();
    }

    private boolean validateNumero(){
        return validateNumber("([0-9]){5}",this.domicilio.getNumero());
    }

    private boolean validateUnidad(){
        return validateNumber("([0-9]){4}",this.domicilio.getUnidad());
    }

    private boolean validatePiso(){
        return false;
    }

    @Override
    public boolean validate(){
        return (validateCalle() &&
                validateNumero() &&
                validatePiso() &&
                validateUnidad());
    }
}
