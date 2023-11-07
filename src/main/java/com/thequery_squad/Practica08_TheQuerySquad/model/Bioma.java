/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase Bioma que usaremos en la arquitectura MVC, donde esta clase representa 
 * el modelo de la aplicacion
 * 
 * Se usan anotaciones de la dependecia de Lombok como:
 * @Data que es una anotacion que Lombok provee para que la clase contenga ToString, Getters 
 * y Setters, asi como un constructor con los atributos minimos requeridos para
 * la instancia de la clase.
 * 
 * @AllArgsConstructor Es una anotacion que nos provee un constructor con todos los atributps 
 * de la clase
 * 
 * @NoArgsConstructor Anotacion que nos provee un constructor sin atributos
 * 
 * Tambien se hace uso de la anotacion 
 * @JsonProperty la cual se usa para que Spring sepa que en las peticiones http,
 * el nombre del atributo en el cuerpo del JSON es el que le indicamos como argumento en la anotacion
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bioma {
    
    @JsonProperty("IDBioma")
    private int IDBioma;
    
    @JsonProperty("TipoBioma")
    private String TipoBioma;
    
    @JsonProperty("CantidadJaulas")
    private int CantidadJaulas;
}
