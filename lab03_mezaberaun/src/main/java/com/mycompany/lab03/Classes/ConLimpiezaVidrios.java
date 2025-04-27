/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author RYA
 */
public class ConLimpiezaVidrios extends ServicioAdicional{

    public ConLimpiezaVidrios(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        return precioBase + 50;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Limpieza de vidrios añadido con un cargo de $50";
    }
    
}
