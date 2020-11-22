package pe.edu.upeu.dpl.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado {

    public static BufferedReader lectora = new BufferedReader(new InputStreamReader(System.in));

    // Tipado de cadena o texto
    public static String lector(String dato) {
        try {
            dato = lectora.readLine();
        } catch (IOException e) {
            System.err.println("Error al leer cadena: " + e.getMessage());
        }

        return dato;
    }

    // Tipado de numeros
    public static int lector(int dato) {
        try {
            dato = Integer.parseInt(lectora.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer entero: " + e.getMessage());
        }

        return dato;
    }

    public static double lector(double dato) {
        try {
            dato = Double.parseDouble(lectora.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer double: " + e.getMessage());
        }

        return dato;
    }

    public static float lector(float dato) {
        try {
            dato = Float.parseFloat(lectora.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer flotante: " + e.getMessage());
        }

        return dato;
    }

    // Tipo desicivo, true o false
    public static boolean lector(boolean dato) {
        try {
            dato = Boolean.parseBoolean(lectora.readLine());
        } catch (IOException e) {
            System.err.println("Error al leer bolleano: " + e.getMessage());
        }

        return dato;
    }
}
