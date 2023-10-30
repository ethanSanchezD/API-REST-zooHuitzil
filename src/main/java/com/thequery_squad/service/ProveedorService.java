/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thequery_squad.service;

import com.thequery_squad.model.Proveedor;
import java.util.List;

/**
 *
 * @author ethan
 */
public interface ProveedorService {
    List<Proveedor> findAll();
    public void insertOperador(Proveedor proveedor);
    public void updateOperador(Proveedor proveedor);
    public void executeUpdateOperador(Proveedor proveedor);
    public void deleteOperador(Proveedor proveedor);

}
