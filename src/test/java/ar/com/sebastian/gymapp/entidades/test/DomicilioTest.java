/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.Domicilio;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class DomicilioTest {
    
    @Test
    public void testDomicilioConstructor() {
        Domicilio instance = new Domicilio("Puan", "34", 2, "4");
        String expResultCalle = "Puan";
        String expResultNumero = "34";
        int expResultPiso = 2;
        String expResultUnidad = "4";
        int result = instance.getPiso();
        assertTrue((expResultCalle.equals(instance.getCalle()))&&
                (expResultNumero.equals(instance.getNumero()))&&
                (expResultPiso==instance.getPiso())&&
                (expResultUnidad.equals(instance.getUnidad())));
    }
    
    /**
     * Test of setCalle method, of class Domicilio.
     */
    @Test
    public void testSetCalle() {
        System.out.println("setCalle");
        String calle = "Acoyte";
        Domicilio instance = new Domicilio();
        instance.setCalle(calle);
        assertEquals(calle, instance.getCalle());
    }

    /**
     * Test of setNumero method, of class Domicilio.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "132";
        Domicilio instance = new Domicilio();
        instance.setNumero(numero);
        assertEquals(numero, instance.getNumero());
    }

    /**
     * Test of setPiso method, of class Domicilio.
     */
    @Test
    public void testSetPiso() {
        System.out.println("setPiso");
        int piso = 23;
        Domicilio instance = new Domicilio();
        instance.setPiso(piso);
        assertEquals(piso, instance.getPiso());
    }

    /**
     * Test of setUnidad method, of class Domicilio.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        String unidad = "12";
        Domicilio instance = new Domicilio();
        instance.setUnidad(unidad);
        assertEquals(unidad, instance.getUnidad());
    }

    /**
     * Test of getCalle method, of class Domicilio.
     */
    @Test
    public void testGetCalle() {
        System.out.println("getCalle");
        Domicilio instance = new Domicilio("Puan", "34", 2, "34");
        String expResult = "Puan";
        String result = instance.getCalle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumero method, of class Domicilio.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Domicilio instance = new Domicilio("Puan", "34", 2, "34");
        String expResult = "34";
        String result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPiso method, of class Domicilio.
     */
    @Test
    public void testGetPiso() {
        System.out.println("getPiso");
        Domicilio instance = new Domicilio("Puan", "34", 2, "34");
        int expResult = 2;
        int result = instance.getPiso();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnidad method, of class Domicilio.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        Domicilio instance = new Domicilio("Puan", "34", 2, "34");
        String expResult = "34";
        String result = instance.getUnidad();
        assertEquals(expResult, result);
    }
    
}