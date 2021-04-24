/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author micha
 */
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerhoras(int hora) {
        horas = hora;
    }

    public void calcularrminutos() {
        minutos = horas * 60;
    }

    public void calcularsegundos() {
        segundos = horas * 3600;
    }

    public void calculardias() {
        dias = horas / 24;
    }

    public int obtenerhoras() {
        return horas;
    }

    public int obtenerminutos() {
        return minutos;
    }

    public int obtenersegundos() {
        return segundos;
    }
    
    public double obtenerdias(){
        return dias;
    }

}
