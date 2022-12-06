package co.edu.univalle.services.filter;

import co.edu.univalle.database.repositories.EstudianteRepository;
import co.edu.univalle.models.Filter;
import co.edu.univalle.models.FilterType;
import co.edu.univalle.services.estudiante.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryConfigurationSource;
import org.springframework.stereotype.Repository;
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
        log.info("filtro a aplicar: \n"+filter.toString());
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
                return  Collections.singletonList(
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
                default:
                return Collections.emptyList();
        }
    }

    @Override
    public boolean validateParams(List<Object> params) {
        if (!validateAllParamsNoNull(params)) throw new RuntimeException("Todos los parametros no pueden ser nulos");
        return true;
    }

    @Override
    public boolean validateAllParamsNoNull(List<Object> params) {
        List<Object> collect = params.stream().filter(Objects::isNull).collect(Collectors.toList());
        return params.size() != collect.size();
    }

    @Override
    public HashMap<String, Object> getParamsMap(List<Object> params) {
//        List<Object> params = Arrays.asList(periodo,coleAreaUbicacion, coleBilingue, coleCaracter, coleJornada, genero,
//                municipio,accesoInternet);

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
