package co.edu.univalle.database.entities;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;
import javax.persistence.Id;
@Document(value = "data")
@Data
public class IcfesData {
    @Id
    @Column(name = "_id")
    private String id;
    @Field(name = "COLE_AREA_UBICACION")
    private String coleAreaUbicacion;
    @Field(name = "COLE_BILINGUE")
    private String coleBilingue;
    @Field(name = "COLE_CARACTER")
    private String coleCaracter;
    @Field(name = "COLE_DEPTO_UBICACION")
    private String coleDeptoUbicacion;//eliminar
    @Field(name = "COLE_JORNADA")
    private String coleJornada;
    @Field(name = "DESEMP_INGLES")
    private String desempIngles;//eliminar
    @Field(name = "ESTU_EDAD")
    private Integer estuEdad;
    @Field(name = "ESTU_MCPIO_RESIDE")
    private String estuMcpioReside;
    @Field(name = "FAMI_EDUCACIONMADRE")//eliminar
    private String famiEducacionMadre;
    @Field(name = "FAMI_EDUCACIONPADRE")//eliminar
    private String famiEducacionPadre;
    @Field(name = "FAMI_TIENECOMPUTADOR")//eliminar
    private String famiTieneComputador;
    @Field(name = "FAMI_TIENEINTERNET")
    private String famiTieneInternet;
    @Field(name = "PERIODO")
    private Integer periodo;
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
