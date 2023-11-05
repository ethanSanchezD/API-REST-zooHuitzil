/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * Clase de configuracion para la documentacion de la API en Swagger 
 * @author ethan
 */
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Link del Proyecto en GitHub",
                        url = "https://github.com/ethanSanchezD/API-REST-zooHuitzil"
                ),
                description = "Documentacion de la ApiRest de un proyecto escolar",
                title = "zooHuitzil especificacion de la ApiRest - TheQuery-Squad",
                version = "1.0",
                license = @License(
                        name = "Curso de Fundamentos de bases de datos",
                        url = "https://www.fciencias.unam.mx/docencia/horarios/presentacion/347452"
                )
                
        ),
        servers = {
            @Server (
                    description = "Servidor local",
                    url = "http://localhost:8080"
            )
        }
        
)
public class OpenApiConfig {
    
}
