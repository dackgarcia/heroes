# Spring Boot Application - heroes [![Build Status](https://github.com/dackgarcia/heroes)](https://github.com/dackgarcia/heroes)

Este repositorio contiene API-REST que permite el mantenimiento de **SUPER HEROES** 
elaborada para consultar, editar y eliminar con un toque parametrizable, contiene tambien puntos de mejoras:

- [Test de Integración / Test Unitarios](README.md)
- [Anotación personalizada (para algunos endpoints)](README.md)
- [Peticiones en cache](README.md)
- [Documentacion en Swagger](README.md)
- [Seguridad API (Auth Basic)](README.md)
- [Gestion de Excepciones](README.md)
- [Imagen disponible en Docker](README.md)


##### Nota: Este proyecto se desarrollo como una prueba de técnica desde el viernes 25 de Septiembre a las 3:00 p.m. hasta hoy Domingo 26 de Septiembre 2021 a las 5:50 p.m.

## Agradecimiento
Gracias a Dios en primer lugar por darme la salud para concluir con esta prueba de manera exitosa.

## Contribución

Las contribuciones son lo que hacen que la comunidad de código abierto sea un lugar tan increíble para aprender, inspirar y crear. Cualquier contribución que haga será muy apreciada.

## Correr en un Docker Container
El siguiente comando de Docker inicia todas las pruebas ejecutables disponibles dentro de un contenedor de Docker en el puerto 8087 con la imagen de Docker creada anteriormente llamada dackgarcia/heroes-docker:v2

% docker run -e DATABASE_SERVER=jdbc:h2:mem:testdb -dp 8087:8087 dackgarcia/heroes-docker:v2

http://localhost:8087/heroes

David Garcia  - [@dackgarcia](https://twitter.com/dackgarcia) - dackgarcia@gmail.com

Project Link: [https://github.com/dackgarcia/heroes](https://github.com/dackgarcia/heroes)
