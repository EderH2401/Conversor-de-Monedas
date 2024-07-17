package com.alura.conversor.operaciones;

import com.alura.conversor.modelos.Moneda;

import java.util.Scanner;

public class ConvertirCantidad {
    public static void convertir(String divisaBase, String divisaTarget, TasaDeCambio consulta){
        double cantidad;
        double cantidadConvertida;
        Scanner lectura = new Scanner(System.in);

        Moneda divisas = consulta.buscarTasa(divisaBase, divisaTarget);
        System.out.println("Ingresa la cantidad que quieres convertir a " + divisaTarget);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * divisas.conversion_rate();
        System.out.println("Actualmente " +cantidad+ " " +divisaBase+ " equivalen a " +cantidadConvertida+ " "+divisaTarget+ "\n");
    }
}
