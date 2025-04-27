/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author aleramirez
 */
public class ServicioHogar extends ServicioLimpieza{
    
    private final boolean esApartamento;

    public ServicioHogar(boolean esApartamento, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if (esApartamento){
            precioBase = precioBase * 0.90;
        }
        
        return precioBase;
    }
    
    
}
