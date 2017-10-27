/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;
import paquete_deportes.Jugador;

/**
 *
 * @author eafuc
 */
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;
    
    public Equipo (String n, String s, int a, Jugador[] j, Tecnico[] t){
        nombre = n;
        siglas = s;
        anio_fundacion = a;
        jugadores = j;
        tecnicos = t;
    }
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_siglas(String n){
        siglas = n;
    }
    public String obtener_siglas(){
        return siglas;
    }
    
    public void establecer_anio_fundacion(int n){
        anio_fundacion = n;
    }
    public int obtener_anio_fundacion(){
        return anio_fundacion;
    }
    
    public void establecer_jugadores(Jugador[] n){
        jugadores = n;
    }
    public Jugador[] obtener_jugadores(){
        return jugadores;
    }
    
    public void establecer_tecnicos(Tecnico[] n){
        tecnicos = n;
    }
    public Tecnico[] obtener_tecnicos(){
        return tecnicos;
    }
    
    
    public double obtener_promedio_jugadores(){
        Jugador[] j = obtener_jugadores();
        double sum = 0;
        for(int i = 0; i < j.length; i++){
            Jugador d = j[i];
           
            sum = sum + d.obtener_edad();
        }
        double prom_j = (sum / j.length);
        return prom_j;
    }
    
    public double obtener_promedio_tecnicos(){
        Tecnico[] t = obtener_tecnicos();
        double sum = 0;
        for(int i = 0; i < t.length; i++){
            Tecnico e = t[i];
           
            sum = sum + e.obtener_edad();
        }
        double prom_t = (sum / t.length);
        return prom_t;
    }
    
    @Override
    public String toString(){
        
        String cadena_jugadores = "";
        Jugador [] j = obtener_jugadores();
        for(int i = 0; i < j.length; i++){
            cadena_jugadores = String.format("%s%s", cadena_jugadores, j[i]); 
        }
        
        String cadena_tecnicos = "";
        Tecnico [] e = obtener_tecnicos();
        for(int i = 0; i < e.length; i++){
            cadena_tecnicos = String.format("%s%s", cadena_tecnicos, e[i]);  
        }
        
        String cadena2 = String.format("Equipo:\n"
                + "\t%s\nSiglas:\n\t%s\nAño de fundacion:\n\t%d\nSus tecnicos son:\n%sSus jugadores son:\n%sPromedio de edad de:\n\tTecnicos: %.1f años\n\tJugadores: %.1f años", obtener_nombre(),obtener_siglas(),
                obtener_anio_fundacion(), cadena_tecnicos, cadena_jugadores, obtener_promedio_tecnicos(), obtener_promedio_jugadores());
        return cadena2;
    }
    
}
