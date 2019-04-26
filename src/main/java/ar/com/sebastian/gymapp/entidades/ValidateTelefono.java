package ar.com.sebastian.gymapp.validador;

import ar.com.sebastian.gymapp.entidades.Telefono;

public class ValidateTelefono{

	private Telefono telefono;
	private ArrayList<String> tiposTelefono;

	public ValidateTelefono(Telefono telefono){
		this.telefono = telefono;
	}
	
	public validateNumero(){
		//([+(\d]{1})(([\d+() -.]){5,16})([+(\d]{1})
		this.telefono.getNumero().matches("([+(\d]{1})(([\d+() -.]){5,16})([+(\d]{1})");
	}
	
	public validateTipoTelefono(){
		
	}
	
}
