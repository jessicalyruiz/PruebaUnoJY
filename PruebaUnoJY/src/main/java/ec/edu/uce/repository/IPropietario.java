package ec.edu.uce.repository;

import ec.edu.uce.modelo.Propietario;


public interface IPropietario {

	public void create(Propietario propietario);
	public void read(String cedula); 
	public void update(Propietario propietario); 
	public void delete(String cedula); 
}
