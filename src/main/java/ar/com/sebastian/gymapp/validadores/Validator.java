/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.validadores;

/**
 *
 * @author sebas
 */
public abstract class Validator {
        
    public Validator(){
    }

    public abstract boolean validate();

    public boolean validateNumber(String regex, String number){
        return number.matches(regex);
    }
    
    public boolean isEmty(String string){
        return string.isEmpty();
    }
}
