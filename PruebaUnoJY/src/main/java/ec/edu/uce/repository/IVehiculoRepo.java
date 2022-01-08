package ec.edu.uce.repository;

import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void create(Vehiculo vehiculo);
	public void read(String placa); 
	public void update(Vehiculo vehiculo); 
	public void delete(String placa); 
}
