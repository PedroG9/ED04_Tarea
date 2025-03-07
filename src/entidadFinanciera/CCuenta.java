/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase que representa una cuenta bancaria.
 * Contiene información sobre el titular de la cuenta, el número de cuenta,
 * el saldo actual y el tipo de interés asociado.
 */
public class CCuenta {

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta El número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo El saldo a establecer en la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés asociado a la cuenta.
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés asociado a la cuenta.
     * @param tipoInterés El tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo disponible en la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta.
     * Inicializa una nueva instancia de CCuenta sin valores predeterminados.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta con valores iniciales.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return this.getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Mensaje de error cuando se intenta retirar una cantidad negativa.
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
}
