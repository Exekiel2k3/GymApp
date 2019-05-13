/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.validadores.test;

import ar.com.sebastian.gymapp.entidades.Telefono;
import ar.com.sebastian.gymapp.validadores.ValidateTelefono;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class ValidateTelefonoTest {
    
    private final ValidateTelefono vt;
    private final Telefono telefono;
    private final ArrayList<String> tiposTelefono;
    
    public ValidateTelefonoTest() {
                
        telefono = new Telefono("", "");
        tiposTelefono = new ArrayList<>();
        tiposTelefono.add("PERSONAL");
        tiposTelefono.add("LABORAL");
        tiposTelefono.add("FIJO");
        
        vt = new ValidateTelefono(
                telefono,
                tiposTelefono);
    }
    
    /**
     * Test of isValidNumber method, of class ValidateTelefono.
     */
    @Test
    public void testEmptyNumber() {
        System.out.println("isValidNumber");
        ValidateTelefono instance = vt;
        boolean result = instance.isValidNumber();
        assertFalse(result);
    }
    
    /**
     * Test of isValidNumber method, of class ValidateTelefono.
     */
    @Test
    public void tesValidyNumber() {
        System.out.println("isValidNumber");
        ValidateTelefono instance = vt;
        String[] numeros = {"49030740",
                            "4903-0740",
                            "4903 0740",
                            "01149030740",
                            "011 4903 0740",
                            "011-4903-0740",
                            "+5401149030740",
                            "1540765462",
                            "15 4076 5462",
                            "15-4076-5462",
                            "011-15-4076-5462",
                            "011 15 4076 5462"};
        
        for (String numero : numeros) {
            telefono.setNumero(numero);
            boolean result = instance.isValidNumber();
            assertTrue(result);
        }
    }

    /**
     * Test of setTiposTelefono method, of class ValidateTelefono.
     */
    @Test
    public void testSetTiposTelefono() {
        System.out.println("setTiposTelefono");
        ArrayList<String> tiposTelefono = null;
        ValidateTelefono instance = null;
        instance.setTiposTelefono(tiposTelefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidTypeTelephon method, of class ValidateTelefono.
     */
    @Test
    public void testIsValidTypeTelephon() {
        System.out.println("isValidTypeTelephon");
        ValidateTelefono instance = null;
        boolean expResult = false;
        boolean result = instance.isValidTypeTelephon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
