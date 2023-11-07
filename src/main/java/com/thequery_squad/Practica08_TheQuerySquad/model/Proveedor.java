/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.sql.Date;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase Proveedor que vamos a usar en nuestra arquitectura MVC, donde esta
 * clase representa el modelo de la aplicacion
 *
 * Se usan anotaciones de la dependecia de Lombok como:
 *
 * @Data que es una anotacion que Lombok provee para que la clase contenga
 * ToString, Getters y Setters, asi como un constructor con los atributos
 * minimos requeridos para la instancia de la clase.
 *
 * @AllArgsConstructor Que es una anotacion que nos provee un constructor con
 * todos los atributps de la clase
 *
 * @NoArgsConstructor ANotacion que nos provee un constructor sin atributos
 *
 * Ademas, se hace uso de la anotacion
 * @JsonProperty la cual se usa para que Spring sepa que en las peticiones http,
 * el nombre del atributo en el cuerpo del JSON es el que le indicamos como
 * argumento en la anotacion por ejemplo para el atributo de apellidoPaterno, le
 * indicamos a spring que en el cuerpo del JSON de la peticion http, el nombre
 * del atributo esta escrito como ApellidoPaterno
 * @author ethan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {

    @JsonProperty("RFCProveedor")
    @Schema(name = "RFCProveedor", example = "JEAC7410065E", requiredMode = Schema.RequiredMode.REQUIRED)
    private String RFCProveedor;

    @JsonProperty("Nombre")
    @Schema(name = "Nombre", example = "Ardyth", requiredMode = Schema.RequiredMode.REQUIRED)
    private String Nombre;

    @JsonProperty("ApellidoPaterno")
    @Schema(name = "ApellidoPaterno", example = "Manilove", requiredMode = Schema.RequiredMode.REQUIRED)
    private String apellidoPaterno;

    @JsonProperty("ApellidoMaterno")
    @Schema(name = "ApellidoMaterno", example = "Chatain", requiredMode = Schema.RequiredMode.REQUIRED)
    private String apellidoMaterno;

    @JsonProperty("Calle")
    @Schema(name = "Calle", example = "Old Gate", requiredMode = Schema.RequiredMode.REQUIRED)
    private String calle;

    @JsonProperty("NumInterior")
    @Schema(name = "NumInterior", example = "27", requiredMode = Schema.RequiredMode.REQUIRED)

    private int numInterior;

    @JsonProperty("NumExterior")
    @Schema(name = "NumExterior", example = "68", requiredMode = Schema.RequiredMode.REQUIRED)

    private int numExterior;

    @JsonProperty("Colonia")
    @Schema(name = "Colonia", example = "Satélite", requiredMode = Schema.RequiredMode.REQUIRED)

    private String colonia;

    @JsonProperty("Estado")
    @Schema(name = "Estado", example = "Sinaloa", requiredMode = Schema.RequiredMode.REQUIRED)

    private String estado;

    @JsonProperty("FechaInicioContrato")
    @Schema(name = "FechaInicioContrato", type = "string-date", example = "2020-03-03", requiredMode = Schema.RequiredMode.REQUIRED)

    private LocalDate fechaIniciocontrato;

    @JsonProperty("FechaFinContrato")
    @Schema(name = "FechaFinContrato", type = "string-date",example = "2025-04-19", requiredMode = Schema.RequiredMode.REQUIRED)

    private LocalDate fechaFincontrato;

    @JsonProperty("FechaNacimiento")
    @Schema(name = "FechaNacimiento", type = "string-date", example = "1989-08-07", requiredMode = Schema.RequiredMode.REQUIRED)

    private LocalDate fechaNacimiento;

    @JsonProperty("Genero")
    @Schema(name = "Genero", example = "Hombre", requiredMode = Schema.RequiredMode.REQUIRED)

    private String genero;

    @JsonProperty("FrecuenciaServicio")
    @Schema(name = "FrecuenciaServicio", example = "6", requiredMode = Schema.RequiredMode.REQUIRED)

    private int frecuenciaServicio;

    @JsonProperty("CostoServicio")
    @Schema(name = "CostoServicio", example = "5505", requiredMode = Schema.RequiredMode.REQUIRED)

    private int costoServcio;
}
