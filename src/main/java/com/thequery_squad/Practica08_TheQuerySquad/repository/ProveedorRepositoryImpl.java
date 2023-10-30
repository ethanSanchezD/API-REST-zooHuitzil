/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.repository;
import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 *
 * @author ethan
 */
@Repository
public class ProveedorRepositoryImpl implements ProveedorRepository{
      @Autowired
       JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Proveedor> findAll() {
        
        return jdbcTemplate.query("SELECT * FROM proveedor", new BeanPropertyRowMapper<Proveedor>(Proveedor.class));
    }

    @Override
    public Proveedor getByRFC(String rfc) {
        return jdbcTemplate.queryForObject("SELECT * FROM proveedor WHERE rfcproveedor = ?", 
                new BeanPropertyRowMapper<>(Proveedor.class),rfc);
    }

    @Override
    public int insertProveedor(Proveedor proveedor) {
        return jdbcTemplate.
                update("INSERT INTO proveedor (RFCProveedor,Nombre,ApellidoPaterno,ApellidoMaterno,Calle,NumInterior,"
                        + "NumExterior,Colonia,Estado,FechaInicioContrato,FechaFinContrato,"
                        + "FechaNacimiento,Genero,FrecuenciaServicio,CostoServicio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
                , new Object[] {proveedor.getRfCProveedor(),proveedor.getNombre(),
                    proveedor.getApellidoPaterno(),proveedor.getApellidoMaterno(),proveedor.getCalle(),
                proveedor.getNumInterior(),proveedor.getNumExterior(),proveedor.getColonia(),
                proveedor.getEstado(),proveedor.getFechaIniciocontrato(),
                proveedor.getFechaFincontrato(),proveedor.getFechaNacimiento(),proveedor.getGenero(),
                proveedor.getFrecuenciaServicio(),proveedor.getCostoServcio()});
    }

    @Override
    public int updateOperador(Proveedor proveedor, String rfc) {
        return jdbcTemplate.update("UPDATE proveedor SET "
                + "Nombre = ?, ApellidoPaterno = ?, ApellidoMaterno = ?,"
                + "Calle = ?, NumInterior = ?, NumExterior = ?, Colonia = ?, Estado = ?,"
                + "FechaInicioContrato = ?, FechaFinContrato = ?, FechaNacimiento = ?,"
                + "Genero = ?, FrecuenciaServicio = ?, CostoServicio = ? WHERE RFCProveedor = ?",
                new Object[] {proveedor.getNombre(),
                    proveedor.getApellidoPaterno(),proveedor.getApellidoMaterno(),proveedor.getCalle(),
                proveedor.getNumInterior(),proveedor.getNumExterior(),proveedor.getColonia(),
                proveedor.getEstado(),proveedor.getFechaIniciocontrato(),
                proveedor.getFechaFincontrato(),proveedor.getFechaNacimiento(),proveedor.getGenero(),
                proveedor.getFrecuenciaServicio(),proveedor.getCostoServcio(),rfc});
    }

    @Override
    public int executeUpdateProveedor(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteProveedor(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
}
