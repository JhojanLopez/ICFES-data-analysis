package co.edu.univalle.models;


public enum Gender {


    MASCULINO(1),
    FEMENINO(2);

    private Integer genderType;

    private Gender(int genderType) {
        this.genderType = genderType;
    }
}
