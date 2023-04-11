package Ej02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String SEXO_MASCULINO = "Hombre";
    private static final String SEXO_FEMENINO = "Mujer";

    public static void main(String[] args) {
        Persona[] personas = leerPersona();
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int hombresMayoresEdad = 0;
        int mujeresMenoresEdad = 0;
        int nunMujeres = 0;
        int totalPersonas = personas.length;
        int porcentajeMayoresDeEdad;
        int porcentajeMujeres;

        for (Persona persona :personas){
            if(persona.getEdad() >= 18){
                mayoresEdad++;
                if (persona.getSexo().equals(SEXO_MASCULINO))
                    hombresMayoresEdad++;
            }else{
                menoresEdad++;
                if (persona.getSexo().equals(SEXO_FEMENINO))
                    mujeresMenoresEdad++;
            }
            if (persona.getSexo().equals(SEXO_FEMENINO))
                nunMujeres++;
        }

        porcentajeMayoresDeEdad = (mayoresEdad * 100) / totalPersonas;
        porcentajeMujeres = (nunMujeres * 100) / totalPersonas;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayoresEdad);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenoresEdad);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdad + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
    }

    /**
     * Crea un array de 50 personas con edades y sexos aleatorios y lo devuelve
     * @return array de personas
     */
    public static Persona[] leerPersona(){
        Persona[] personas = new Persona[50];
        Random rand = new Random();
        for (int i = 0; i < personas.length; i++) {
            Persona p = new Persona();
            p.setEdad(rand.nextInt(100) + 1);
            if (rand.nextInt(2) == 0) {
                p.setSexo(SEXO_MASCULINO);
            } else {
                p.setSexo(SEXO_FEMENINO);
            }
            personas[i] = p;
        }
        return personas;
    }
}


