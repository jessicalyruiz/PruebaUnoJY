package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class VehiculoLiviano extends Vehiculo {

	private BigDecimal cilindrajeTurbo;
	
	
	
	
	//GETTERS AND SETTERS

	@Override
	public String toString() {
		return "VehiculoLiviano [cilindrajeTurbo=" + cilindrajeTurbo + "]";
	}

	public BigDecimal getCilindrajeTurbo() {
		return cilindrajeTurbo;
	}

	public void setCilindrajeTurbo(BigDecimal cilindrajeTurbo) {
		this.cilindrajeTurbo = cilindrajeTurbo;
	}
	
	
	
}
