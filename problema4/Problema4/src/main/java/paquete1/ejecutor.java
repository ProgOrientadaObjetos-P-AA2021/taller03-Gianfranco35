package paquete1;

import paquete2.celulares;

public class ejecutor {

    public static void main(String[] args) {
        celulares cel = new celulares();

        cel.establecersistemaoperativo("android");
        cel.estabelcertamañodepantalla(8.5);
        cel.estabelcercosto(256.78);
        cel.estabelcerInformacionimei(1096372997);
        cel.estabelcerDireccionmac("91:75:1a:ec:9a:c7");
        System.out.printf("Sistema operativo: %s\n"
                + "Tamaño de Pantalla: %.2f\n"
                + "Costo del Celular: %.2f\n"
                + "Informacion de Imei: %d\n"
                + "Direccion mac: %s\n",
                cel.obtenersistemaoperativo(), cel.obtenertamañodepantalla(),
                cel.obtenercosto(), cel.obtenerInformacionimei(),
                cel.obtenerDireccionmac());
    }
}
