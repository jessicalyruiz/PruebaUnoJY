package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class VehiculoPesado {

	private float pesoToneladas;
	
	
	//GETTER AND SETTERS 

	@Override
	public String toString() {
		return "VehiculoPesado [pesoToneladas=" + pesoToneladas + "]";
	}

	public float getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(float pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}
	
	
	
	
}
