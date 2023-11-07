/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.service;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import java.util.List;

/**
 *
 * @author melif
 */
public interface BiomaService {
    
    /**
     * Metodo para insertar un bioma a la base de datos
     * @param bioma
     * @return numero de filas afectadas por el query
     */
    public int insertBioma(Bioma bioma);
    
    /**
     * Metodo para actualizar un bioma en la base de datos
     * @param bioma
     * @param IDBioma
     * @return el numero de filas afectadas por el query
     */
    public int updateBioma(Bioma bioma, int IDBioma);
    
    /**
     * Metodo para borrar un bioma de la base de datos
     * @param IDBioma
     * @return El numero de filas afectadas por el query
     */
    public int deleteBioma(int IDBioma);
    
    /**
     * Metodo para obtener una lista de todos los biomas de la base de datos
     * @return Lista de todos los biomas registrados en la base de datos
     */
    public List<Bioma> getAll();
    
    
    /**
     * Metodo para obtener un bioma dado su ID
     * @param IDBioma
     * @return el bioma al que pertenece el ID dado
     */
    public Bioma getByID(int IDBioma);
    
}
