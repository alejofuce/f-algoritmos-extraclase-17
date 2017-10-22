package paquete_general;

public class Pais {

    //Declaramos atributos para esta clase
    private String nombre;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombre = n;
    }

    //Metodo obtener; se devuelven datos de salida
    public String get_name() {
        return nombre;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("%s", get_name());
        return cadena;
    }
}
