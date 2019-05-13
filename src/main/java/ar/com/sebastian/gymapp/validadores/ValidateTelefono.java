package ar.com.sebastian.gymapp.validadores;

import ar.com.sebastian.gymapp.entidades.Telefono;
import java.util.ArrayList;

public class ValidateTelefono{

    private Telefono telefono;
    private ArrayList<String> tiposTelefono;

    public ValidateTelefono(Telefono telefono, ArrayList<String> tiposTelefono) {
        this.telefono = telefono;
        this.tiposTelefono = tiposTelefono;
    }

    public boolean isValidNumber(){
        //([+(\d]{1})(([\d+() -.]){5,16})([+(\d]{1})
        return this.telefono.getNumero().matches("(([+(\\d]{1})(([\\d+() -.]){5,16})([+(\\d]{1}))");
    }

    public void setTiposTelefono(ArrayList<String> tiposTelefono){
        this.tiposTelefono = tiposTelefono;
    }

    public boolean isValidTypeTelephon(){
        return this.tiposTelefono.contains(this.telefono.getTipoTelefono());
    }
}