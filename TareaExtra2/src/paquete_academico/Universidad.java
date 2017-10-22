package paquete_academico;

//Importamos paquetes para tener acceso a metodos
import paquete_general.Pais;

public class Universidad {

    //Declaramos atributos para esta clase
    private String nombre;
    private String siglas;
    private Pais u_pais;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombre = n;
    }

    //Metodo obtener; se devuelven datos de salida
    public String get_name() {
        return nombre;
    }

    public void set_siglas(String s) {
        siglas = s;
    }

    public String get_siglas() {
        return siglas;
    }

    public void set_pais(Pais p) {
        u_pais = p;
    }

    public Pais get_pais() {
        return u_pais;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("%s(%s) - %s", get_name(), get_siglas(), get_pais());
        return cadena;
    }
}
