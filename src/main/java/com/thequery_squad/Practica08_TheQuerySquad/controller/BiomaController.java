/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.controller;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import com.thequery_squad.Practica08_TheQuerySquad.repository.BiomaRepository;
import com.thequery_squad.Practica08_TheQuerySquad.service.BiomaService;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    @PostMapping("/bioma")
    public String saveBioma(@RequestBody Bioma bioma){
        return "No. de filas afectadas: " + biomaService.insertBioma(bioma);
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
    @DeleteMapping("/bioma/{idbioma}")
    public String deleteBiomaById(@PathVariable(name="idbioma") int IDBioma){
        return biomaService.deleteBioma(IDBioma)+"No. of rows deleted from the database";
    }
}
