package pe.edu.upeu.dpl.examen;

import pe.edu.upeu.dpl.utils.LeerTeclado;

public class ResolucionExamen {

    public static LeerTeclado teclado = new LeerTeclado();

    public void ejercicio1() {
        int CantAutomoviles, costo = 0, categoria, categoria1 = 0, categoria2 = 0, categoria3 = 0;
        double impuesto = 0, impuestoAPagar = 0;

        // Pedido de datos al usuario
        System.out.println("Cuantos automoviles tienes: ");
        CantAutomoviles = teclado.lector(0);

        for (int i = 1; i <= CantAutomoviles; i++) {
            System.out.println("Carro: " + i);
            System.out.println("Ingrese la categoria a la que pertenece: ");
            categoria = teclado.lector(0);
            System.out.println("Ingrese el valor del carro: ");
            costo = teclado.lector(0);
            if (categoria == 1) {
                impuesto = costo * 0.1;
                categoria1 = (int) (categoria1 + impuesto);
            }
            if (categoria == 2) {
                impuesto = costo * 0.07;
                categoria2 = (int) (categoria2 + impuesto);
            }
            if (categoria == 3) {
                impuesto = costo * 0.05;
                categoria3 = (int) (categoria3 + impuesto);
            }

            impuestoAPagar = impuestoAPagar + impuesto;
            System.out.println("Valor de impuesto del carro" + i + " = " + impuesto);
            System.out.println(" ");
        }
        // Impresion de pantalla
        System.out.println("Carros con categoria 1º : " + categoria1);
        System.out.println("Carros con categoria 2º : " + categoria2);
        System.out.println("Carros con categoria 3º : " + categoria3);
        System.out.println("Total de impuesto a pagar: " + impuestoAPagar);
    }

    public void ejercicio2() {
        int nPartida, nLlegada, multiplicacion;

        // Pedidos de datos al usuario
        System.out.println("Ingresa el numero de partida: ");
        nPartida = teclado.lector(0);
        System.out.println("Ingresa el numero de llegada: ");
        nLlegada = teclado.lector(0);

        // Logica
        for (int i = nPartida; i < nLlegada; i++) {
            System.out.println("\nNumero " + i);
            for (int j = 0; j <= 12; j++) {
                multiplicacion = i * j;
                System.out.println(" " + i + " x " + j + " = " + multiplicacion);
            }
        }
    }

    public void ejercicio3() {
        int i = 1, suma = 0, numero;
        System.out.println("Introduce un número: ");
        numero = teclado.lector(0);

        while (i < numero) {
            if (numero % i == 0) {
                suma = suma + i;
            }
            i++;
        }

        if (suma == numero) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }

    public int ejercicio4(int n, int e) {
        if (e <= 0) {
            return 1;
        } else {
            return n * ejercicio4(n, e - 1);
        }
    }

}
