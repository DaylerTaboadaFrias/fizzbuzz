package com.example.fizzbuzz;


import java.util.Scanner;

import com.example.fizzbuzz.Logic.SerieFizzBuzz;

public class Main {
    static SerieFizzBuzz serieFizzBuzz = new SerieFizzBuzz();;
    public static void main(String[] args) {
        while (true) {
            System.out.println("Bienvenido al juego FizzBuzz");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir del juego");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Juego FizzBuzz");
                System.out.print("Ingrese un numero de 1 al 100: ");
                int numero = scanner.nextInt();
                serieFizzBuzz.setNumero(numero);
                String resultado = serieFizzBuzz.verificarMultiplo();
                System.out.print("La salida es : ");
                System.out.println(resultado);
                
            } else if (opcion == 2) {
                System.out.println("Juego terminado");
                break;
            } else {
                System.out.println("Opcion no valida, intente de nuevo.");
            }
            
        }
        
    }
}