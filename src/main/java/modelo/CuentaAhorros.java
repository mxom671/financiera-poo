/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class CuentaAhorros{
    protected String titular;
    protected String numeroCuenta;
    protected double saldo;

    // Constructor
    public CuentaAhorros(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("\n--- DATOS DE LA CUENTA ---");
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }

    public void reembolso(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Reembolso exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto invalido para reembolso.");
        }
    }

    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Consignacion exitosa. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }
}
//prueba de commit
