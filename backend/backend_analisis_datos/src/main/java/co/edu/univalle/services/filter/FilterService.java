package co.edu.univalle.services.filter;

import co.edu.univalle.models.Filter;
import co.edu.univalle.models.FilterType;

import java.util.HashMap;
import java.util.List;

public interface FilterService {
    List<Object> filterHandler(List<Object> params);
    boolean validateParams(List<Object> params);
    boolean validateAllParamsNoNull(List<Object> params);
    HashMap<String,Object> getParamsMap(List<Object> params);
    Filter getFilter(List<Object> params);
}
