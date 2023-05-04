/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monlau.m3.interfacespolimorfismo.clases;

import com.monlau.m3.interfacespolimorfismo.Interfaces.ConDescuento;
import com.monlau.m3.interfacespolimorfismo.Interfaces.EsLiquido;

/**
 *
 * @author tonibonesp
 */
public class Detargente implements EsLiquido, ConDescuento {

    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detargente() {
    }

    public Detargente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio * (1 - descuento);
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public String toString() {
        return "Detargente:" + "marca=" + marca + ", precio=" + precio + 
                ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase +
                ", descuento=" + descuento ;
    }

}
