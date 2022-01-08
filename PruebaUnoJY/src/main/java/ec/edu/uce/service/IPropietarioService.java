package ec.edu.uce.service;

import ec.edu.uce.modelo.Propietario;

public interface IPropietarioService {

	public void createP(Propietario propietario);
	public void readP(String cedula); 
	public void updateP(Propietario propietario); 
	public void deleteP(String cedula); 
}
