package com.alura.conversor.principal;
import com.alura.conversor.operaciones.ConvertirCantidad;
import com.alura.conversor.operaciones.TasaDeCambio;

import java.util.Scanner;
class PrincipalConverter {
    public static void main(String[] args){
        Scanner opcion = new Scanner(System.in);
        TasaDeCambio consulta = new TasaDeCambio();
        String mensajeMenu = """
                ******************************************************
                1. Dolar (USD)           >>>     Peso Argentino (ARS)
                2. Peso Argentino (ARS)  >>>     Dolar (USD)
                3. Dolar (USD)           >>>     Peso Mexicano (MXN)
                4. Peso Mexicano (MXN)   >>>     Dolar (USD)
                5. Dolar (USD)           >>>     Real Brasileño (BRL)
                6. Real Brasileño (BRL)  >>>     Dolar (USD)
                7. Salir de la apliación
                ******************************************************
                """;
        System.out.println("¡Bienvenido a ConverterAlura! :D");
        boolean condicion = true;
        while(condicion) {
            System.out.println("Seleccione el número de la opción correspondiente a la conversión que desea realizar: ");
            System.out.println(mensajeMenu);
            int seleccionUsuario = opcion.nextInt();

            switch(seleccionUsuario) {
                case 1:
                    ConvertirCantidad.convertir("USD", "ARS", consulta);
                    break;
                case 2:
                    ConvertirCantidad.convertir("ARS", "USD", consulta);
                    break;
                case 3:
                    ConvertirCantidad.convertir("USD", "MXN", consulta);
                    break;
                case 4:
                    ConvertirCantidad.convertir("MXN", "USD", consulta);
                    break;
                case 5:
                    ConvertirCantidad.convertir("USD", "BRL", consulta);
                    break;
                case 6:
                    ConvertirCantidad.convertir("BRL", "USD", consulta);
                    break;
                case 7:
                    System.out.println("Saliendo de la apliación...\nGracias por su preferencia");
                    condicion = false;
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione un número del 1 al 7");
                    break;
            }
        }
    }
}
