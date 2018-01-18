/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg1;

/**
 *
 * @author Antonio
 * @author Raul Monzon
 */

public interface RadioI {
	
	
	public String frecAdelante();
	
	public String frecAtras();
	
	public  boolean prender();
	
	public boolean apagar();
	
	public void cambioFrecuencia();
        
        public void guardarEstacionActual(int pos); //guarda la estacion actual en la posicion "pos"
        
        public String obtenerEstacion(int pos); //para obtner la estacion guardada en al posicion "pos"
        
        public String mostrarEstacion(); //obtener la estacion atual que la radio sintoniza
        
        public boolean estaPrendido(); //conocer estado de la radio (saber si la radio esta prendida)
        
        public String obtenerEstado(); //devolver "AM" o "FM"
	


}

