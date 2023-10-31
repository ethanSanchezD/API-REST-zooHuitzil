/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Clase Proveedor que vamos a usar en nuestra arquitectura MVC, donde esta clase representa 
 * el modelo de la aplicacion
 * 
 * Se usan anotaciones de la dependecia de Lombok como:
 * @Data que es una anotacion que Lombok provee para que la clase contenga ToString, Getters 
 * y Setters, asi como un constructor con los atributos minimos requeridos para
 * la instancia de la clase.
 * 
 * @AllArgsConstructor Que es una anotacion que nos provee un constructor con todos los atributps 
 * de la clase
 * 
 * @NoArgsConstructor ANotacion que nos provee un constructor sin atributos
 * 
 * Ademas, se hace uso de la anotacion 
 * @JsonProperty la cual se usa para que Spring sepa que en las peticiones http,
 * el nombre del atributo en el cuerpo del JSON es el que le indicamos como argumento en la anotacion
 * por ejemplo para el atributo de apellidoPaterno, le indicamos a spring que en el cuerpo 
 * del JSON de la peticion http, el nombre del atributo esta escrito como ApellidoPaterno
 * @author ethan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    
    
    
    @JsonProperty("RFCProveedor")
    private String RFCProveedor;
    
    @JsonProperty("Nombre")
    private String Nombre;
    
    @JsonProperty("ApellidoPaterno")
    private String apellidoPaterno;
    
    @JsonProperty("ApellidoMaterno")
    private String apellidoMaterno;
    
    @JsonProperty("Calle")
    private String calle;
    
    @JsonProperty("NumInterior")
    private int numInterior;
    
    @JsonProperty("NumExterior")
    private int numExterior;
    
    @JsonProperty("Colonia")
    private String colonia;
    
    @JsonProperty("Estado")
    private String estado;
    
    @JsonProperty("FechaInicioContrato")
    private Date fechaIniciocontrato;
    
    @JsonProperty("FechaFinContrato")
    private Date fechaFincontrato;
    
    @JsonProperty("FechaNacimiento")
    private Date fechaNacimiento;
    
    @JsonProperty("Genero")
    private String genero;
    
    @JsonProperty("FrecuenciaServicio")
    private int frecuenciaServicio;
    
    @JsonProperty("CostoServicio")
    private int costoServcio;
}
