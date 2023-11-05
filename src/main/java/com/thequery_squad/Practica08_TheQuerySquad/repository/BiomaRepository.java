/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.repository;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import java.util.List;

/**
 * Interfaz que indica que Spring va a usar de informacion
 */
public interface BiomaRepository {
    
    public int insertBioma(Bioma bioma);
    
    public int updateBioma(Bioma bioma, int IDBioma);
    
    public int deleteBioma(int IDBioma);
    
    public List<Bioma> getAll();
    
    public Bioma getByID(int IDBioma);
    
}
