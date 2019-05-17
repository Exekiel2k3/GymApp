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
        System.out.println("testEmptyNumber");
        ValidateTelefono instance = vt;
        boolean result = instance.isValidNumber();
        assertFalse(result);
    }
    
    @Test
    public void numberStartWithCharacter(){
        System.out.println("numberStartWithCharacter");
        telefono.setNumero("e9030740");
        ValidateTelefono instance = vt;
        assertFalse(instance.isValidNumber());
    }
    
    @Test
    public void numberEndWithCharacter(){
        System.out.println("numberEndWithCharacter");
        telefono.setNumero("4903074p");
        ValidateTelefono instance = vt;
        assertFalse(instance.isValidNumber());
    }
    
    @Test
    public void numberMiddleWithCharacter(){
        System.out.println("numberMiddleWithCharacter");
        telefono.setNumero("4903ñ740");
        ValidateTelefono instance = vt;
        assertFalse(instance.isValidNumber());
    }
    
    @Test
    public void numberWithWrongSeparator(){
        System.out.println("numberWithWrongSeparator");
        telefono.setNumero("4903/0740");
        ValidateTelefono instance = vt;
        assertFalse(instance.isValidNumber());
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
        ArrayList<String> _tiposTelefono = new ArrayList<>();
        _tiposTelefono.add("MOVIL");
        _tiposTelefono.add("FAMILIAR");
        ValidateTelefono vt1 = new ValidateTelefono(new Telefono("49030740", "MOVIL"), null);
        vt1.setTiposTelefono(_tiposTelefono);
        ValidateTelefono vt2 = new ValidateTelefono(new Telefono("49030740", "FAMILIAR"), null);
        vt2.setTiposTelefono(_tiposTelefono);
        assertTrue(vt1.isValidTypeTelephon() && vt2.isValidTypeTelephon());
    }

    /**
     * Test of isValidTypeTelephon method, of class ValidateTelefono.
     */
    @Test
    public void testIsValidTypeTelephon() {
        System.out.println("isValidTypeTelephon");
        
        ArrayList<String> _tiposTelefono = new ArrayList<>();
        _tiposTelefono.add("MOVIL");
        _tiposTelefono.add("FAMILIAR");
        ValidateTelefono vt1 = new ValidateTelefono(new Telefono("49030740", "MOVIL"), _tiposTelefono);
        vt1.setTiposTelefono(_tiposTelefono);
               
        boolean expResult = true;
        boolean result = vt1.isValidTypeTelephon();
        assertEquals(expResult, result);        
    }
    
}
