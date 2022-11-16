package co.edu.univalle;

import co.edu.univalle.database.entities.IcfesData;
import co.edu.univalle.models.Gender;
import co.edu.univalle.models.ModelData;
import co.edu.univalle.services.IcfesDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@SpringBootApplication
public class BackendAnalisisDatosApplication implements CommandLineRunner {
	@Autowired
	IcfesDataService icfesDataService;

	public static void main(String[] args) {
		SpringApplication.run(BackendAnalisisDatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IcfesData byId = icfesDataService.findById("63744e91921fb24e56c73595");
//		List<IcfesData> query = icfesDataService.findByPeriodo(2020);
		//List<IcfesData> query = icfesDataService.findByAll();
		//if(query.isEmpty()) System.out.println("es nulo o vacio");
		//else System.out.println(query.toString());

		if (byId==null) System.out.println("es nulo");
		else System.out.println(byId.toString());
	}
}
