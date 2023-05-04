
package com.monlau.m3.interfacespolimorfismo.clases;

import com.monlau.m3.interfacespolimorfismo.Interfaces.ConDescuento;
import com.monlau.m3.interfacespolimorfismo.Interfaces.EsAlimento;
import com.monlau.m3.interfacespolimorfismo.Interfaces.EsLiquido;
import java.time.LocalDate;

/**
 *
 * @author tonibonesp
 */
public class Vino implements EsLiquido ,EsAlimento, ConDescuento {
    private String marca;
    private String tipo;
    private double grados;
    private double precio;
    private double descuento;

    public Vino() {
    }

    public Vino(String marca, String tipo, double grados, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.grados = grados;
        this.precio = precio;
        this.descuento = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private double volumen;
    
    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }
    private String tipoEnvase;
    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio * (1 - this.descuento / 100);
    }
    
    private LocalDate caducidad;
    
    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
        }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return (int) (this.grados * 10);
    }

    @Override
    public String toString() {
        return "Vino marca:" + this.marca + ", tipo=" + this.tipo + 
                ", grados=" + this.grados + ", precio=" + this.precio + 
                ", descuento=" + this.descuento + "%, volumen=" + this.volumen + 
                ", tipo de envase=" + this.tipoEnvase + ", caducidad=" + this.caducidad +", calorías=" + this.getCalorias();
    }
   
    

    

   
    
}
