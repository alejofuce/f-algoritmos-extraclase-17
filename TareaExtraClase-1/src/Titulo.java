/**
 *
 * @author Alejandro Fuertes
 */
public class Titulo {
    
    //Declaramos atributos privados para esta clase.
    private String nombre;
    private String nombre_universidad;
    private String nombre2;
    private String nombre_universidad2;
    private String carrera;
    private String carrera2;
   
    //En el metodo establecer otorgamos un valor a nuestra variable, enviados desde la clase "Principal".
    public void establecer_nom_tit(String h){
        nombre = h;
    }
    
    //En el metodo siguinete devolvemos un valor en este caso una cadena para la posterior presentacoin en pantalla
    public String obtener_nom_tit(){
        return nombre;
    }
    
    public void establecer_nom_tit2(String w){
        nombre2 = w;
    }
    public String obtener_nom_tit2(){
        return nombre2;
    }
    
    public void establecer_nom_uni(String i){
        nombre_universidad = i;
    }
    public String obtener_nom_uni(){
        return nombre_universidad;
    }
    
    public void establecer_nom_uni2(String v){
        nombre_universidad2 = v;
    }
    public String obtener_nom_uni2(){
        return nombre_universidad2;
    }
    
    public void establecer_nom_car(String k){
        carrera = k;
    }
    public String obtener_nom_car(){
        return carrera;
    }
    
    public void establecer_nom_car2(String k){
        carrera2 = k;
    }
    public String obtener_nom_car2(){
        return carrera2;
    }
    
    //"Concatenamos las cadenas de la clase para presentar en pantalla"
    @Override
    public String toString() {
        String cadena3 = String.format("El docente tiene los siguientes titulos academicos:"
                + "\n\tTitulo 3er nivel: %s en %s - %s\n\t"
                + "Titulo 4to nivel: %s en %s - %s\n\n\n", 
                obtener_nom_tit(), obtener_nom_car(), obtener_nom_uni(), obtener_nom_tit2(), obtener_nom_car2(), obtener_nom_uni2());
        return cadena3;  
    }
}
