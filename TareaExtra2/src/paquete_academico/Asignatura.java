package paquete_academico;

public class Asignatura {

    //Declaramos atributos para esta clase
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    //Metodo establecer; se reciben datos de entrada
    public void set_name(String n) {
        nombre = n;
    }

    //Metodo obtener; se devuelven datos de salida
    public String get_name() {
        return nombre;
    }

    public void set_cred(int c) {
        creditos = c;
    }

    public int get_cred() {
        return creditos;
    }

    public void set_carr(Carrera ca) {
        carrera = ca;
    }

    public Carrera get_carr() {
        return carrera;
    }

    public void set_doc(Docente doc) {
        docente = doc;
    }

    public Docente get_doc() {
        return docente;
    }

    //"Concatenamos" la cadena y la imprimimos
    @Override
    public String toString() {
        String cadena = String.format("%s (%d creditos) de la carrera %s %s", get_name(), get_cred(), get_carr(), get_doc());
        return cadena;
    }

}
