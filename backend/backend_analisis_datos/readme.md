# Descripción
Para el manejo de los datos y filtros se usa springboot el cual tendra la responsabilidad de esto 
de manera que expone los datos en un api rest.

## Requerimientos
- [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (O superior)


## Controladores
Se exponen los endpoints en la siguiente [ruta](http://localhost:8080/api/api/v1/estudiante), la documentacion de la api esta hecha con 
[swagger.](http://localhost:8080/swagger-ui.html)

## Despliegue
Para poder iniciar la aplicacion:

compilar aplicacion:
```bash
./gradlew bootJar
```
seguidamente ejecutar:
```bash
./gradlew bootRun
```

o simplemente utilice un ide que permita la ejecucion de proyectos en springboot.
