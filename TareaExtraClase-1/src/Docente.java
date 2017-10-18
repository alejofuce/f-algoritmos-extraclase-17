/**
 *
 * @author Alejandro Fuertes
 */
public class Docente {
    
    //Declaramos atributos privados para esta clase.
    private String nombres;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;
    
    //En el metodo establecer otorgamos un valor a nuestra variable, enviados desde la clase "Principal".
    public void establecer_nombre_doce(String b){
        nombres = b;
    }
    
    //En el metodo siguinete devolvemos un valor en este caso una cadena para la posterior presentacoin en pantalla
    public String obtener_nombre_doce(){
        return nombres;
    }
    
    public void establecer_ape_doce(String c){
        apellidos = c;
    }
    public String obtener_ape_doce(){
        return apellidos;
    }
    
    public void establecer_3t(String d){
        titulo_tercer_nivel = d;
    }
    public String obtener_3t(){
        return titulo_tercer_nivel;
    }
    
    public void establecer_4t(String e){
        titulo_cuarto_nivel = e;
    }
    public String obtener_4t(){
        return titulo_cuarto_nivel;
    }
    
    public void establecer_asig1(String f){
        asignatura_1 = f;
    }
    public String obtener_asig1(){
        return asignatura_1;
    }
    
    public void establecer_asig2(String g){
        asignatura_2 = g;
    }
    public String obtener_asig2(){
        return asignatura_2;
    }
    
    //"Concatenamos las cadenas de la clase para presentar en pantalla"
    @Override
    public String toString() {
        String cadena = String.format("Datos del Docente:\nNombres: \t%s\nApellidos: \t%s\nTiene a cargo las asignaturas:\n", obtener_nombre_doce(), obtener_ape_doce());
        return cadena;  
    }
}
