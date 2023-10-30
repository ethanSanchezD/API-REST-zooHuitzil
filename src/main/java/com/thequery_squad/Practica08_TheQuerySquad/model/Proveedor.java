/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author ethan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Proveedor {
    @JsonProperty("RFCProveedor")
    private String RfCProveedor;
    
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
