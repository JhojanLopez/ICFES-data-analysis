package co.edu.univalle;

import co.edu.univalle.database.entities.IcfesData;
import co.edu.univalle.database.repositories.IcfesDataRepository;
import co.edu.univalle.models.Municipios;
import co.edu.univalle.services.IcfesDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class BackendAnalisisDatosApplication implements CommandLineRunner {
	@Autowired
	IcfesDataService icfesDataService;
	
	@Autowired
	IcfesDataRepository icfesDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendAnalisisDatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
