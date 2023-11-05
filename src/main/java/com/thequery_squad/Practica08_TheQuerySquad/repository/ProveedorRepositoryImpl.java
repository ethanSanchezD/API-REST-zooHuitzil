/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.repository;
import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * Clase que implementa la interfaz de repositorio
 * Contiene la anotacion @Repository que indica a Spring que en esta clase se van a realizar 
 * todas CRUD en la base de datos 
 * @author ethan
 */
@Repository
public class ProveedorRepositoryImpl implements ProveedorRepository{
      /**
       * Le indica a Spring que esta clase debe ser inyectada
       * Se usara la clase JdbcTemplate que simplifica el uso de JDBC, pues provee
       * metodos que tienen una mejor visualizacion a la hora de ejecutar querys
       * y realizar el mapeo de lo que nos devuelve el query a clases de nuestra logica de negocio
       */  
      @Resource
       JdbcTemplate jdbcTemplate;
    
     /**
     * Metodo que lista todos los proveedores 
     * Utiliza una clase llamada BeanPropertyRowMapper
     * la cual convierte las filas a una instancia de la clase Proveedor
     * @return Una lista de todos los proveedores
     */
    @Override
    public List<Proveedor> findAll() {
        
        return jdbcTemplate.query("SELECT * FROM proveedor", new BeanPropertyRowMapper<>(Proveedor.class));
    }

    /**
     * Metodo que devuelve un proveedor dado su RFC
     * Utiliza tambien BeanPropertyRowMapper para instanciar filas a un objeto
     * @param rfc El RFC del proveedor que queremos obtener
     * @return El proveedor dado su RFC
     */
    @Override
    public Proveedor getByRFC(String rfc) {
        return jdbcTemplate.queryForObject("SELECT * FROM proveedor WHERE rfcproveedor = ?", 
                new BeanPropertyRowMapper<>(Proveedor.class),rfc);
    }

    /**
     * Metodo que inserta un proveedor a la base de datos
     * Utiliza el metodo update de jdbcTemplate el cual dado un query de tipo 
     * insert, update o delete, va a ir modificando los valores ? del query 
     * a lo que se le pase en el arreglo de tipo Object
     * @param proveedor El proveedor que queremos insertar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int insertProveedor(Proveedor proveedor) {
        return jdbcTemplate.
                update("INSERT INTO proveedor (RFCProveedor,"
                        + "Nombre,ApellidoPaterno,"
                        + "ApellidoMaterno,"
                        + "Calle,"
                        + "NumInterior,"
                        + "NumExterior,"
                        + "Colonia,"
                        + "Estado,"
                        + "FechaInicioContrato,"
                        + "FechaFinContrato,"
                        + "FechaNacimiento,"
                        + "Genero,"
                        + "FrecuenciaServicio,"
                        + "CostoServicio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
                , new Object[] {
                    proveedor.getRFCProveedor(),
                    proveedor.getNombre(),
                    proveedor.getApellidoPaterno(),
                    proveedor.getApellidoMaterno(),
                    proveedor.getCalle(),
                    proveedor.getNumInterior(),
                    proveedor.getNumExterior(),
                    proveedor.getColonia(),
                    proveedor.getEstado(),
                    proveedor.getFechaIniciocontrato(),
                    proveedor.getFechaFincontrato(),
                    proveedor.getFechaNacimiento(),
                    proveedor.getGenero(),
                    proveedor.getFrecuenciaServicio(),
                    proveedor.getCostoServcio()});
    }
    
    
    
    /**
     * Metodo que actualiza un proveedor en la base de datos dado su RFC
     * @param proveedor El proveedor a actualizar
     * @param rfc El RFC del proveedor 
     * @return Numero de filas afectadas por el query
     */
    @Override
    public int updateOperador(Proveedor proveedor) {
        return jdbcTemplate.update("UPDATE proveedor SET "
                + "Nombre = ?, "
                + "ApellidoPaterno = ?, "
                + "ApellidoMaterno = ?,"
                + "Calle = ?, "
                + "NumInterior = ?, "
                + "NumExterior = ?, "
                + "Colonia = ?, "
                + "Estado = ?,"
                + "FechaInicioContrato = ?, "
                + "FechaFinContrato = ?, "
                + "FechaNacimiento = ?,"
                + "Genero = ?, "
                + "FrecuenciaServicio = ?, "
                + "CostoServicio = ? WHERE RFCProveedor = ?",
                new Object[] {proveedor.getNombre(),
                    proveedor.getApellidoPaterno(),
                    proveedor.getApellidoMaterno(),
                    proveedor.getCalle(),
                    proveedor.getNumInterior(),
                    proveedor.getNumExterior(),
                    proveedor.getColonia(),
                    proveedor.getEstado(),
                    proveedor.getFechaIniciocontrato(),
                    proveedor.getFechaFincontrato(),
                    proveedor.getFechaNacimiento(),
                    proveedor.getGenero(),
                    proveedor.getFrecuenciaServicio(),
                    proveedor.getCostoServcio(),
                    proveedor.getRFCProveedor()});
    }


    /**
     * Metodo que elimina un proveedor de la base de datos dado su RFC
     * @param rfc El RFC del proveedor a eliminar
     * @return El numero de filas afectadas por el query
     */
    @Override
    public int deleteProveedor(String rfc) {
        return jdbcTemplate.update("DELETE FROM proveedor WHERE rfcProveedor = ?",rfc);
    }

   

    
}
