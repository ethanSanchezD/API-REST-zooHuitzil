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
    List<Proveedor> findAll();
    public void insertOperador(Proveedor proveedor);
    public void updateOperador(Proveedor proveedor);
    public void executeUpdateOperador(Proveedor proveedor);
    public void deleteOperador(Proveedor proveedor);

}
