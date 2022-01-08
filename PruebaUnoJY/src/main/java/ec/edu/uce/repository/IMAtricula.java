package ec.edu.uce.repository;

import ec.edu.uce.modelo.Matricula;

public interface IMAtricula {

	public void create(Matricula matricula);
	public void read(int matri); 
	public void update(Matricula matricula); 
	public void delete(int matri); 
}
