
package paquete1;

import paquete2.Institucion;


public class ejecutor {

    public static void main(String[] args) {

        Institucion educacion = new Institucion();

        educacion.establecerNombre("escuela fiscal 18 de nomviembre");
        educacion.establecerTipoInstitucion("Educacion Basica");
        educacion.establecerNumeroalumno(800);
        educacion.estabablecerNumeroDocentes(300);
        educacion.establecerNumeroSedes(1);

        System.out.printf(" - Nombre de la Institucion: %s\n "
                + "- Tipo de Educacion: %s\n"
                + " - Numero Alumnos: %d\n"
                + " - Numero de Docentes: %d\n"
                + " - Numeros de sedes: %d\n",
                educacion.obtenerNombre(),
                educacion.obtenerTipoInstitucion(),
                educacion.obtenerNumeroalumno(),
                educacion.obtenerNumeroDocentes(),
                educacion.obtenerNumeroSedes());
    }
}