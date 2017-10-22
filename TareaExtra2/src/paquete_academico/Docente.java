package paquete_academico;

//Importamos paquetes para tener acceso a metodos
import paquete_general.Pais;

public class Docente {

    //Declaramos atributos para esta clase
    private String nombres;
    private String apellidos;
    private Pais d_pais;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombres = n;
    }

    //Metodo obtener; se devuelven datos de salida
    public String get_name() {
        return nombres;
    }

    public void set_srname(String s) {
        apellidos = s;
    }

    public String get_srname() {
        return apellidos;
    }

    public void set_pais(Pais p) {
        d_pais = p;
    }

    public Pais get_pais() {
        return d_pais;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("Docente : %s %s - pais %s", get_name(), get_srname(), get_pais());
        return cadena;
    }
}
