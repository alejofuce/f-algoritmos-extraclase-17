/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author eafuc
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private Jugador[] jugadores;
    
    public Jugador(String n, String p, int e){
        nombre = n;
        posicion = p;
        edad = e;
    }
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_posicion(String n){
        posicion = n;
    }
    public String obtener_posicion(){
        return posicion;
    }
    
    public void establecer_edad(int n){
        edad = n;
    }
    public int obtener_edad(){
        return edad;
    }   
    
    @Override
    public String toString(){
        String cadena = String.format("\t%s - %s - %d años\n", obtener_nombre(),obtener_posicion(),
                obtener_edad());
        return cadena;
    }
}
