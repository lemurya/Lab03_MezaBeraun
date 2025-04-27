/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author aleramirez
 */
public class ConAromatizante extends ServicioAdicional{

    public ConAromatizante(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        return precioBase + 10;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Aromatizante añadido con un cargo de $10";
    }
    
}
