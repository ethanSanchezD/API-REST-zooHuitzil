/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.controller;

import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import com.thequery_squad.Practica08_TheQuerySquad.service.ProveedorService;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ethan
 */
@RestController
@RequestMapping("/zooHuitzil")
public class ProveedorController {
    @Resource
    ProveedorService proveedorService;
    
    @GetMapping(value = "/proveedor")
    public List<Proveedor> getProveedores(){
        return proveedorService.findAll();
    }
    
}
