/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.repository;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author melif
 */
public class BiomaRepositoryImpl implements BiomaRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insertBioma(Bioma bioma) {
        return jdbcTemplate.update("INSERT INTO Bioma (IDBioma TipoBioma CantidadJaulas) VALUES (?,?,?)", new Object[] {bioma.getIDBioma(), bioma.getTipoBioma(), bioma.getCantidadJaulas()});
    }

    @Override
    public int updateBioma(Bioma bioma, int IDBioma) {
        return jdbcTemplate.update("UPDATE Bioma SET IDBioma=?, TipoBioma=?, CantidadJaulas=? WHERE IDBioma=?", new Object[] {IDBioma, bioma.getTipoBioma(), bioma.getCantidadJaulas()});
    }

    @Override
    public int deleteBioma(int IDBioma) {
        return jdbcTemplate.update("DELETE FROM Bioma WHERE IDBioma=?", IDBioma);
    }
    
    @Override
    public List<Bioma> getAll() {
        return jdbcTemplate.query("SELECT * FROM Bioma", new BeanPropertyRowMapper<Bioma>(Bioma.class));
    }

    @Override
    public Bioma getByID(int IDBioma) {
        return jdbcTemplate.queryForObject("SELECT * FROM Bioma WHERE IDBioma=?", new BeanPropertyRowMapper<Bioma>(Bioma.class), IDBioma);
    }
    
}
