package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Clase principal de la aplicación
 */

public class Main {

    public static void main(String[] args) {
        
        // Crea un objeto de la clase CCuenta
        
        CCuenta objetoCuenta;
        double saldoActual;
        
        // Inicializar el objetoCuenta con valores: nombre, cuenta, saldo y tipoInteres
        
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        // Obtiene el saldo usando el método estado() de CCuenta
        
        saldoActual = objetoCuenta.estado();
        
        //Muestra el saldo actual por consola
        
        System.out.println("El saldo actual es"+ saldoActual );
        
        // Prueba la función ingresar()
        probarIngresar(objetoCuenta, saldoActual, null);
        
        // Prueba la función retirar()
        probarRetirar(objetoCuenta, saldoActual, null);
    
    }

    /*
     * Función para probar el método retirar de CCuenta
     * @param objetoCuenta Objeto cuenta en el que se prueba
     * @param saldoActual Saldo de la cuenta
     * @param cantidadEsperada No se utiliza
     */
    
    private static void probarRetirar(CCuenta objetoCuenta, double saldoActual, Object cantidadEsperada) {
        try {
            // Se intenta retirar el saldo actual
            objetoCuenta.retirar(saldoActual);
            
        } catch (Exception ex) {
            // Se registra un error si ocurre la excepción
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * Función para probar el método ingresar de CCuenta
     * @param objetoCuenta Objeto cuenta en el que se prueba
     * @param saldoActual Salfo de la cuenta
     * @param cantidadEsperada No se utiliza
     */
    
    private static void probarIngresar(CCuenta objetoCuenta, double saldoActual, Object cantidadEsperada) {
        try {
            // Se intenta ingresar el saldo actual
            objetoCuenta.ingresar(saldoActual);
            
        } catch (Exception ex) {
            //Se registra un error si ocurre la excepción
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
