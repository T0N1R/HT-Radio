/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg1;

/**
 *
 * @author Antonio
 */

public class Radio implements RadioI {
	
	private int frecAM; 
	private float frecFM;
	private boolean estado; //apagado o encendido
	private boolean frecuencia; //AM O FM

	
	
	
	/**
	 * @return the frecAM
	 */
	public int getFrecAM() {
		return frecAM;
	}

	/**
	 * @param frecAM the frecAM to set
	 */
	public void setFrecAM(int frecAM) {
		this.frecAM = frecAM;
	}

	/**
	 * @return the frecFM
	 */
	public float getFrecFM() {
		return frecFM;
	}

	/**
	 * @param frecFM the frecFM to set
	 */
	public void setFrecFM(float frecFM) {
		this.frecFM = frecFM;
	}

	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return the frecuencia
	 */
	public boolean getFrecuencia() {
		return frecuencia;
	}

	/**
	 * @param frecuencia the frecuencia to set
	 */
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}


	/**
	 * Si estado es false, la radio estará en FM, será AM si es true
	 */
	@Override
	public void frecAdelante() {
		// TODO Auto-generated method stub
		
		//AM
		if(frecuencia == true) {
			frecAM = frecAM + 10;
			
			/*
			 * este if se realiza para regresar a la frecuencia 530 ya que el rango de frecuencias AM es entre
			 * 530 y 1610.
			 */
			if(frecAM == 1620) {
				frecAM = 530;
			}
			
			System.out.println("frecuencia: " + frecAM);
		}
		
		
		//FM
		if(frecuencia == false) {
			frecFM = (float) (frecFM + 0.2);
			
			/*
			 * este if se realiza para regresar a la frecuencia 87.9 ya que el rango de frecuencias FM es entre
			 * 87.9 y 107.9.
			 */
			if(frecFM == 108.1) {
				frecFM = (float) 87.9;
			}
			System.out.println("frecuencia: " + frecFM);
		}
	}

	@Override
	public void frecAtras() {
		// TODO Auto-generated method stub
		
		//AM
		if(frecuencia == true) {
			frecAM = frecAM - 10;
			
			/*
			 * este if se realiza para regresar a la frecuencia 1610 ya que el rango de frecuencias AM es entre
			 * 530 y 1610.
			 */
			if(frecAM == 520) {
				frecAM = 1610;
			}
			
			System.out.println("frecuencia: " + frecAM);
		}
		
		
		//FM
		if(frecuencia == false) {
			frecFM = (float) (frecFM - 0.2);
			
			/*
			 * este if se realiza para regresar a la frecuencia 107.9 ya que el rango de frecuencias FM es entre
			 * 87.9 y 107.9.
			 */
			if(frecFM == 87.7) {
				frecFM = (float) 107.9;
			}
			System.out.println("frecuencia: " + frecFM);
		}
	}

	@Override
	public void prender() {
		// TODO Auto-generated method stub
		estado = true;
		if(frecuencia == true) {
			System.out.println("La radio está encendida, la frecuencia es: " + frecAM);
		}
		
		if(frecuencia == false) {
			System.out.println("La radio está encendida, la frecuencia es: " + frecFM);
		}
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		estado = false;
		System.out.println(" - - - - ");
	}

	@Override
	public void cambioFrecuencia() {
		// TODO Auto-generated method stub
	
	if(frecuencia == true) {
		frecuencia = false;
		System.out.println("FM-----Frecuencia: " + frecFM);
	}
	
	if(frecuencia == false) {
		frecuencia = true;
		System.out.println("AM-----Frecuencia: " + frecFM);
	}
		
	}

	@Override
	public void guardarFrecAm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarFrecFm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarEstacion() {
		// TODO Auto-generated method stub
		
		System.out.println(frecuencia);
	}

}
