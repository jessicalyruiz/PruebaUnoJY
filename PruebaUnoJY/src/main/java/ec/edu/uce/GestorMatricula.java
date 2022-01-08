package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IMAtricula;
@Service
public class GestorMatricula {
	
	@Autowired
	IMAtricula matriculaRepo;
	public void matricularVehiculo(Vehiculo vehiculo) {
		matriculaRepo.create(null);
	}
	public void imprimirVehiculo() {
		
	}

}
