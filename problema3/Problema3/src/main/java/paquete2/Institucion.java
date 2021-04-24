
package paquete2;

/**
 *
 * @author micha
 */
public class Institucion {

    private String nombre;
    private String tipoInstitucion;
    private int numeroalumno;
    private int numeroDocentes;
    private int NumeroSedes;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipoInstitucion(String tipIns) {
        tipoInstitucion = tipIns;
    }

    public void establecerNumeroalumno(int numalumno) {
        numeroalumno = numalumno;
    }

    public void estabablecerNumeroDocentes(int numDoc) {
        numeroDocentes = numDoc;
    }

    public void establecerNumeroSedes(int NumSedes) {
        NumeroSedes = NumSedes;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroalumno() {
        return numeroalumno;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return NumeroSedes;
    }
}
