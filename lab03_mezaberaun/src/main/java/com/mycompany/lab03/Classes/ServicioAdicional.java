/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author aleramirez
 */
public abstract class ServicioAdicional extends ServicioLimpieza {
    
    protected ServicioLimpieza servicioBase; 

public ServicioAdicional(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public abstract double calcularPrecioFinal();
    public abstract String getDescripcion();
    
}

