/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almacena los parametros de la cuenta
 * @author MarioY
 */
public class CCuenta {
	/*Variable que indica el nombre del usuario de la cuenta*/
    private String nombre;
    /*Variable que almacena el numero de cuenta*/
    private String cuenta;
    /*Variable que almacena el saldo total de la cuenta*/
    private double saldo;
    /*Variable que almacena el valor del interes de la cuenta*/
    private double tipoInteres;

    /**
     * Constructor vacio de la clase cuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase cuenta
     * @param nom: nombre del titular
     * @param cue: numero de cuenta
     * @param sal: saldo disponible
     * @param tipo: tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Metodo publico que informa del saldo 
     * @return saldo disponible
     */
    public double estado()
    {
        return getSaldo();
    }
	/**
	 * Metodo publico que aumenta del saldo la cantidad indicada
	 * @param cantidad: valor que quiero aumentar
	 * @throws Exception excepcion que controla la cantidades negativas
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
	 * Metodo publico que disminuye del saldo la cantidad indicada
	 * @param cantidad: valor que quiero disminuir
	 * @throws Exception excepcion que controla la cantidades negativas
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

}
