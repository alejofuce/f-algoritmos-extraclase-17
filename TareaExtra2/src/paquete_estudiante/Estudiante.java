package paquete_estudiante;

//Importamos paquetes para tener acceso a metodos.
import paquete_academico.Universidad;
import paquete_academico.Asignatura;

public class Estudiante {

    //Declaramos atributos para esta clase
    private String nombres;
    private String apellidos;
    private Asignatura asig_1;
    private Asignatura asig_2;
    private Universidad universidad;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombres = n;
    }

    //Metodp obtener; devuelve datos de salida
    public String get_name() {
        return nombres;
    }

    public void set_srname(String a) {
        apellidos = a;
    }

    public String get_srname() {
        return apellidos;
    }

    public void set_asig_1(Asignatura a1) {
        asig_1 = a1;
    }

    public Asignatura get_asig_1() {
        return asig_1;
    }

    public void set_asig_2(Asignatura a2) {
        asig_2 = a2;
    }

    public Asignatura get_asig_2() {
        return asig_2;
    }

    public void set_uni(Universidad u) {
        universidad = u;
    }

    public Universidad get_uni() {
        return universidad;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("\tDatos de Estudiante:\n\tNombres: %s.\n\tApellidos: %s.\n\tUniversidad: %s\n\tTiene las siguientes asignaturas:\n\t\tAsignatura 1: %s\n\t\tAsignatura 2: %s\n\n", get_name(), get_srname(), get_uni(), get_asig_1(), get_asig_2());
        return cadena;
    }
}
