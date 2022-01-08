package ec.edu.uce;

import java.math.BigDecimal;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Matricula;
import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;
import ec.edu.uce.service.IGestorMAtricula;
import ec.edu.uce.service.IVehiculoService;

@SpringBootApplication
public class PruebaUnoJyApplication implements CommandLineRunner {

	@Autowired
	IGestorMAtricula gestorMAtri;
	@Autowired
	@Qualifier("liviano")
	IVehiculoService vehiculoLService;
	
	@Autowired
	@Qualifier("pesado")
	IVehiculoService vehiculoPService;
	
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(PruebaUnoJyApplication.class);
	public Scanner letras=new Scanner(System.in);
	public Scanner num=new Scanner(System.in);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnoJyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("matriculacion");
		System.out.println("matri");
		Propietario propietario=new Propietario();
		propietario.setApellido("yanez");
		propietario.setNombre("Jessica"); 
		propietario.setCedula("2300115066");
		
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Porsche");
		vehiculo.setPaisOrigen("Alemania");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setPropietario(propietario);
		vehiculo.setTipo("liviano");
		vehiculo.setValorMatricula(vehiculoLService.calcularValorMatricula(vehiculo.getPrecio()));
		
		
		Vehiculo vehiculo2=new Vehiculo();
		vehiculo2.setMarca("Mercedes");
		vehiculo2.setPaisOrigen("Alemania");
		vehiculo2.setPrecio(new BigDecimal(120000));
		vehiculo2.setPropietario(propietario);
		vehiculo2.setTipo("pesado");
		vehiculo2.setValorMatricula(vehiculoLService.calcularValorMatricula(vehiculo.getPrecio()));
		
		
		//matricula
		Matricula matri=new Matricula();
		matri.setNumMatricula(1);
		matri.setPropietario(propietario);
		matri.setVehiculo(vehiculo);
		gestorMAtri.matricularVehiculo(matri);
		
		gestorMAtri.imprimirVehiculo(matri);
		
		ingresarDatos();
	}
	
	public void ingresarDatos() {
		LOG.info("*******ingresar propietario");
		Propietario propietario=new Propietario();
		LOG.info("ingresar nombre propietario");
		propietario.setNombre(letras.nextLine());
		LOG.info("ingresar apellido propietario");
		propietario.setApellido(letras.nextLine());
		LOG.info("ingresar cedula propietario");
		propietario.setCedula(letras.nextLine());
		
		
		LOG.info("*******ingresar vehiculo");
		Vehiculo vehi=new Vehiculo();
		LOG.info("ingresar marca del vehiculo");
		vehi.setMarca(letras.next());
		LOG.info("ingresar pais de origen del vehiculo");
		vehi.setPaisOrigen(letras.next());
		LOG.info("ingresar tipo del vehiculo");
		LOG.info("1: liviano");
		LOG.info("2: pesado");
		int tipo=num.nextInt();
		if (tipo==1) {
			vehi.setTipo("liviano");
		}else if(tipo==2) {
			vehi.setTipo("pesado");
		}
		LOG.info("ingresar precio del vehiculo");
		BigDecimal precio=new BigDecimal(num.nextInt());
		if(precio.compareTo(new BigDecimal(0))==-1||precio.compareTo(new BigDecimal(0))==0) {
			LOG.error("precio no valido");
		}else {
			if(precio.compareTo(new BigDecimal(10000))==-1||precio.compareTo(new BigDecimal(10000))==0) {
				LOG.warn("precio demaciado bajo para el promedio");
				vehi.setPrecio(precio);
				Matricula matri=new Matricula();
				matri.setNumMatricula(1);
				matri.setPropietario(propietario);
				matri.setVehiculo(vehi);
				gestorMAtri.matricularVehiculo(matri);
			}else {
				LOG.info("precio correcto");
				vehi.setPrecio(precio);
				Matricula matri=new Matricula();
				matri.setNumMatricula(1);
				matri.setPropietario(propietario);
				matri.setVehiculo(vehi);
				gestorMAtri.matricularVehiculo(matri);
			}
		
		}
		
		
		vehi.setValorMatricula(vehiculoLService.calcularValorMatricula(vehi.getPrecio()));
		
		
	}

}
