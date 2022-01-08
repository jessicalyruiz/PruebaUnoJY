package ec.edu.uce.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;

@Service
@Qualifier("pesado")
public class VehiculoServicePesadoImpl implements IVehiculoService {

	private static Logger LOG = LoggerFactory.getLogger(VehiculoServicePesadoImpl.class);

	@Autowired
	@Qualifier("pesado")
	IVehiculoRepo vehiculoRepo;

	@Override
	public BigDecimal calcularValorMatricula(BigDecimal precio) {
		BigDecimal valorMatri=precio.multiply(new BigDecimal(0.25));
		return valorMatri;
	}

	

	@Override
	public void createV(Vehiculo vehiculo) {
		vehiculoRepo.create(vehiculo);
	}

	@Override
	public void readV(String placa) {
		vehiculoRepo.read(placa);;
	}

	@Override
	public void updateV(Vehiculo vehiculo) {
		vehiculoRepo.update(vehiculo);
	}

	@Override
	public void deleteV(String placa) {
		vehiculoRepo.delete(placa);
	}
	
}
