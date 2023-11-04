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
    <li><a href="#documentacion-del-proyecto">Documentacion del Proyecto</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Acerca del Proyecto

Esta Api-Rest es un proyecto escolar cuyo proposito es implementar un CRUD de dos tablas provenientes de una base de datos realizada en PostGreSQL.


![image](https://github.com/ethanSanchezD/API-REST-zooHuitzil/assets/129548925/0591dc51-de63-44e8-809c-3d9bd7d00796)


<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Hecho con

[![Java][Java.com]][Java-url]
[![SpringBoot][Spring.io]][Spring-Boot-url]
[![PostGreSQL][Postgres.org][Postgres-url]]
[![Maven][Maven.org]][Maven-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Manos a la obra

### Prerequisitos

* Para correr este proyecto, es necesario:

#### Base de Datos
Este proyecto usa PostGreSQL como sistema manejador de bases de datos, además, para conectarse de manera exitosa a la base de datos, es necesaria la siguiente configuracion, aunque si se desea 
* Tener una base de datos llamada "zooHuitzil" de forma local en el puerto 5432, es decir, tener una base de datos en la siguiente ruta: jdbc:postgresql://localhost:5432/zooHuitzil
* Nombre de usuario: postgres
* Contraseña: 1234
 
#### PostMan 
To run this proyect, it is necessary to have Apache Maven at least 3.8.8 version installed, but it is strongly recommended to use the latest release version.
In case you need to install Maven, go to the oficial installation page.

* [Download Apache Maven](https://maven.apache.org/download.cgi)
* [Install Apache Maven](https://maven.apache.org/install.html)
### Installation


1. Clone the repo
   ```sh
   git clone https://github.com/ethanSanchezD/Java-Converter.git
   ```



#### Via commands:

2. Move to repository folder

3. Build proyect
   ```sh
   mvn package
   ```
   or
    ```sh
   mvn clean package
   ```
5. Run Maven project
   ```sh
   java -jar target/JavaConverter-0.0.1-SNAPSHOT.jar
   ```
#### Via IDE (In this example: VS Code)
2. Open the cloned folder in the IDE
3. Run Main class




https://github.com/ethanSanchezD/Java-Converter/assets/129548925/8663b14a-b599-4436-b5ee-d214f07f814d


   



<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- USAGE EXAMPLES -->
## Usage Examples

This project uses a limited currency and measurement units:

* Currency Converter
  * Mexican Peso
  * US Dollar
  * Euro
  * British Pound
  * Japanese Yen
  * South Korean Won   


![Currency-video_1](https://github.com/ethanSanchezD/Java-Converter/assets/129548925/faa7c108-ec99-44b6-980b-ee324ccc6a44)




* Temperature Converter
  * Celsius
  * Fharenheit
  * Kelvins   

![Temperature-video](https://github.com/ethanSanchezD/Java-Converter/assets/129548925/85d50224-61f5-4774-af15-06c3efa90041)



* Weight Converter
  * Kilograms
  * Grams
  * Pounds 

![Weight-video](https://github.com/ethanSanchezD/Java-Converter/assets/129548925/556d9c1f-8405-4137-a216-f3ff2dfc29d6)


* Measure Converter
  * Meter
  * Kilometer
  * Mile
  * Foot


![Measure-converter](https://github.com/ethanSanchezD/Java-Converter/assets/129548925/da328faa-f6d9-4894-bd41-9c64e017ee47)




* Error Managment
  * Different type of wrong inputs was handled as input errors
  
![error-managment](https://github.com/ethanSanchezD/Java-Converter/assets/129548925/8457a443-1ccd-40bf-839a-5ca09cdbe68e)



<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- CONTACT -->
## Contact

Email - ethand.san@gmail.com

Project Link: [https://github.com/ethanSanchezD/Java-Converter](https://github.com/ethanSanchezD/Java-Converter)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* Thanks to [Alura-Latam](https://www.aluracursos.com/?gclid=CjwKCAjwtuOlBhBREiwA7agf1rdySFIHX-ybAQ678Q779VPf4w5GhYMG21A5x9yPvKdORnMzIWK3DBoC6UAQAvD_BwE)
  and [Oracle](https://www.oracle.com/mx/) for give me the oportunity of being part of [Oracle Next Education](https://www.oracle.com/mx/education/oracle-next-education/) and make this project posible.
* [API used in Currency Converter](https://exchangerate.host/#/)

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


