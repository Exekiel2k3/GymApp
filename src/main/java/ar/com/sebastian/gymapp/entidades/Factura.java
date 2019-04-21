/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Factura {
    
    private String fechaFactura;
    private int numeroFactura;
    private String concepto;
    private float montoTotal;
    private String tipoDePago;
    private String numeroTipoPago;
    private Month mesInicial;
    private Month mesFinal;
    private Month mesAbono;
    private Date fechaHora;
    private String entidadBancaria;
    private List<DetalleFactura> detalleFacturas;

    public Factura(String fechaFactura, int numeroFactura, String concepto, String tipoDePago, String numeroTipoPago, Month mesInicial, Month mesFinal, Month mesAbono, Date fechaHora, String entidadBancaria, List<DetalleFactura> detalleFacturas) {
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.concepto = concepto;
        this.tipoDePago = tipoDePago;
        this.numeroTipoPago = numeroTipoPago;
        this.mesInicial = mesInicial;
        this.mesFinal = mesFinal;
        this.mesAbono = mesAbono;
        this.fechaHora = fechaHora;
        this.entidadBancaria = entidadBancaria;
        this.detalleFacturas = detalleFacturas;
        this.montoTotal = calcularMontoTotal(detalleFacturas);
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    private float calcularMontoTotal(List<DetalleFactura> detalleFacturas) {
        float monto = 0;
        
        for (DetalleFactura detalleFactura : detalleFacturas) {
            monto += detalleFactura.getMonto();
        }
       
        return monto;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public String getNumeroTipoPago() {
        return numeroTipoPago;
    }

    public void setNumeroTipoPago(String numeroTipoPago) {
        this.numeroTipoPago = numeroTipoPago;
    }

    public Month getMesInicial() {
        return mesInicial;
    }

    public void setMesInicial(Month mesInicial) {
        this.mesInicial = mesInicial;
    }

    public Month getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(Month mesFinal) {
        this.mesFinal = mesFinal;
    }

    public Month getMesAbono() {
        return mesAbono;
    }

    public void setMesAbono(Month mesAbono) {
        this.mesAbono = mesAbono;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public List<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
}