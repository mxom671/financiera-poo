/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import modelo.CuentaAhorros;
import modelo.CuentaPremium;
import controlador.ControladorCuenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== CREACION DE CUENTA ===");
            System.out.print("Nombre del titular: ");
            String nombre = sc.nextLine();
            
            System.out.print("Numero de cuenta: ");
            String numero = sc.nextLine();
            
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            
            System.out.print("¿Desea cuenta premium? (1=Si, 0=No): ");
            int tipo = sc.nextInt();
            
            ControladorCuenta controlador;
            
            if (tipo == 1) {
                controlador = new ControladorCuenta(new CuentaPremium(nombre, numero, saldo, 5000));
                System.out.println("Cuenta PREMIUM creada con bono de $5000.");
            } else {
                controlador = new ControladorCuenta(new CuentaAhorros(nombre, numero, saldo));
                System.out.println("Cuenta de ahorros creada correctamente.");
            }
            
            int opcion = 0;
            while (opcion != 5) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Mostrar datos");
                System.out.println("2. Reembolso");
                System.out.println("3. Consignar");
                System.out.println("4. Retirar");
                System.out.println("5. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1 -> controlador.mostrarDatos();
                    case 2 -> {
                        System.out.print("Monto del reembolso: ");
                        controlador.reembolso(sc.nextDouble());
                    }
                    case 3 -> {
                        System.out.print("Monto a consignar: ");
                        controlador.consignar(sc.nextDouble());
                    }
                    case 4 -> {
                        System.out.print("Monto a retirar: ");
                        controlador.retirar(sc.nextDouble());
                    }
                    case 5 -> System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    default -> System.out.println("Opcion no válida.");
                }
            }
        }
    }
}

//prueba commit