package co.edu.univalle.database.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;
import javax.persistence.Id;
@Document(value = "estudiante")
@Data
public class Estudiante {
    @Id
    @Column(name = "_id")
    private String id;
    @Field(name = "COLE_AREA_UBICACION")
    private String coleAreaUbicacion;
    @Field(name = "COLE_BILINGUE")
    private String coleBilingue;//opc Si, No
    @Field(name = "COLE_CARACTER")
    private String coleCaracter;
    @Field(name = "COLE_JORNADA")
    private String coleJornada;
    @Field(name = "ESTU_EDAD")
    private Integer edad;
    @Field(name = "ESTU_GENERO")
    private Character genero;
    @Field(name = "ESTU_MCPIO_RESIDE")
    private String municipio;
    @Field(name = "FAMI_TIENEINTERNET")
    private String accesoInternet;//opc Si, No
    @Field(name = "PERIODO")
    private Integer periodo;//opc 2017-2021
    @Field(name = "PUNT_C_NATURALES")
    private Integer puntNaturales;
    @Field(name = "PUNT_INGLES")
    private Integer puntIngles;
    @Field(name = "PUNT_LECTURA_CRITICA")
    private Integer puntLecturaCritica;
    @Field(name = "PUNT_MATEMATICAS")
    private Integer puntMatematicas;
    @Field(name = "PUNT_SOCIALES_CIUDADANAS")
    private Integer puntSociales;
    @Field(name = "PUNT_GLOBAL")
    private Integer puntGlobal;
}
