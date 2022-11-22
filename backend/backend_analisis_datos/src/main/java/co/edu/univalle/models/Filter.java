package co.edu.univalle.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
    private FilterType type;
    private HashMap<String,Object> paramsMap;
}
