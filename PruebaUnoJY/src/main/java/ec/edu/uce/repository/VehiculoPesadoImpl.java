package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;
@Repository
@Qualifier("pesado")
public class VehiculoPesadoImpl implements IVehiculoRepo{

	private static Logger LOG=LoggerFactory.getLogger(VehiculoPesadoImpl.class);
	
	@Override
	public void create(Vehiculo vehiculo) {
		LOG.info("Vehiculo guardado en la base de datos");
	}

	@Override
	public void read(String placa) {
		LOG.info("buscando vehiculo con placa "+ placa);
	}

	@Override
	public void update(Vehiculo vehiculo) {
		LOG.info("se ha actualizado el "+ vehiculo);
	}

	@Override
	public void delete(String placa) {
		// TODO Auto-generated method stub
		LOG.info("se ha eliminado el vehiculo con placa "+ placa);
	}

}
