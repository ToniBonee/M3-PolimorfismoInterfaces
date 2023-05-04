/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monlau.m3.interfacespolimorfismo.clases;

import com.monlau.m3.interfacespolimorfismo.Interfaces.EsAlimento;
import java.time.LocalDate;

/**
 *
 * @author tonibonesp
 */
public class Cereales implements EsAlimento{
    private String marca;
    private Double precio; 
    private String tipo_cereal;
    private LocalDate caducidad;

    public Cereales() {
    }

    public Cereales(String marca, Double precio, String tipo_cereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipo_cereal = tipo_cereal;
        if(tipo_cereal.equalsIgnoreCase("espelta")){
            this.calorias = 5;
        }else if(tipo_cereal.equalsIgnoreCase("maíz")){
            this.calorias = 8;
        }else if(tipo_cereal.equalsIgnoreCase("trigo")){
            this.calorias = 12;
        }else {
            this.calorias = 15;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo_cereal() {
        return tipo_cereal;
    }
    
    public void setTipo_cereal(String tipo_cereal) {
        this.tipo_cereal = tipo_cereal;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
        }

    @Override
    public LocalDate getCaducidad() {
        
        return caducidad;
        
        }
    
    
    private int calorias;
    
    @Override
    public int getCalorias() {
        return calorias;
       }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", precio=" + precio + 
                ", tipo_cereal=" + tipo_cereal + ", caducidad=" + caducidad +
                ", calorias=" + calorias + '}';
    }

    
    
    
}
