/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.DetalleFactura;
import ar.com.sebastian.gymapp.entidades.Factura;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class FacturaTest {
    
    private final DetalleFactura df1 = new DetalleFactura("detalle1", 30);
    private final DetalleFactura df2 = new DetalleFactura("detalle2", 100);
    private final DetalleFactura df3 = new DetalleFactura("detalle3", -100);
    
    private final LocalDate fechaFactura = LocalDate.of(2019, Month.MARCH, 2);
    private final int numeroFactura = 19981;
    private final String concepto = "Descripcion del pago";
    private final String tipoDePago = "Efectivo";
    private final String numeroTipoPago = "000991818";
    private final Month mesInicial = Month.MARCH;
    private final Month mesFinal = Month.APRIL;
    private final Month mesAbono = Month.MARCH;
    private final LocalDateTime fechaHora = LocalDateTime.now();
    private final String entidadBancaria = "Santander rio";
    private final List<DetalleFactura> detalleFacturas = new ArrayList<>();
    
    private final Factura factura;
    
    public FacturaTest() {
        
        detalleFacturas.add(df1);
        detalleFacturas.add(df2);
        detalleFacturas.add(df3);
        
        this.factura = new Factura(
                this.fechaFactura,
                this.numeroFactura, 
                this.concepto,
                this.tipoDePago,
                this.numeroTipoPago,
                this.mesInicial, 
                this.mesFinal,
                this.mesAbono,
                this.fechaHora,
                this.entidadBancaria,
                this.detalleFacturas);
    }
    
    /**
     * Test of getFechaFactura method, of class Factura.
     */
    @Test
    public void testGetFechaFactura() {
        System.out.println("getFechaFactura");
        Factura instance = factura;
        LocalDate expResult = this.fechaFactura;
        LocalDate result = instance.getFechaFactura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaFactura method, of class Factura.
     */
    @Test
    public void testSetFechaFactura() {
        System.out.println("setFechaFactura");
        LocalDate _fechaFactura = LocalDate.now();
        Factura instance = factura;
        instance.setFechaFactura(_fechaFactura);
        assertEquals(_fechaFactura, instance.getFechaFactura());
    }

    /**
     * Test of getNumeroFactura method, of class Factura.
     */
    @Test
    public void testGetNumeroFactura() {
        System.out.println("getNumeroFactura");
        Factura instance = factura;
        int expResult = this.numeroFactura;
        int result = instance.getNumeroFactura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroFactura method, of class Factura.
     */
    @Test
    public void testSetNumeroFactura() {
        System.out.println("setNumeroFactura");
        int _numeroFactura = 8888777;
        Factura instance = factura;
        instance.setNumeroFactura(_numeroFactura);
        assertEquals(_numeroFactura, instance.getNumeroFactura());
    }

    /**
     * Test of getConcepto method, of class Factura.
     */
    @Test
    public void testGetConcepto() {
        System.out.println("getConcepto");
        Factura instance = factura;
        String expResult = concepto;
        String result = instance.getConcepto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConcepto method, of class Factura.
     */
    @Test
    public void testSetConcepto() {
        System.out.println("setConcepto");
        String _concepto = "Concepto1";
        Factura instance = factura;
        instance.setConcepto(_concepto);
        assertEquals(_concepto, factura.getConcepto());
    }

    /**
     * Test of getMontoTotal method, of class Factura.
     */
    @Test
    public void testGetMontoTotal() {
        System.out.println("getMontoTotal");
        Factura instance = factura;
        float expResult = df1.getMonto() + df2.getMonto() + df3.getMonto();
        float result = instance.getMontoTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTipoDePago method, of class Factura.
     */
    @Test
    public void testGetTipoDePago() {
        System.out.println("getTipoDePago");
        Factura instance = factura;
        String expResult = tipoDePago;
        String result = instance.getTipoDePago();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoDePago method, of class Factura.
     */
    @Test
    public void testSetTipoDePago() {
        System.out.println("setTipoDePago");
        String _tipoDePago = "Cheque";
        Factura instance = factura;
        instance.setTipoDePago(_tipoDePago);
        assertEquals(_tipoDePago, instance.getTipoDePago());
    }

    /**
     * Test of getNumeroTipoPago method, of class Factura.
     */
    @Test
    public void testGetNumeroTipoPago() {
        System.out.println("getNumeroTipoPago");
        Factura instance = factura;
        String expResult = numeroTipoPago;
        String result = instance.getNumeroTipoPago();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroTipoPago method, of class Factura.
     */
    @Test
    public void testSetNumeroTipoPago() {
        System.out.println("setNumeroTipoPago");
        String _numeroTipoPago = "010000000";
        Factura instance = factura;
        instance.setNumeroTipoPago(_numeroTipoPago);
        assertEquals(_numeroTipoPago, factura.getNumeroTipoPago());
    }

    /**
     * Test of getMesInicial method, of class Factura.
     */
    @Test
    public void testGetMesInicial() {
        System.out.println("getMesInicial");
        Factura instance = factura;
        Month expResult = mesInicial;
        Month result = instance.getMesInicial();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMesInicial method, of class Factura.
     */
    @Test
    public void testSetMesInicial() {
        System.out.println("setMesInicial");
        Month _mesInicial = Month.NOVEMBER;
        Factura instance = factura;
        instance.setMesInicial(_mesInicial);
        assertEquals(_mesInicial, factura.getMesInicial());
    }

    /**
     * Test of getMesFinal method, of class Factura.
     */
    @Test
    public void testGetMesFinal() {
        System.out.println("getMesFinal");
        Factura instance = factura;
        Month expResult = mesFinal;
        Month result = instance.getMesFinal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMesFinal method, of class Factura.
     */
    @Test
    public void testSetMesFinal() {
        System.out.println("setMesFinal");
        Month _mesFinal = Month.SEPTEMBER;
        Factura instance = factura;
        instance.setMesFinal(_mesFinal);
        assertEquals(_mesFinal, factura.getMesFinal());
    }

    /**
     * Test of getMesAbono method, of class Factura.
     */
    @Test
    public void testGetMesAbono() {
        System.out.println("getMesAbono");
        Factura instance = factura;
        Month expResult = mesAbono;
        Month result = instance.getMesAbono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMesAbono method, of class Factura.
     */
    @Test
    public void testSetMesAbono() {
        System.out.println("setMesAbono");
        Month _mesAbono = Month.SEPTEMBER;
        Factura instance = factura;
        instance.setMesAbono(_mesAbono);
        assertEquals(_mesAbono, factura.getMesAbono());
    }

    /**
     * Test of getFechaHora method, of class Factura.
     */
    @Test
    public void testGetFechaHora() {
        System.out.println("getFechaHora");
        Factura instance = factura;
        LocalDateTime expResult = fechaHora;
        LocalDateTime result = instance.getFechaHora();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaHora method, of class Factura.
     */
    @Test
    public void testSetFechaHora() {
        System.out.println("setFechaHora");
        LocalDateTime _fechaHora = LocalDateTime.MAX;
        Factura instance = factura;
        instance.setFechaHora(_fechaHora);
        assertEquals(_fechaHora, factura.getFechaHora());
    }

    /**
     * Test of getEntidadBancaria method, of class Factura.
     */
    @Test
    public void testGetEntidadBancaria() {
        System.out.println("getEntidadBancaria");
        Factura instance = factura;
        String expResult = entidadBancaria;
        String result = instance.getEntidadBancaria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEntidadBancaria method, of class Factura.
     */
    @Test
    public void testSetEntidadBancaria() {
        System.out.println("setEntidadBancaria");
        String _entidadBancaria = "ICBC";
        Factura instance = factura;
        instance.setEntidadBancaria(_entidadBancaria);
        assertEquals(_entidadBancaria, factura.getEntidadBancaria());
    }

    /**
     * Test of getDetalleFacturas method, of class Factura.
     */
    @Test
    public void testGetDetalleFacturas() {
        System.out.println("getDetalleFacturas");
        Factura instance = factura;
        List<DetalleFactura> expResult = detalleFacturas;
        List<DetalleFactura> result = instance.getDetalleFacturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDetalleFacturas method, of class Factura.
     */
    @Test
    public void testSetDetalleFacturas() {
        System.out.println("setDetalleFacturas");
        
        DetalleFactura _df1 = new DetalleFactura("Nuevo detalle1", 300);
        DetalleFactura _df2 = new DetalleFactura("Nuevo detalle2", 200);
        DetalleFactura _df3 = new DetalleFactura("Nuevo detalle3", -600);
        DetalleFactura _df4 = new DetalleFactura("Nuevo detalle4", -600);
        
        List<DetalleFactura> _detalleFacturas = new ArrayList<>();
        _detalleFacturas.add(_df1);
        _detalleFacturas.add(_df2);
        _detalleFacturas.add(_df3);
        _detalleFacturas.add(_df4);
        Factura instance = factura;
        instance.setDetalleFacturas(_detalleFacturas);
        assertEquals(_detalleFacturas, factura.getDetalleFacturas());
    }   
}