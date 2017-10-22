package paquete_academico;

public class Carrera {

    //Declaramos atributos para esta clase
    private String nombre;
    private String modalidad;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombre = n;
    }

    //Metodo obtener; se devuelven datos de salida
    public String get_name() {
        return nombre;
    }

    public void set_mod(String m) {
        modalidad = m;
    }

    public String get_mod() {
        return modalidad;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("%s - modalidad(%s)", get_name(), get_mod());
        return cadena;
    }
}
