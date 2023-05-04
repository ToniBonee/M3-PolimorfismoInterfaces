/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.monlau.m3.interfacespolimorfismo.Interfaces;

import java.time.LocalDate;

/**
 *
 * @author tonibonesp
 */
public interface EsAlimento {

    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();
}
