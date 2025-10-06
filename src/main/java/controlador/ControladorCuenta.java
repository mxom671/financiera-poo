/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.CuentaAhorros;

public class ControladorCuenta {
    private final CuentaAhorros cuenta;

    public ControladorCuenta(CuentaAhorros cuenta) {
        this.cuenta = cuenta;
    }

    public void mostrarDatos() {
        cuenta.mostrarDatos();
    }

    public void reembolso(double monto) {
        cuenta.reembolso(monto);
    }

    public void consignar(double monto) {
        cuenta.consignar(monto);
    }

    public void retirar(double monto) {
        cuenta.retirar(monto);
    }
}
//prueba commit

