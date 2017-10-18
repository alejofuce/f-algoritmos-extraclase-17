/**
 *
 * @author Alejandro Fuertes
 */
public class Asignatura {
    
    //Declaramos atributos privados para esta clase.
    private String nombre;
    private int creditos;
    private String nombre2;
    private int creditos2;
    
    //En el metodo establecer otorgamos un valor a nuestra variable, el mismo que enviamos anteriormente.
    public void establecer_nombre_asig1(String a){
        nombre = a;
    }
    
    //En el metodo siguinete devolvemos un valor en este caso una cadena para la posterior presentacoin en pantalla
    public String obtener_nombre_asig1(){
        return nombre;
    }
    
    public void establecer_nombre_asig2(String x){
        nombre2 = x;
    }
    public String obtener_nombre_asig2(){
        return nombre2;
    }
    
    public void establecer_num_cred1(int n){
        creditos = n;
    }
    public int obtener_num_cred1(){
        return creditos;
    }
    
    public void establecer_num_cred2(int y){
        creditos2 = y;
    }
    public int obtener_num_cred2(){
        return creditos2;
    }
    
    //"Concatenamos las cadenas de la clase para presentar en pantalla"
    @Override
    public String toString() {
        String cadena2 = String.format("\tAsignatura 1: %s con numero de creditos %d\n\tAsignatura 2: %s con numero de creditos %d\n", 
                obtener_nombre_asig1(), obtener_num_cred1(), obtener_nombre_asig2(), obtener_num_cred2());
        return cadena2;  
    }
}

