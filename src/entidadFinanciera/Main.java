/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto de la clase CCuenta
        CCuenta objetoCuenta;
        double saldoActual;

        // Inicializar el objetoCuenta con valores: nombre, cuenta, saldo inicial y tipo de interés
        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Obtener el saldo actual usando el método estado() de CCuenta
        saldoActual = objetoCuenta.estado();

        // Mostrar el saldo actual por consola
        System.out.println("El saldo actual es " + saldoActual);

        // Llamar a la función probarIngresar para probar la función ingresar
        probarIngresar(objetoCuenta, saldoActual, null);

        // Llamar a la función probarRetirar para probar la función retirar
        probarRetirar(objetoCuenta, saldoActual, null);
    }

    /**
     * Función para probar el método retirar de la clase CCuenta.
     * @param objetoCuenta El objeto cuenta sobre el que se va a probar la función retirar.
     * @param saldoActual El saldo actual en la cuenta.
     * @param cantidadEsperada No se usa en este caso, pero podría ser útil en el futuro.
     */
    private static void probarRetirar(CCuenta objetoCuenta, double saldoActual, Object cantidadEsperada) {
        try {
            // Intentamos retirar la cantidad igual al saldo actual de la cuenta
            objetoCuenta.retirar(saldoActual);
        } catch (Exception ex) {
            // Si ocurre una excepción, se registra el error
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Función para probar el método ingresar de la clase CCuenta.
     * @param objetoCuenta El objeto cuenta sobre el que se va a probar la función ingresar.
     * @param saldoActual El saldo actual en la cuenta.
     * @param cantidadEsperada No se usa en este caso, pero podría ser útil en el futuro.
     */
    private static void probarIngresar(CCuenta objetoCuenta, double saldoActual, Object cantidadEsperada) {
        try {
            // Intentamos ingresar el saldo actual en la cuenta
            objetoCuenta.ingresar(saldoActual);
        } catch (Exception ex) {
            // Si ocurre una excepción, se registra el error
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
