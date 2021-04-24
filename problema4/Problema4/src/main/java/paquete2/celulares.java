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
public class celulares {

    private String sistemaoperativo;
    private double tamañodepantalla;
    private double costo;
    private String Direccionmac;
    private int Informacionimei;

    public void establecersistemaoperativo(String sistem) {
        sistemaoperativo = sistem;
    }

    public void estabelcertamañodepantalla(double pantalla) {
        tamañodepantalla = pantalla;
    }

    public void estabelcercosto(double cost) {
        costo = cost;
    }

    public void estabelcerDireccionmac(String mac) {
        Direccionmac = mac;
    }

    public void estabelcerInformacionimei(int imei) {
        Informacionimei = imei;
    }
    
    public String obtenersistemaoperativo(){
        return sistemaoperativo;
    }
    
    public double obtenertamañodepantalla(){
        return tamañodepantalla;
    }
    
    public double obtenercosto(){
        return costo;
    }
    
    public String obtenerDireccionmac(){
        return Direccionmac;
    }
    
    public int obtenerInformacionimei(){
        return Informacionimei;
    }

}
