package co.edu.univalle.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelData {
    private Integer id;
    private Gender genderType;
    private Integer score;
    private Integer year;

}
