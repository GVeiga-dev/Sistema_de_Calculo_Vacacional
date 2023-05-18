package Apoyo;

// Curso Java desde cero #10 | Sistema de control vacacional //

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0;
        int antiguedad = 0;


        System.out.println("*************************************************");
        System.out.println("** Bienvenido al Sistema de Calculo Vacacional **");
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("¿Cual es el nombre del trabajador?");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.println("¿Cuantos años de servicio tiene el trabajador?");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("¿Cual es la clave del trabajador?");
        clave = entrada.nextInt();
        System.out.println("");


        // Clave 1 ATENCION AL CLIENTE.
        if (clave == 1) {
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");
            } else {
                System.out.println("El trabajador " + nombre + " no ha generado dias de vacaciones.");
            }


        // Clave 2 LOGISTICA //
        } else if (clave == 2) {
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones.");
            } else {
                System.out.println("El trabajador " + nombre + " no ha generado dias de vacaciones.");
            }

        // Clave 3 GERENCIA //
        } else if (clave == 3) {
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones.");
            } else {
                System.out.println("El trabajador " + nombre + " no ha generado dias de vacaciones.");
            }
            
        } else {
            System.out.println("Error! La clave de departamento ingresada no es correcta");
        }

    }
}
