/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.model;

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
    
    private String rfcproveedor;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String calle;
    private int numinterior;
    private int numexterior;
    private String colonia;
    private String estado;
    private Date fechainiciocontrato;
    private Date fechafincontrato;
    private Date fechanacimiento;
    private String genero;
    private int frecuenciaservicio;
    private int costoservcio;
}
