package entidadFinanciera;

/**
 * Clase que reprensenta una cuenta bancaria
 * Se guarda el nombre del titular, el número de cuenta, el saldo y el tipo de interés
 */

public class CCuenta {

    /**
     * Devuelve el nombre del titular
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular
     * @param  nombre a poner en la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece número de cuenta
     * @param número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés
     * @param el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Se establecen las variables
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío para crear una cuenta sin valores al inicio
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que crea una cuenta
     * @param nom Nombre del titular
     * @param cue Número de la cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual
     * @return saldo
     */
    
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero
     * @param cantidad a ingresar
     * @throws Exception Se lanza una excepción si se ingresa una cantidad negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero
     * @param cantidad que retira
     * @throws Exception Lanza una excepción si no hay saldo o la cantidad es negativa
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Mensaje de error cuando se intenta retirar una cantidad negativa
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
}


    
   