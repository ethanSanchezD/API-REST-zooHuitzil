/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.service;

import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import com.thequery_squad.Practica08_TheQuerySquad.repository.ProveedorRepository;
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
    public Proveedor getByRFC(String rfc) {
        return proveedorRep.getByRFC(rfc);
    }

    @Override
    public int insertProveedor(Proveedor proveedor) {
        return proveedorRep.insertProveedor(proveedor);
    }

    @Override
    public int updateOperador(Proveedor proveedor,String rfc) {
        return proveedorRep.updateOperador(proveedor,rfc);
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
