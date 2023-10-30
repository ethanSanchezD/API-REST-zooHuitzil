/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.service;

import com.thequery_squad.model.Proveedor;
import com.thequery_squad.repository.ProveedorRepository;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 *
 * @author ethan
 */
@Service
public class ProveedorServiceImpl implements  ProveedorService{
    @Resource
    ProveedorRepository proveedorRep;

    @Override
    public List<Proveedor> findAll() {
        return proveedorRep.findAll();
    }

    @Override
    public void insertOperador(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateOperador(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void executeUpdateOperador(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteOperador(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
