/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.DetalleFactura;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class DetalleFacturaTest {
    
    public DetalleFacturaTest() {
    }

    /**
     * Test of setMonto method, of class DetalleFactura.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        float monto = 2.345F;
        DetalleFactura instance = new DetalleFactura("detalle1", 9);
        instance.setMonto(monto);
        assertEquals(monto, instance.getMonto(),0.0);
    }

    /**
     * Test of setDetalle method, of class DetalleFactura.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        String detalle = "Mes de abril";
        DetalleFactura instance = new DetalleFactura("detalle2", 3);
        instance.setDetalle(detalle);
        assertEquals(detalle, instance.getDetalle());
    }

    /**
     * Test of getMonto method, of class DetalleFactura.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        DetalleFactura instance = new DetalleFactura("detalle 3", 12870.76F);
        float expResult = 12870.76F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDetalle method, of class DetalleFactura.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        DetalleFactura instance = new DetalleFactura("Mes de Marzo", 4552);
        String expResult = "Mes de Marzo";
        String result = instance.getDetalle();
        assertEquals(expResult, result);
    }    
}