/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.Terreno;

/**
 *
 * @author micha
 */
public class ejecutor {

    public static void main(String[] args) {
        Terreno terreno = new Terreno();

        double largo = 255.60;
        double ancho = 256.83;
        double valormetrocuadrado = 16.60;

        terreno.establecerlargo(largo);
        terreno.establecerancho(ancho);
        terreno.establecervalormetrocuadrado(valormetrocuadrado);
        terreno.calculararea();
        terreno.calcularcosto();
        System.out.printf("Largo del terreno: %.2f\n "
                + "Ancho del terreno: %.2f\nValor Metros cuadrados: %.2f\n"
                + "Area del terreno: %.2f\n"
                + "Costo del terreno: %.2f\n", terreno.obtenerlargo(),
                terreno.obtenerancho(), terreno.obtenervalormetroscuadrados(),
                terreno.obtenerarea(),
                terreno.obtenercalcularcosto());
    }
}
