package ec.edu.uce.service;

import java.math.BigDecimal;


import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoService {

	public BigDecimal calcularValorMatricula(BigDecimal precio);
	public void createV(Vehiculo vehiculo);
	public void readV(String placa); 
	public void updateV(Vehiculo vehiculo); 
	public void deleteV(String placa);
}
