package Ej01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = leerNumero();
        mostrarNumerosParesOImpares(numero);
    }

    /**
     * Metodo que lee un numero entero
     * @return numero ingresado
     */
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese un numero:");
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("El numero ingresado debe ser mayor o igual a cero.");
                    continue;
                }
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: entrada no válida. Ingrese un valor entero.");
                sc.nextLine();
            }
        }
        return num;
    }

    /**
     * Metodo que muestra los numeros pares o impares entre el numero ingresado y cero
     * o entre el numero ingresado y uno
     * @param numero
     */
    public static void mostrarNumerosParesOImpares(int numero) {
        if(esPar(numero)) {
            System.out.println("El numero es par");
            mostrarNumerosPares(numero);
        } else {
            System.out.println("El numero es impar");
            mostrarNumerosImpares(numero);
        }
    }

    /**
     * Metodo que verifica si un numero es par
     * @param numero
     * @return true si el numero es par, false si es impar
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Metodo que muestra los numeros pares entre el numero ingresado y cero
     * @param numero
     */
    public static void mostrarNumerosPares(int numero) {
        for(int i = numero; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
    }

    /**
     * Metodo que muestra los numeros impares entre el numero ingresado y uno
     * @param numero
     */
    public static void mostrarNumerosImpares(int numero) {
        for(int i = numero; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}


