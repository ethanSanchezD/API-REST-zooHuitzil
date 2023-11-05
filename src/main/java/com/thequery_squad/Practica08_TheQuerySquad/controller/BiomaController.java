/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.controller;

import com.thequery_squad.Practica08_TheQuerySquad.model.Bioma;
import com.thequery_squad.Practica08_TheQuerySquad.repository.BiomaRepository;
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
 *
 * @author melif
 */
@RestController
@RequestMapping("/zooHuitzil")
public class BiomaController {
    
    @Autowired
    private BiomaRepository biomaRep;
    
    @GetMapping("/bioma")
    public List<Bioma> getBiomas(){
        return biomaRep.getAll();
    }
    
    @GetMapping("/bioma/{idbioma}")
    public Bioma getBiomaById(@PathVariable int IDBioma){
        return biomaRep.getByID(IDBioma);
    }
    
    @PostMapping("/bioma")
    public String insertBioma(@RequestBody Bioma bioma){
        return biomaRep.insertBioma(bioma)+" No. of rows saved to the database";
    }
    
    @PutMapping("/bioma/{idbioma}")
    public String updateBioma(@RequestBody Bioma bioma, @PathVariable int IDBioma){
        return biomaRep.updateBioma(bioma, IDBioma)+"No. of rows updated to the database";
    }
    
    @DeleteMapping("/bioma/{IDBioma}")
    public String deleteBiomaById(@PathVariable int IDBioma){
        return biomaRep.deleteBioma(IDBioma)+"No. of rows deleted from the database";
    }
}
