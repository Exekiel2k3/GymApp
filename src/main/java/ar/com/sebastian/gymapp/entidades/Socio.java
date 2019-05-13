/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades;

import ar.com.sebastian.persona.entidad.Persona;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Socio extends Persona{

    private int idSocio;
    private DocumentoIdentidad documentoIdentidad;
    private List<Telefono> telefonos;
    private Domicilio domicilio;

    public Socio(int idSocio, DocumentoIdentidad documentoIdentidad, List<Telefono> telefonos, Domicilio domicilio, String primerNombre, String segundoNombre, String apellido, String fechaNacimiento) {
        super(primerNombre, segundoNombre, apellido, fechaNacimiento);
        this.idSocio = idSocio;
        this.documentoIdentidad = documentoIdentidad;
        this.telefonos = telefonos;
        this.domicilio = domicilio;
    }
    
    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
