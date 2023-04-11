package Ej01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = leerNumero();
        mostrarNumerosParesOImpares(numero);
    }

    // Método para leer un número del usuario
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int numero = sc.nextInt();
        return numero;
    }

    // Método para mostrar los números pares o impares, según el número ingresado
    public static void mostrarNumerosParesOImpares(int numero) {
        if(numero < 0) {
            System.out.println("El numero ingresado debe ser mayor o igual a cero.");
            return;
        }

        if(esPar(numero)) {
            System.out.println("El numero es par");
            mostrarNumerosPares(numero);
        } else {
            System.out.println("El numero es impar");
            mostrarNumerosImpares(numero);
        }
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para mostrar los números pares entre el número ingresado y cero
    public static void mostrarNumerosPares(int numero) {
        for(int i = numero; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
    }

    // Método para mostrar los números impares entre el número ingresado y uno
    public static void mostrarNumerosImpares(int numero) {
        for(int i = numero; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}


