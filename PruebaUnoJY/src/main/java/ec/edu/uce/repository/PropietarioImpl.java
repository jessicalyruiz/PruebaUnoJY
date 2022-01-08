package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;

@Repository
public class PropietarioImpl implements IPropietario{

	private static Logger LOG=LoggerFactory.getLogger(VehiculoLivianoImpl.class);
	@Override
	public void create(Propietario propietario) {
		// TODO Auto-generated method stub
		LOG.info("propietario guardado en la base de datos");
	}

	@Override
	public void read(String cedula) {
		LOG.info("buscando propietario con placa "+ cedula);
		
	}

	@Override
	public void update(Propietario propietario) {
		LOG.info("se ha actualizado el "+ propietario);
		
	}

	@Override
	public void delete(String cedula) {
		LOG.info("se ha eliminado elpropietario con ccedula "+ cedula);
		
	}

}
