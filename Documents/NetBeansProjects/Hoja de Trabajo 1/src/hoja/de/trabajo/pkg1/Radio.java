/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PRUEBA
package hoja.de.trabajo.pkg1;

/**
 *
 * @author Antonio
 * @author Raul Monzon
 */

public class Radio implements RadioI {
	
	private int frecAM = 530; 
	private float frecFM = (float)87.9;
	private boolean estado = true; //apagado o encendido
	private String frecuencia = "AM"; //AM O FM
        int[] favoritosAM = new int[11];
        float[] favoritosFM = new float[11];
	private String estacion;
	
	
        /**
         * @return the estacion
         */
        public String getEstacion(){
            return estacion;
        }
        
        /**
         * @param estacion the estacion to set
         */
        public void setEstacion(String estacion){
            this.estacion = estacion;
        }
        
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
	public String getFrecuencia() {
		return frecuencia;
	}

	/**
	 * @param frecuencia the frecuencia to set
	 */
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}


	/**
	 * Si estado es false, la radio estará en FM, será AM si es true
         * @return estacion
	 */
	@Override
	public String frecAdelante() {
		// TODO Auto-generated method stub
		
                String respuestaAdelante = "";
                
		//AM
		if(frecuencia.equals("AM")) {
			frecAM = frecAM + 10;
			
			/*
			 * este if se realiza para regresar a la frecuencia 530 ya que el rango de frecuencias AM es entre
			 * 530 y 1610.
			 */
			if(frecAM == 1620) {
				frecAM = 530;
			}
			
                        estacion = String.valueOf(frecAM);
		}
		
		
		//FM
		if(frecuencia.equals("FM")) {
			frecFM = (float) (frecFM + 0.2);
			
			/*
			 * este if se realiza para regresar a la frecuencia 87.9 ya que el rango de frecuencias FM es entre
			 * 87.9 y 107.9.
			 */
			if(frecFM == 108.1) {
				frecFM = (float) 87.9;
			}
                        estacion = String.valueOf(frecFM);
		}
            return estacion;
	}

	@Override
	public String frecAtras() {
		// TODO Auto-generated method stub
		
                String respuestaAtras = "";
		//AM
		if(frecuencia.equals("AM")) {
			frecAM = frecAM - 10;
			
			/*
			 * este if se realiza para regresar a la frecuencia 1610 ya que el rango de frecuencias AM es entre
			 * 530 y 1610.
			 */
			if(frecAM == 520) {
				frecAM = 1610;
			}
			
			respuestaAtras = "frecuencia: " + frecAM;
		}
		
		
		//FM
		if(frecuencia.equals("FM")) {
			frecFM = (float) (frecFM - 0.2);
			
			/*
			 * este if se realiza para regresar a la frecuencia 107.9 ya que el rango de frecuencias FM es entre
			 * 87.9 y 107.9.
			 */
			if(frecFM == 87.7) {
				frecFM = (float) 107.9;
			}
			respuestaAtras = "frecuencia: " + frecFM;
		}
            return respuestaAtras;
	}

	@Override
	public boolean prender() {
		// TODO Auto-generated method stub
		estado = true;
		if(frecuencia.equals("AM")) {
			System.out.println("La radio está encendida, la frecuencia es: " + frecAM);
		}else{
                    if(frecuencia.equals("FM")) {
			System.out.println("La radio está encendida, la frecuencia es: " + frecFM);
		}
                }
		
		
            return true;
		
	}

	@Override
	public boolean apagar() {
		// TODO Auto-generated method stub
		estado = false;
		System.out.println(" - - - - ");
            return false;
	}

	
	public String cambioFrecuencia() {
		// TODO Auto-generated method stub
	
	if(frecuencia.equals("AM")) {
		frecuencia = "FM";
		System.out.println("FM-----Frecuencia: " + frecFM);
	}else{
            if(frecuencia.equals("FM")){
		frecuencia = "AM";
		System.out.println("AM-----Frecuencia: " + frecAM);
	}
        }
        
	
            return (String)frecuencia;
		
	}





	@Override
	public String mostrarEstacion() {
		// TODO Auto-generated method stub
                
                if(frecuencia.equals("AM")){
                    estacion = String.valueOf(frecAM);
                }
                
                if(frecuencia.equals("FM")){
                    estacion = String.format("%.2f", frecFM);
                }
            return estacion;
	}

    @Override
    public void guardarEstacionActual(int pos) {
        if(frecuencia.equals("AM")){
            favoritosAM[pos]= frecAM;
        }else{
            if(frecuencia.equals("FM")){
            favoritosFM[pos]= frecFM;
        }
        }
        
    }

    @Override
    public String obtenerEstacion(int pos) {
        if(frecuencia.equals("AM")){
            estacion = String.valueOf(favoritosAM[pos]);
        }
        
        if(frecuencia.equals("FM")){
            estacion = String.valueOf(favoritosFM[pos]);
        }
            return estacion;
    }

    @Override
    public boolean estaPrendido() {
        if (estado = true){
            System.out.println("la radio esta encendida");
        }
        
        if (estado = false){
            System.out.println("la radio esta apagada");
        }
            return estado;
    }

    @Override
    public String obtenerEstado() {
        String frecuenciaAoF = "";
        if (frecuencia.equals("AM")){
            frecuenciaAoF = "AM";
        }
        
        if (frecuencia.equals("FM")){
            frecuenciaAoF = "FM";
        }
            return frecuenciaAoF;
    }

}
