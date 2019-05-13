/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.DocumentoIdentidad;
import ar.com.sebastian.gymapp.entidades.Domicilio;
import ar.com.sebastian.gymapp.entidades.Socio;
import ar.com.sebastian.gymapp.entidades.Telefono;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class SocioTest {
    
    private final Socio socio;
    private final DocumentoIdentidad documentoIdentidad = new DocumentoIdentidad(DOCUMENTO_IDENTIDAD);
    private final Domicilio domicilio = new Domicilio(CALLE, NUMERO_CALLE, PISO, UNIDAD);
    private final ArrayList<Telefono> telefonos = new ArrayList<>();
    
    private static final String FECHA_NACIMIENTO = "1984/03/15";
    private static final String APELLIDO = "Scardigno";
    private static final String SEGUNDO_NOMBRE = "Ezequiel";
    private static final String PRIMER_NOMBRE = "Sebastian";
    private static final String UNIDAD = "12";
    private static final int PISO = 8;
    private static final String NUMERO_CALLE = "456";
    private static final String CALLE = "Puan";
    private static final String LABORAL = "Laboral";
    private static final String PERSONAL = "Personal";
    private static final String NUMERO_TEL_1 = "20202020";
    private static final String NUMERO_TEL_2 = "21212121";
    private static final String DOCUMENTO_IDENTIDAD = "30924968";
    private static final int ID_SOCIO = 1234;
    
    public SocioTest() {
        
        telefonos.add(new Telefono(NUMERO_TEL_1, PERSONAL));
        telefonos.add(new Telefono(NUMERO_TEL_2, LABORAL));
        
        socio = new Socio(ID_SOCIO, documentoIdentidad, 
                telefonos, domicilio, 
                PRIMER_NOMBRE, SEGUNDO_NOMBRE, APELLIDO, FECHA_NACIMIENTO);
    }
    
    /**
     * Test of getIdSocio method, of class Socio.
     */
    @Test
    public void testGetIdSocio() {
        System.out.println("getIdSocio");
        Socio instance = socio;
        int expResult = ID_SOCIO;
        int result = instance.getIdSocio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdSocio method, of class Socio.
     */
    @Test
    public void testSetIdSocio() {
        System.out.println("setIdSocio");
        int _idSocio = 2220019;
        Socio instance = socio;
        instance.setIdSocio(_idSocio);
        assertEquals(_idSocio, socio.getIdSocio());
    }

    /**
     * Test of getDocumentoIdentidad method, of class Socio.
     */
    @Test
    public void testGetDocumentoIdentidad() {
        System.out.println("getDocumentoIdentidad");
        Socio instance = socio;
        DocumentoIdentidad expResult = documentoIdentidad;
        DocumentoIdentidad result = instance.getDocumentoIdentidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDocumentoIdentidad method, of class Socio.
     */
    @Test
    public void testSetDocumentoIdentidad() {
        System.out.println("setDocumentoIdentidad");
        DocumentoIdentidad _documentoIdentidad = new DocumentoIdentidad("30555331");
        Socio instance = socio;
        instance.setDocumentoIdentidad(_documentoIdentidad);
        assertEquals(_documentoIdentidad, socio.getDocumentoIdentidad());
    }

    /**
     * Test of getTelefonos method, of class Socio.
     */
    @Test
    public void testGetTelefonos() {
        System.out.println("getTelefonos");
        Socio instance = socio;
        List<Telefono> expResult = telefonos;
        List<Telefono> result = instance.getTelefonos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefonos method, of class Socio.
     */
    @Test
    public void testSetTelefonos() {
        System.out.println("setTelefonos");
        List<Telefono> _telefonos = new ArrayList<>();
        _telefonos.add(new Telefono(NUMERO_TEL_2, LABORAL));
        Socio instance = socio;
        instance.setTelefonos(_telefonos);
        assertEquals(_telefonos, socio.getTelefonos());
    }

    /**
     * Test of getDomicilio method, of class Socio.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Socio instance = socio;
        Domicilio expResult = domicilio;
        Domicilio result = instance.getDomicilio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDomicilio method, of class Socio.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        Domicilio _domicilio = new Domicilio("Acoyte", "332", 1, "1");
        Socio instance = socio;
        instance.setDomicilio(_domicilio);
        assertEquals(_domicilio, socio.getDomicilio());
    }   
}