package ec.edu.uce.modelo;

public class Matricula {

	private Vehiculo vehiculo;
	private Propietario propietario;
	private int numMatricula;
	
	
	
	@Override
	public String toString() {
		return "Matricula [vehiculo=" + vehiculo + ", propietario=" + propietario + "]";
	}
	//getters and setters
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	
	
}
