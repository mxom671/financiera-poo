/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class CuentaPremium extends CuentaAhorros {
    private final double bono;

    public CuentaPremium(String titular, String numeroCuenta, double saldoInicial, double bono) {
        super(titular, numeroCuenta, saldoInicial);
        this.bono = bono;
    }

    @Override
    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto + bono;
            System.out.println("Consignacion PREMIUM exitosa. Bono de $" + bono + " aplicado.");
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }
}

//prueba de commit