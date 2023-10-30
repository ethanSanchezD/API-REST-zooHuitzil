/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.Practica08_TheQuerySquad.service;

import com.thequery_squad.Practica08_TheQuerySquad.model.Proveedor;
import java.util.List;

/**
 *
 * @author ethan
 */
public interface ProveedorService {
    public List<Proveedor> findAll();
    public Proveedor getByRFC(String rfc);
    public int insertProveedor(Proveedor proveedor);
    public int updateOperador(Proveedor proveedor, String rfc);
    public int executeUpdateProveedor(Proveedor proveedor);
    public int deleteProveedor(Proveedor proveedor);

}