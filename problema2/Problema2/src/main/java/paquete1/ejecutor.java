
package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author micha
 */
public class ejecutor {
     public static void main(String[] args) {
         EquivalenteHora equihoras = new EquivalenteHora();
         
         int horas= 24;
         equihoras.establecerhoras(horas);
         equihoras.calcularrminutos();
         equihoras.calcularsegundos();
         equihoras.calculardias();
         System.out.printf("Horas establecidas: %d\n"
         +"Minutos: %d\n "+ "Segundos: %d\n "+"Dias: %.2f\n ",
         equihoras.obtenerhoras(),equihoras.obtenerminutos(),
         equihoras.obtenersegundos(),equihoras.obtenerdias());
                 
     }
}
