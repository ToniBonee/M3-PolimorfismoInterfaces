
package Test;

import com.monlau.m3.interfacespolimorfismo.clases.Detargente;
import com.monlau.m3.interfacespolimorfismo.clases.Vino;
import java.time.LocalDate;

/**
 *
 * @author tonibonesp
 */
public class Main {
     public static void main (String[] args){
     Vino vino1 = new Vino("Bodegas Torres", "Tinto", 12.5, 15.99);
        vino1.setDescuento(0.2);

        LocalDate fecha = LocalDate.of(2024, 5, 1);
        vino1.setCaducidad(fecha);

        System.out.println(vino1.toString());
         
        
        
        Detargente detergente1 = new Detargente("Ariel", 7.99);
        detergente1.setDescuento(0.1);
        detergente1.setVolumen(2.5);
        detergente1.setTipoEnvase("Botella");

        System.out.println(detergente1.toString());
     }
}
