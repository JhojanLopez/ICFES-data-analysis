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

        switch (filter.getType()) {
            case PERIODO:
                return Collections.singletonList(estudianteService.findByPeriodo((Integer) filter.getParamsMap().get("periodo")));
            case PERIODO_UBICACION:
                return Collections.singletonList(
                        estudianteService.findByPeriodoAndUbicacion((Integer) filter.getParamsMap().get("periodo"),
                                String.valueOf(filter.getParamsMap().get("ubicacion"))));
            case PERIODO_GENERO:
                log.info("en periodo genero handler");
                return Collections.singletonList(
                        estudianteRepository.findByPeriodoAndGenero((Integer) filter.getParamsMap().get("periodo"),
                                (Character) filter.getParamsMap().get("genero")));
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
//                municipio, estrato, accesoInternet);

        HashMap<String, Object> response = new HashMap<>();
        if (params.get(0) != null) response.put("periodo", params.get(0));
        if (params.get(1) != null) response.put("ubicacion", params.get(1));
        if (params.get(5) != null) response.put("genero", params.get(5));
        return response;
    }

    @Override
    public Filter getFilter(List<Object> params) {
        HashMap<String, Object> paramsMap = this.getParamsMap(params);
        if (paramsMap.get("periodo") != null && paramsMap.get("genero") != null)
            return new Filter(FilterType.PERIODO_GENERO, paramsMap);
        if (paramsMap.get("periodo") != null && paramsMap.get("ubicacion") != null)
            return new Filter(FilterType.PERIODO_UBICACION, paramsMap);
        if (paramsMap.get("periodo") != null) return new Filter(FilterType.PERIODO, paramsMap);

        return new Filter(FilterType.UNSIGNED, null);
    }

}
