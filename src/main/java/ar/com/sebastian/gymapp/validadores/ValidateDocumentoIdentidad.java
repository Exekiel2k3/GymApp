/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.validadores;

import ar.com.sebastian.gymapp.entidades.DocumentoIdentidad;

/**
 *
 * @author sebas
 */
public class ValidateDocumentoIdentidad extends Validator{

    DocumentoIdentidad documentoIdentidad;
            
    public ValidateDocumentoIdentidad(DocumentoIdentidad di){
        super();
        this.documentoIdentidad = di;
    }

    private boolean validateNumero(){
        return validateNumber("([0-9]){8}",this.documentoIdentidad.getNumero());
    }

    @Override
    public boolean validate(){
        return validateNumero();
    }
}
