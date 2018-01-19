/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg1;

/**
 *
 * @author Antonio #17273
 * @author Raul Monzon #17014
 * Algoritmos y Estructura de Datos
 * 19/1/2018
 */

public interface RadioI {
	
	
    
	public String frecAdelante(); //avanza en la frecuencia actual
	
	public String frecAtras(); //retrocede en la frecuencia actual
	
	public  boolean prender(); //enciende el radio
	
	public boolean apagar(); //apaga el radio
	
	public String cambioFrecuencia();  //cambia entre AM y FM
        
        public void guardarEstacionActual(int pos); //guarda la estacion actual en la posicion "pos"
        
        public String obtenerEstacion(int pos); //para obtner la estacion guardada en al posicion "pos"
        
        public String mostrarEstacion(); //obtener la estacion atual que la radio sintoniza
        
        public boolean estaPrendido(); //conocer estado de la radio (saber si la radio esta prendida)
        
        public String obtenerEstado(); //devolver "AM" o "FM"
	


}

