/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.controller;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import com.thequery_squad.Practica08_TheQuerySquad.service.BiomaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Clase controlador para los endpoints del CRUD
 * Contiene las anotaciones:
 * @RestController Que es una anotacion de Spring que permite que la clase sea una clase controlador
 * para arquitectura rest
 * 
 * @RequestMapping Es la anotacion que usa Spring para que el http raiz se ejecute en 
 * localhost::8080/zooHuitzil
 */
@RestController
@RequestMapping("/zooHuitzil")
@Tag(name = "Bioma")
public class BiomaController {
    
    /**
     * Anotacion @Resource que le indica a Spring que esa clase necesita ser inyectada
     */
    @Resource
    BiomaService biomaService;
    
     /**
     * Metodo que lista todos los proveedores 
     * Tiene la anotacion @GetMapping("/bioma") que va a ser el http donde va a estar
     * esta peticion de tipo GET
     * @return Una lista de todos los biomas
     */
    
    @Operation(
            description = "Obtiene una lista de toda la informacion de la tabla Bioma de la base de datos",
            summary = "Una lista con la informacion de la tabla Bioma",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200"
                )}
    )
    @GetMapping("/bioma")
    public List<Bioma> getBiomas(){
        return biomaService.getAll();
    }
    
    /**
     * Metodo que devuelve un bioma dado su ID
     * Tiene la anotacion  @GetMapping("/bioma/{idbioma}") que va a ser el http donde va a estar
     * esta peticion de tipo GET
     * Tambien contiene la anotacion @PathVariable que es una anotacion de Spring usada para 
     * indicarle que en los parametros del http, viene el RFC del proveedor. 
     * 
     * @param IDBioma El ID del bioma que queremos obtener
     * @return Una lista de todos los biomas
     */
    @Operation(
            description = "Obtiene toda la informacion de un Bioma de la base de datos dado un ID",
            summary = "Devuelve la informacion de un bioma dado su ID",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200"
                )}
    )

    @GetMapping("/bioma/{idbioma}")
    public Bioma getBiomaById(@PathVariable(name="idbioma") int IDBioma){
        return biomaService.getByID(IDBioma);
    }
    
    /**
     * Metodo que inserta un bioma a la base de datos
     * Tiene la anotacion @PostMapping("/bioma") que indica el cuerpo del http
     * a la peticion POST 
     * Tambien tiene la anotacion @RequestBody que le indica a Spring que el bioma 
     * que le pasamos por parametro viene en el cuerpo de la peticion
     * 
     * @param bioma El proveedor que queremos insertar a la base de datos
     * @return El numero de filas afectadas por la peticion
     */
    @Operation(
            description = "Inserta un nuevo Bioma en la base de datos dada su informacio",
            summary = "Inserta la informacion de un Bioma",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200"
                )}
    )
    @PostMapping("/bioma")
    public String saveBioma(@RequestBody Bioma bioma){
        return "No. de filas insertadas: " + biomaService.insertBioma(bioma);
    }
    
    /**
     * Metodo que actualiza a un bioma dado su ID
     * Contiene las anotaciones @RequestBody que indica que el bioma que queremos 
     * actualizar viene en el cuerpo de la peticion
     * Y @PathVariable que indica que el ID que queremos actualizar en la bd viene en el parametro 
     * de la peticion  
     * @param bioma El bioma que queremos actualizar 
     * @param IDBioma El ID del bioma a actualizar 
     * @return El numero de filas afectadas por la peticion 
     */
    @Operation(
            description = "Actualiza la informacion de un Bioma de la base de datos dada la nueva informacion dado su ID",
            summary = "Actualiza la informacion de un Bioma dado su ID",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200"
                )}
    )
    @PutMapping("/bioma/{idbioma}")
    public String updateBioma(@RequestBody Bioma bioma, @PathVariable(name="idbioma") int IDBioma){
        return "Numero de filas actualizadas: " + biomaService.updateBioma(bioma, IDBioma);
    }
    
    /**
     * Metodo que elimina a un bioma de la base de datos dado su ID
     * Contiene la anotacion @PathVariable que indica que el ID que queremos actualizar en la bd viene en el parametro 
     * de la peticion.
     * 
     * @param IDBioma El ID del bioma a eliminar 
     * @return El numero de filas afectadas por la peticion
     */
    @Operation(
            description = "Elimina toda la informacion de un Bioma de la base de datos dado un ID",
            summary = "Elimina la informacion de un bioma dado su ID",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200")}
    )
    @DeleteMapping("/bioma/{idbioma}")
    public String deleteBiomaById(@PathVariable(name="idbioma") int IDBioma){
        return "No. de filas eliminadas" + biomaService.deleteBioma(IDBioma);
    }
}
