package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Matricula;
import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IMAtricula;
import ec.edu.uce.repository.IPropietario;
import ec.edu.uce.repository.IVehiculoRepo;
import ec.edu.uce.repository.VehiculoLivianoImpl;
import ec.edu.uce.service.IGestorMAtricula;
@Service
public class GestorMatricula implements IGestorMAtricula{
	
	private static Logger LOG=LoggerFactory.getLogger(VehiculoLivianoImpl.class);
	
	@Autowired
	@Qualifier("liviano")
	IVehiculoRepo vehiculoRepoL;
	
	@Autowired
	@Qualifier("pesado")
	IVehiculoRepo vehiculoRepoP;
	
	@Autowired
	IPropietario propietarioRepo;
	
	@Autowired
	IMAtricula matriculaRepo;
	
	public void imprimirVehiculo(Matricula matricula) {
		 matriculaRepo.read(matricula.getNumMatricula());
		 LOG.info("imprimiendo vehiculo");
		 LOG.info(matricula.getVehiculo().toString());
	}
	@Override
	public void matricularVehiculo(Matricula matricula) {
		 LOG.info("matriculando vehiculo");
		matriculaRepo.create(matricula);
		if(matricula.getVehiculo().getTipo().equalsIgnoreCase("liviano")) {
			vehiculoRepoL.create(matricula.getVehiculo());
		}else if(matricula.getVehiculo().getTipo().equalsIgnoreCase("pesado")) {
			vehiculoRepoP.create(matricula.getVehiculo());
		}
		
		
		propietarioRepo.create(matricula.getPropietario());
		
	}

}
