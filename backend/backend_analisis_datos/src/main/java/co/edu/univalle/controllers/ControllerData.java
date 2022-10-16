package co.edu.univalle.controllers;

import co.edu.univalle.models.Gender;
import co.edu.univalle.models.ModelData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@RestController
@RequestMapping("/api/v1/data")
public class ControllerData {

    @GetMapping("/{score}/{year}")
    public ResponseEntity<?> getData(@PathVariable String score, @PathVariable Integer year) {

        if(score==null || year==null) return ResponseEntity.badRequest().body("se debe poner tanto el puntaje y año para los filtros respectivos /{puntaje}/{año}");

        List<ModelData> modelDataList = generateListRandom();

        if (score.equals("bajo")) {
            List<ModelData> response = modelDataList.stream()
                    .filter(m -> m.getYear() == (int)year)
                    .filter(m -> m.getScore() < 300)
                    .collect(Collectors.toList());

            return ResponseEntity.ok(response);
        }

        if (score.equals("alto")){
            List<ModelData> response = modelDataList.stream()
                    .filter(m -> m.getYear() == (int)year)
                    .filter(m -> m.getScore() > 299)
                    .collect(Collectors.toList());

            return ResponseEntity.ok(response);
        }

        return ResponseEntity.badRequest().body("el puntaje debe ser alto o bajo. se considera bajo menor a 299 y alto mayor a 300");
    }

    public List<ModelData> generateListRandom() {

        List<ModelData> modelDataList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            modelDataList.add(new ModelData(++i, genderGenerator(), scoreGenerator(), yearGenerator()));
        }
        return modelDataList;
    }

    private Gender genderGenerator() {
        int genderRandom = (int) (Math.random() * (3 - 1) + 1);
        if (genderRandom == 1) return Gender.MASCULINO;
        return Gender.FEMENINO;
    }

    private Integer scoreGenerator() {
        return (int) (Math.random() * (501 - 150) + 150);
    }

    private Integer yearGenerator() {
        return (int) (Math.random() * (2022 - 2017) + 2017);
    }

}
