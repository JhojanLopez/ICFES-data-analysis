package co.edu.univalle;

import co.edu.univalle.database.repositories.EstudianteRepository;
import co.edu.univalle.services.estudiante.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendAnalisisDatosApplication implements CommandLineRunner {
	@Autowired
	EstudianteService estudianteService;
	
	@Autowired
	EstudianteRepository estudianteRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendAnalisisDatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
