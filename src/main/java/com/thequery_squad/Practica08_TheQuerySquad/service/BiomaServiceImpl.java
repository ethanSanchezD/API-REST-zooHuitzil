/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.service;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import com.thequery_squad.Practica08_TheQuerySquad.repository.BiomaRepository;
import jakarta.annotation.Resource;
import java.util.List;

/**
 * Clase que implementa los metodos que se usaran en la logica de negocios de la API
 */
public class BiomaServiceImpl implements BiomaService {
    
    /**
     * Le indica a Spring que esta clase debe ser inyectada
     * Usaremos la clase BiomaRepositorio, la cual ya realiza los metodos CRUD
     * por lo que solo hace falta llamarlos en cada metodo de esta clase servicio.
     */
    @Resource
    BiomaRepository biomaRep;

     /**
     * Metodo que lista todos los biomas 
     * 
     * @return Una lista de todos los biomas
     */
    @Override
    public List<Bioma> getAll() {
        return biomaRep.getAll();
    }
    
    /**
     * Metodo que devuelve un bioma dado su ID
     * 
     * @param IDBioma El ID del bioma que queremos obtener
     * @return El bioma dado su ID
     */
    @Override
    public Bioma getByID(int IDBioma) {
        return biomaRep.getByID(IDBioma);
    }

    
    /**
     * Metodo que inserta un bioma a la base de datos
     * 
     * @param bioma El bioma que queremos insertar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int insertBioma(Bioma bioma) {
        return biomaRep.insertBioma(bioma);
    }

     /**
     * Metodo que actualiza un bioma en la base de datos dado su ID
     * @param bioma El bioma a actualizar
     * @param IDBioma El ID del bioma
     * @return Numero de filas afectadas por el query
     */
    @Override
    public int updateBioma(Bioma bioma, int IDBioma) {
        return biomaRep.updateBioma(bioma,IDBioma);
    }

   
     /**
     * Metodo que elimina un bioma de la base de datos dado su RFC
     * @param IDBioma El ID del bioma a eliminar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int deleteBioma(int IDBioma) {
        return biomaRep.deleteBioma(IDBioma);
    }
}
