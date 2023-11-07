/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.service;

import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import com.thequery_squad.Practica08_TheQuerySquad.repository.ProveedorRepository;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * Clase que implementa los metodos que se usaran en la logica de negocios de la API
 * @author ethan
 */
@Service
public class ProveedorServiceImpl implements  ProveedorService{
    /**
     * Le indica a Spring que esta clase debe ser inyectada
     * Usaremos la clase de ProveedorRepositorio, la cual ya realiza los metodos CRUD
     * por lo que solo hace falta llamarlos en cada metodo de esta clase servicio.
     */
    @Resource
    ProveedorRepository proveedorRep;

     /**
     * Metodo que lista todos los proveedores 
     * 
     * @return Una lista de todos los proveedores
     */
    @Override
    public List<Proveedor> findAll() {
        return proveedorRep.findAll();
    }
    
    /**
     * Metodo que devuelve un proveedor dado su RFC
     * 
     * @param rfc El RFC del proveedor que queremos obtener
     * @return El proveedor dado su RFC
     */
    @Override
    public Proveedor getByRFC(String rfc) {
        return proveedorRep.getByRFC(rfc);
    }

    
    /**
     * Metodo que inserta un proveedor a la base de datos
     * 
     * @param proveedor El proveedor que queremos insertar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int insertProveedor(Proveedor proveedor) {
        return proveedorRep.insertProveedor(proveedor);
    }

     /**
     * Metodo que actualiza un proveedor en la base de datos dado su RFC
     * @param proveedor El proveedor a actualizar
     * @param rfc El RFC del proveedor 
     * @return Numero de filas afectadas por el query
     */
    @Override

    public int updateProveedor(Proveedor proveedor, String rfc) {
        return proveedorRep.updateProveedor(proveedor,rfc);

    }

   
     /**
     * Metodo que elimina un proveedor de la base de datos dado su RFC
     * @param rfc El RFC del proveedor a eliminar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int deleteProveedor(String rfc) {
        return proveedorRep.deleteProveedor(rfc);
    }
    

    

    

    

}
