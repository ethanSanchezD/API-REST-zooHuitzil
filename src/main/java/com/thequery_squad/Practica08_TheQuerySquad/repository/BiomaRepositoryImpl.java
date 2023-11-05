/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.repository;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * * Clase que implementa la interfaz de repositorio
 * Contiene la anotacion @Repository que indica a Spring que en esta clase se van a realizar 
 * todas CRUD en la base de datos 
 */
@Repository
public class BiomaRepositoryImpl implements BiomaRepository {
    
    /**
       * Le indica a Spring que esta clase debe ser inyectada
       * Se usara la clase JdbcTemplate que simplifica el uso de JDBC, pues provee
       * metodos que tienen una mejor visualizacion a la hora de ejecutar querys
       * y realizar el mapeo de lo que nos devuelve el query a clases de nuestra logica de negocio
       */  
    @Resource
    JdbcTemplate jdbcTemplate;

    /**
     * Metodo que inserta un bioma a la base de datos
     * Utiliza el metodo update de jdbcTemplate, el cual dado un query de tipo 
     * insert, update o delete, va modificando los valores ? del query 
     * a lo que se le pase en el arreglo de tipo Object
     * @param bioma El bioma que queremos insertar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int insertBioma(Bioma bioma) {
        return jdbcTemplate.update("INSERT INTO Bioma (IDBioma, TipoBioma, CantidadJaulas) VALUES (?,?,?)", new Object[] {bioma.getIDBioma(), bioma.getTipoBioma(), bioma.getCantidadJaulas()});
    }

    /**
     * Metodo que actualiza un bioma en la base de datos dado su ID
     * @param bioma El bioma a actualizar
     * @param IDBioma El ID del bioma 
     * @return Numero de filas afectadas por el query
     */
    @Override
    public int updateBioma(Bioma bioma, int IDBioma) {
        return jdbcTemplate.update("UPDATE Bioma SET IDBioma=?, TipoBioma=?, CantidadJaulas=? WHERE IDBioma=?", new Object[] {IDBioma, bioma.getTipoBioma(), bioma.getCantidadJaulas()});
    }

    /**
     * Metodo que elimina un bioma de la base de datos dado su ID
     * @param IDBioma El ID  del bioma a eliminar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int deleteBioma(int IDBioma) {
        return jdbcTemplate.update("DELETE FROM Bioma WHERE IDBioma=?", IDBioma);
    }
    
     /**
     * Metodo que lista todos los biomas
     * Utiliza una clase llamada BeanPropertyRowMapper
     * la cual convierte las filas a una instancia de la clase Bioma
     * @return Una lista de todos los biomas
     */
    @Override
    public List<Bioma> getAll() {
        return jdbcTemplate.query("SELECT * FROM Bioma", new BeanPropertyRowMapper<>(Bioma.class));
    }

    /**
     * Metodo que devuelve un bioma dado su ID
     * Utiliza tambien BeanPropertyRowMapper para instanciar filas a un objeto
     * @param IDBioma El ID del bioma que queremos obtener
     * @return El bioma dado su ID
     */
    @Override
    public Bioma getByID(int IDBioma) {
        return jdbcTemplate.queryForObject("SELECT * FROM Bioma WHERE IDBioma=?", new BeanPropertyRowMapper<>(Bioma.class), IDBioma);
    }
    
}
