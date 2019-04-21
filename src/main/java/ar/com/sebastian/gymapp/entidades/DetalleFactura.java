/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades;

/**
 *
 * @author sebas
 */
public class DetalleFactura {

    private String detalle;
    private float monto;
//    private int mesFinal;
//    private int mesInicial;
//    private int numeroFactura;
//    private int añoInicial;
//    private int añoFinal;
//    private float saldoAnterior;
//    private int mesInicialAnterior;
//    private int mesFinalAnterior;

    public DetalleFactura(String detalle, float monto) {
        this.detalle = detalle;
        this.monto = monto;
    }

    public void setMonto(float monto){
        this.monto = monto;
    }

    public void setDetalle(String detalle){
        this.detalle = detalle;
    }

//    public void setMesFinal(int mesFinal){
//        this.mesFinal = mesFinal;
//    }
//
//    public void setMesInicial(int mesInicial){
//        this.mesInicial = mesInicial;
//    }
//
//    public void setNumeroFactura(int numeroFactura){
//        this.numeroFactura = numeroFactura;
//    }
//
//    public void setAñoFinal(int añoFinal){
//        this.añoFinal = añoFinal;
//    }
//
//    public void setAñoInicial(int añoInicial){
//        this.añoInicial = añoInicial;
//    }
//
//    public void setSaldoAnterior(float saldoAnterior){
//        this.saldoAnterior = saldoAnterior;
//    }
//
//    public void setMesInicialAnterior(int mesInicialAnterior){
//        this.mesInicialAnterior = mesInicialAnterior;
//    }
//
//    public void setMesFinalAnterior(int mesFinalAnterior){
//        this.mesFinalAnterior = mesFinalAnterior;
//    }

    public float getMonto(){
        return this.monto;
    }

//    public int getMesFinal(){
//        return this.mesFinal;
//    }
//
//    public int getMesInicial(){
//        return this.mesInicial;
//    }
//
//    public int getNumeroFactura(){
//        return this.numeroFactura;
//    }
//
//    public int getAñoFinal(){
//        return this.añoFinal;
//    }
//
//    public int getAñoInicial(){
//        return this.añoInicial;
//    }
//
//    public float getSaldoAnterior(){
//        return this.saldoAnterior;
//    }
//
//    public int getMesInicialAnterior(){
//        return this.mesInicialAnterior;
//    }
//
//    public int getMesFinalAnterior(){
//        return this.mesFinalAnterior;
//    }

    public String getDetalle(){
        return this.detalle;
    }
}
