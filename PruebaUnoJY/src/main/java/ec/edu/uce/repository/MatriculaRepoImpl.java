package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Matricula;
@Repository
public class MatriculaRepoImpl implements IMAtricula{

	
	private static Logger LOG=LoggerFactory.getLogger(VehiculoLivianoImpl.class);
	
	@Override
	public void create(Matricula matricula) {
		LOG.info("matricula registrada en la base de datos");
		
	}

	@Override
	public void read(int matri) {
		LOG.info("buscando matrucula "+ matri);
		
	}

	@Override
	public void update(Matricula matricula) {
		LOG.info("se ha actualizado mstri "+ matricula);
		
	}

	@Override
	public void delete(int matri) {
		LOG.info("se ha eliminado la matri"+ matri);
		
	}

}
