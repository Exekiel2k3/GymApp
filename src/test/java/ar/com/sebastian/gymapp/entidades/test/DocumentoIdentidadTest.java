/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.DocumentoIdentidad;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class DocumentoIdentidadTest {
    
    public DocumentoIdentidadTest() {
    }
    
    @Test
    public void testDocumentoIdentidadConstructor(){
        System.out.println("DocumentoIdentidad()");
        DocumentoIdentidad instance = new DocumentoIdentidad();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getNumero method, of class DocumentoIdentidad.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        DocumentoIdentidad instance = new DocumentoIdentidad("30924968");
        String expResult = "30924968";
        String result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumero method, of class DocumentoIdentidad.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "30924968";
        DocumentoIdentidad instance = new DocumentoIdentidad();
        instance.setNumero(numero);
        assertEquals(numero, instance.getNumero());
    }
    
}
