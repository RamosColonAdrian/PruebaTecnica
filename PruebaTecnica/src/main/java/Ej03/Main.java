package Ej03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horasTrabajadas = leerHorasTrabajadas();
        double tarifa = leerTarifa();
        double sueldo = calcularSueldo(horasTrabajadas, tarifa);
        System.out.println("El sueldo es: " + sueldo);
    }

    /**
     * Metodo que lee las horas trabajadas de un empleado y las valida
     * @return horas trabajadas ingresadas
     */
    public static int leerHorasTrabajadas(){
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese las horas trabajadas: ");
                horasTrabajadas = sc.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: entrada no válida. Ingrese un valor entero.");
                sc.nextLine();
            }
        }
        return horasTrabajadas;
    }

    /**
     * Metodo que lee la tarifa por hora de un empleado
      * @return tarifa ingresada
     */
    public static double leerTarifa(){
        Scanner sc = new Scanner(System.in);
        double tarifa = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese la tarifa por hora: ");
                tarifa = sc.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: entrada no valida. Ingrese un valor decimal.");
                sc.nextLine();
            }
        }
        return tarifa;
    }

    /**
     * Metodo que calcula el sueldo de un empleado segun las horas trabajadas y la tarifa por hora
     * @param horasTrabajadas
     * @param tarifa
     * @return
     */
    public static double calcularSueldo(int horasTrabajadas, double tarifa){
        double sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifa;
        } else {
            int horasExtras = horasTrabajadas - 40;
            sueldo = 40 * tarifa + horasExtras * tarifa * 1.5;
        }
        return sueldo;
    }

}
