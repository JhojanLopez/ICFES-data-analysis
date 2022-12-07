package co.edu.univalle.services.filter;

import co.edu.univalle.database.repositories.EstudianteRepository;
import co.edu.univalle.models.Filter;
import co.edu.univalle.models.FilterType;
import co.edu.univalle.services.estudiante.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class FilterServiceImpl implements FilterService {
    @Autowired
    EstudianteService estudianteService;

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public List<Object> filterHandler(List<Object> params) throws RuntimeException {
        Filter filter = this.getFilter(params);
        log.info("filtro a aplicar: \n" + filter.toString());
        switch (filter.getType()) {
            case PERIODO:
                return Collections.singletonList(estudianteService.findByPeriodo((Integer) filter.getParamsMap().get("periodo")));
            case PERIODO_UBICACION:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacion((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion"))));
            case PERIODO_BILINGUE:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingue((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue"))));
            case PERIODO_CARACTER:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracter((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter"))));
            case PERIODO_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_BILINGUE:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingue((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue"))));
            case PERIODO_UBICACION_CARACTER:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndCaracter((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("caracter"))));
            case PERIODO_UBICACION_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_UBICACION_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), (Character) filter.getParamsMap().get("genero")));
            case PERIODO_UBICACION_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_UBICACION_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_BILINGUE_CARACTER:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndCaracter((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("caracter"))));
            case PERIODO_BILINGUE_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_BILINGUE_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), (Character) filter.getParamsMap().get("genero")));
            case PERIODO_BILINGUE_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_BILINGUE_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_CARACTER_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndCaracterAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_CARACTER_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndCaracterAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), (Character) filter.getParamsMap().get("genero")));
            case PERIODO_CARACTER_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndCaracterAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_CARACTER_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndCaracterAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_JORNADA_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndJornadaAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), (Character) filter.getParamsMap().get("genero")));
            case PERIODO_JORNADA_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndJornadaAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_JORNADA_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndJornadaAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_GENERO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndGeneroAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                (Character) filter.getParamsMap().get("genero"), String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                (Character) filter.getParamsMap().get("genero"), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_MUNICIPIO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndMunicipioAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("municipio")), String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_BILINGUE_CARACTER:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingueAndCaracter((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue")),
                                String.valueOf(filter.getParamsMap().get("caracter"))));
            case PERIODO_UBICACION_BILINGUE_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingueAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue")),
                                String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_UBICACION_BILINGUE_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingueAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_UBICACION_BILINGUE_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingueAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_UBICACION_BILINGUE_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndBilingueAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("bilingue")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_CARACTER_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndCaracterAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_UBICACION_CARACTER_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndCaracterAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("caracter")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_UBICACION_CARACTER_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndCaracterAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_UBICACION_CARACTER_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndCaracterAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_JORNADA_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndJornadaAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("jornada")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_UBICACION_JORNADA_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndJornadaAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_UBICACION_JORNADA_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndJornadaAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_GENERO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndGeneroAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_UBICACION_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_UBICACION_MUNICIPIO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacionAndMunicipioAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion")), String.valueOf(filter.getParamsMap().get("municipio")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_BILINGUE_CARACTER_JORNADA:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndCaracterAndJornada((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("jornada"))));
            case PERIODO_BILINGUE_CARACTER_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndCaracterAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("caracter")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_BILINGUE_CARACTER_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndCaracterAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_BILINGUE_CARACTER_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndCaracterAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("caracter")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_BILINGUE_JORNADA_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndJornadaAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("jornada")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_BILINGUE_JORNADA_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndJornadaAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_BILINGUE_JORNADA_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndJornadaAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_BILINGUE_GENERO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndGeneroAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_BILINGUE_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_BILINGUE_MUNICIPIO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeBilingueAndMunicipioAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("bilingue")), String.valueOf(filter.getParamsMap().get("municipio")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_CARACTER_JORNADA_GENERO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndJornadaAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("jornada")),
                                (Character) filter.getParamsMap().get("genero")));
            case PERIODO_CARACTER_JORNADA_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndJornadaAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_CARACTER_JORNADA_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndJornadaAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("jornada")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_CARACTER_GENERO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndGeneroAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_CARACTER_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_CARACTER_MUNICIPIO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeCaracterAndMunicipioAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("caracter")), String.valueOf(filter.getParamsMap().get("municipio")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_JORNADA_GENERO_MUNICIPIO:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeJornadaAndGeneroAndMunicipio((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("municipio"))));
            case PERIODO_JORNADA_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeJornadaAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_JORNADA_MUNICIPIO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndColeJornadaAndMunicipioAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("jornada")), String.valueOf(filter.getParamsMap().get("municipio")),
                                String.valueOf(filter.getParamsMap().get("internet"))));
            case PERIODO_MUNICIPIO_GENERO_INTERNET:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndMunicipioAndGeneroAndInternet((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("municipio")), (Character) filter.getParamsMap().get("genero"),
                                String.valueOf(filter.getParamsMap().get("internet"))));
                default:
                return Collections.emptyList();
        }
    }

    @Override
    public boolean validateParams(List<Object> params) {
        if (!validateAllParamsNoNull(params)) throw new RuntimeException("Todos los parametros no pueden ser nulos");
        if (!validateMaxParams(params)) throw new RuntimeException("Solo se permiten maximo 4 campos");
        return true;
    }


    @Override
    public boolean validateAllParamsNoNull(List<Object> params) {
        List<Object> collect = params.stream().filter(Objects::isNull).collect(Collectors.toList());
        return params.size() != collect.size();
    }

    @Override
    public boolean validateMaxParams(List<Object> params) {
        List<Object> collect = params.stream().filter(Objects::nonNull).collect(Collectors.toList());
        return collect.size()<5;
    }

    @Override
    public HashMap<String, Object> getParamsMap(List<Object> params) {

        HashMap<String, Object> response = new HashMap<>();
        if (params.get(0) != null) response.put("periodo", params.get(0));
        if (params.get(1) != null) response.put("ubicacion", params.get(1));
        if (params.get(2) != null) response.put("bilingue", params.get(2));
        if (params.get(3) != null) response.put("caracter", params.get(3));
        if (params.get(4) != null) response.put("jornada", params.get(4));
        if (params.get(5) != null) response.put("genero", params.get(5));
        if (params.get(6) != null) response.put("municipio", params.get(6));
        if (params.get(7) != null) response.put("internet", params.get(7));
        return response;
    }

    @Override
    public Filter getFilter(List<Object> params) {
        HashMap<String, Object> paramsMap = this.getParamsMap(params);

        if (paramsMap.get("periodo") != null && paramsMap.get("municipio") != null
                && paramsMap.get("genero") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_MUNICIPIO_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("municipio") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_JORNADA_MUNICIPIO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("genero") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_JORNADA_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("genero") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_JORNADA_GENERO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("municipio") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_CARACTER_MUNICIPIO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("genero") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_CARACTER_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("genero") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_CARACTER_GENERO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("jornada") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_CARACTER_JORNADA_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("jornada") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_CARACTER_JORNADA_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("jornada") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_CARACTER_JORNADA_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("municipio") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_MUNICIPIO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("genero") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("genero") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_GENERO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("jornada") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_JORNADA_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("jornada") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_JORNADA_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("jornada") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_JORNADA_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("caracter") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_CARACTER_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("caracter") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_CARACTER_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("caracter") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_CARACTER_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("caracter") != null && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_CARACTER_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("municipio") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_MUNICIPIO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("genero") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("genero") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_UBICACION_GENERO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("jornada") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_JORNADA_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("jornada") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_UBICACION_JORNADA_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("jornada") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_UBICACION_JORNADA_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("caracter") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_CARACTER_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("caracter") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_UBICACION_CARACTER_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("caracter") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_UBICACION_CARACTER_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("caracter") != null && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_UBICACION_CARACTER_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null && paramsMap.get("caracter") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE_CARACTER, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("municipio") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_MUNICIPIO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("genero") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_GENERO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("genero") != null
                && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_GENERO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_JORNADA_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_JORNADA_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null
                && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_JORNADA_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_CARACTER_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_CARACTER_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_CARACTER_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null
                && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_CARACTER_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null
                && paramsMap.get("caracter") != null)
            return new Filter(FilterType.PERIODO_BILINGUE_CARACTER, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_UBICACION_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_UBICACION_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_UBICACION_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_UBICACION_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("caracter") != null)
            return new Filter(FilterType.PERIODO_UBICACION_CARACTER, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null
                && paramsMap.get("bilingue") != null)
            return new Filter(FilterType.PERIODO_UBICACION_BILINGUE, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("internet") != null)
            return new Filter(FilterType.PERIODO_INTERNET, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("municipio") != null)
            return new Filter(FilterType.PERIODO_MUNICIPIO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("jornada") != null)
            return new Filter(FilterType.PERIODO_JORNADA, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("caracter") != null)
            return new Filter(FilterType.PERIODO_CARACTER, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("bilingue") != null)
            return new Filter(FilterType.PERIODO_BILINGUE, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null)
            return new Filter(FilterType.PERIODO_UBICACION, paramsMap);
        if (paramsMap.get("periodo") != null) return new Filter(FilterType.PERIODO, paramsMap);

        return new Filter(FilterType.UNSIGNED, null);
    }

}
