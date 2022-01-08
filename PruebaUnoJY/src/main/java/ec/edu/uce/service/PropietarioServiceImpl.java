package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.repository.IPropietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	
	@Autowired
	IPropietario propietarioRepo;
	
	@Override
	public void createP(Propietario propietario) {
		// TODO Auto-generated method stub
		propietarioRepo.create(propietario);
	}

	@Override
	public void readP(String cedula) {
		propietarioRepo.read(cedula);
	}

	@Override
	public void updateP(Propietario propietario) {
		propietarioRepo.update(propietario);
	}

	@Override
	public void deleteP(String cedula) {
		propietarioRepo.delete(cedula);
	}

}
