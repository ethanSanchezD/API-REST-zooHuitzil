/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.controller;

import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import com.thequery_squad.Practica08_TheQuerySquad.service.ProveedorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
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
 * Clase controlador para los endpoints del CRUD Contiene las anotaciones:
 *
 * @RestController Que es una anotacion de Spring que permite que la clase sea
 * una clase controlador para arquitectura rest
 *
 * @RequestMapping Es la anotacion que usa Spring para que el http raiz se
 * ejecute en localhost::8080/zooHuitzil
 * @author ethan
 */
@RestController
@RequestMapping("/zooHuitzil")
@Tag(name = "Proveedor")
public class ProveedorController {

    /**
     * Anotacion @Resource que le indica a Spring que esa clase necesita ser
     * inyectada
     */
    @Resource
    ProveedorService proveedorService;

    /**
     * Metodo que lista todos los proveedores Tiene la anotacion
     *
     * @GetMapping("/proveedor") que va a ser el http donde va a estar esta
     * peticion de tipo GET
     *
     * @return Una lista de todos los proveedores
     */
    @Operation(
            description = "Obtiene una lista de toda la informacion de la tabla Proveedor de la base de datos",
            summary = "Una lista con la informacion de la tabla Proveedor",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200",
                        content = {
                            @Content(
                                    mediaType = "Proveedor/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Proveedor.class)))}
                )}
    )
    @GetMapping("/proveedor")
    public List<Proveedor> getProveedores() {
        return proveedorService.findAll();
    }

    /**
     * Metodo que devuelve un proveedor dado su rfc Tiene la anotacion
     *
     * @GetMapping("/proveedor/{rfc}") que va a ser el http donde va a estar
     * esta peticion de tipo GET Tambien contiene la anotacion @PathVariable que
     * es una anotacion de Spring usada para indicarle que en los parametros del
     * http, viene el RFC del proveedor.
     *
     * @param rfc El rfc del proveedor que queremos obtener
     * @return Una lista de todos los proveedores
     */
    @Operation(
            description = "Obtiene toda la informacion de un Proveedor de la base de datos dado un RFC",
            summary = "Devuelve la informacion de un proveedor dado su rfc",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200"
                )},
            parameters = {
                @Parameter(
                        name = "RFC",
                        description = "RFC del Proveedor",
                        in = ParameterIn.PATH,
                        required = true,
                        example = "UEBR662373EQZ"
                )
            }
    )

    @GetMapping("/proveedor/{rfc}")
    public Proveedor getProveedorByRFC(@PathVariable(name = "rfc") String rfc) {
        return proveedorService.getByRFC(rfc);
    }

    /**
     * Metodo que inserta un proveedor a la base de datos Tiene la anotacion
     *
     * @PostMapping("/proveedor") que indica el cuerpo del http a la peticion
     * POST Tambien tiene la anotacion @RequestBody que le indica a Spring que
     * el proveedor que le pasamos por parametro viene en el cuerpo de la
     * peticion
     *
     * @param proveedor El proveedor que queremos insertar a la base de datos
     * @return El numero de filas afectadas por la peticion
     */
    @Operation(
            description = "Inserta un nuevo Proveedor en la base de datos dada su informacio",
            summary = "Inserta la informacion de un Proveedor",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200",
                        content = @Content(mediaType = "String",examples = {
                    @ExampleObject(value = "Numero de filas actualizadas: 1")})
                )}
    )

    @PostMapping("/proveedor")
    public String saveProveedor(@RequestBody Proveedor proveedor) {
        return "Numero de filas afectadas: " + proveedorService.insertProveedor(proveedor);
    }

    /**
     * Metodo que actualiza a un proveedor dado su rfc Contiene las anotaciones
     *
     * @RequestBody que indica que el proveedor que queremos actualizar viene en
     * el cuerpo de la peticion Y @PathVariable que indica que el RFC que
     * queremos actualizar en la bd viene en el parametro de la peticion
     *
     * @param proveedor El proveedor que queremos actualizar
     * @param rfc El RFC del proveedor a actualizar
     * @return El numero de filas afectadas por la peticion
     */

    @Operation(
            description = "Actualiza la informacion de un Proveedor de la base de datos dada la nueva informacio",
            summary = "Actualiza la informacion de un Proveedor",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200",
                        content = @Content(mediaType = "String",examples = {
                    @ExampleObject(value = "Numero de filas actualizadas: 1")})
                )}
    )
    @PutMapping("/proveedor")
    public String updateProveedor(@RequestBody Proveedor proveedor) {
        return "Numero de filas actualizadas: " + proveedorService.updateOperador(proveedor);

    }

    /**
     * Metodo que elimina a un proveedor de la base de datos dado su RFC
     * Contiene la anotacion @PathVariable que indica que el RFC que queremos
     * actualizar en la bd viene en el parametro de la peticion.
     *
     * @param rfc El RFC del Proveedor a eliminar
     * @return El numero de filas afectadas por la peticion
     */
    @Operation(
            description = "Elimina toda la informacion de un Proveedor de la base de datos dado un RFC",
            summary = "Elimina la informacion de un proveedor dado su rfc",
            responses = {
                @ApiResponse(
                        description = "Success",
                        responseCode = "200",
                        content = @Content(mediaType = "String",examples = {
                    @ExampleObject(value = "Numero de filas actualizadas: 1")})
                )},
            parameters = {
                @Parameter(
                        name = "RFC",
                        description = "RFC del Proveedor",
                        in = ParameterIn.PATH,
                        required = true,
                        example = "UEBR662373EQZ"
                )
            }
    )
    @DeleteMapping("/proveedor/{rfc}")
    public String deleteProveedorByRFC(@PathVariable(name = "rfc") String rfc) {
        return "Numero de filas eliminadas: " + proveedorService.deleteProveedor(rfc);
    }

}
