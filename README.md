<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->




<!-- PROJECT LOGO -->
<!-- <br />
<div align="center">
  <a href="https://github.com/ethanSanchezD/Java-Converter">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a> -->

<h1 align="center">zooHuitzil API-REST</h1>

  <p align="center">
   Este proyecto es una Api-Rest de dos tablas provenientes de una base de datos hecha en PostGreSQL d
    <br />
    <a href="https://github.com/ethanSanchezD/Java-Converter"><strong>Explora el proyecto »</strong></a>
    <br />
    <br />
    <a href="#usage-examples">Ver Demo del proyecto</a>
    ·
    <a href="https://github.com/othneildrew/Best-README-Template/tree/master">README-Template</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenidos</summary>
  <ol>
    <li>
      <a href="#acerca-del-proyecto">Acerca del proyecto</a>
      <ul>
        <li><a href="#hecho-con">Hecho con</a></li>
      </ul>
    </li>
    <li>
      <a href="#manos-a-la-obra">Manos a la obra</a>
      <ul>
        <li><a href="#prerequisitos">Prerequisitos</a></li>
        <li><a href="#instalacion">Instalacion</a></li>
      </ul>
    </li>
    <li><a href="#ejemplos-de-uso">Ejemplos de Uso</a></li>
    <li><a href="#documentacion-de-la-api">Documentacion de la API</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Acerca del Proyecto

Esta Api-Rest es un proyecto escolar cuyo proposito es implementar un CRUD de dos tablas provenientes de una base de datos realizada en PostGreSQL.


![image](https://github.com/ethanSanchezD/API-REST-zooHuitzil/assets/129548925/95c99566-5400-45c5-9fdb-8f4b880374ea)



<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Hecho con

[![Java][Java.com]][Java-url]
[![SpringBoot][Spring.io]][Spring-Boot-url]
[![PostGreSQL][Postgres.org]][Postgres-url]
[![Maven][Maven.org]][Maven-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Manos a la obra

### Prerequisitos
Para correr este proyecto, es necesario:

#### Base de Datos
Este proyecto usa PostGreSQL como sistema manejador de bases de datos, además, para conectarse de manera exitosa a la base de datos, es necesaria la siguiente configuracion
* Tener una base de datos llamada "zooHuitzil" de forma local en el puerto 5432, es decir, tener una base de datos en la siguiente ruta:
  *localhost:5432/zooHuitzil*
* **Nombre de usuario:** postgres
* **Contraseña:** 1234
* El DDL y DML de la base de datos se encuentra en el proyecti rpincipal, en la siguiente ruta: [proyecto principal](//github.com/ethanSanchezD/Practica08_TheQuery-Squad/tree/main/SQL) 
 
#### PostMan 
Para hacer las pruebas de las rutas HTTP de la API-Rest, usamos PostMan como herramienta para realizarlas:

* [Descargar/Instalar PostMan](https://www.postman.com/downloads/)

#### IDE Apache Neatbeans
Para la realizacion del proyecto se utilizó el IDE de APache Neatbeans, por lo que, para una mejor visualización y accesibilidad, es recomendable usar este IDE para correr la aplicacion
<a>
### Instalacion


1. Clona el repositorio 
   ```sh
   git clone https://github.com/ethanSanchezD/API-REST-zooHuitzil.git
   ```



#### En ApacheNeatbeans:

2. Abre el proyecto en el IDE

3. Correr la clase principal Practica08TheQuerySquadApplication.java en la carpeta src/main/java/com/thequery_squad/Practica08_TheQuerySquad
<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- USAGE EXAMPLES -->
## Ejemplos de uso 

En este proyecto se realizo el CRUD de dos tablas: Proveedor y [Otra tabla] sin embargo en cada tabla es posible hacer las operaciones:

  * Listar toda la informacion de la tabla 
  * Obtener informacion de un dato en la tabla dado un id
  * Insertar un nuevo objeto a la tabla
  * Actualizar un objeto en la tabla 
  * Eliminar un pbjeto de la tabla
**Algunos ejemplos:**

#### Obtener toda linformacion

https://github.com/ethanSanchezD/API-REST-zooHuitzil/assets/129548925/a11dfee3-e2e8-487f-9f85-06e70fddc2d5

#### Obtener objeto dado su id




https://github.com/ethanSanchezD/API-REST-zooHuitzil/assets/129548925/879b59e3-a1ea-44bd-8dca-d31472b1c0e8

#### Eliminar un objeto dado su id

https://github.com/ethanSanchezD/API-REST-zooHuitzil/assets/129548925/5f44b57d-6a02-413c-a660-54e750203856


<p align="right">(<a href="#readme-top">back to top</a>)</p>





## Documentacion de la API

Consideramos que es importante que al realizar una API-RESt, una buena práctica sería documentarla, es por eso que, mediante la herramienta de Swagger, se realizó esta tarea. Esta herramienta nos proporciona un interfaz gráfica en la que podemos observar cada método CRUD que se puede realizar. 
Para poder observar esta interfaz, es importante que se hayan seguido los pasos en <a href="#instalacion">Instalacion</a>. Una vez realizado esos pasos, podemos visitar la siguiente direccion para poder visualizar la documentación de la API:
[Vizualicacion](http://localhost:8080/swagger-ui/index.html)


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[product-screenshot]: \icons\project-screenshot.png
[Java.com]: https://img.shields.io/badge/java-17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/en/
[Spring.io]: https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=Spring&logoColor=white
[Spring-Boot-url]: https://spring.io/projects/spring-boot
[Maven.org]: https://img.shields.io/badge/apache%20maven-3.9.3-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white
[Maven-url]: https://maven.apache.org/index.html
[Postgres.org]:  https://img.shields.io/badge/PostGreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white
[Postgres-url]: https://www.postgresql.org


