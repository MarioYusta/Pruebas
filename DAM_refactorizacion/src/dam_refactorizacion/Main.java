/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almacena la funcionalidad principal
 * @author MarioYusta
 * @since 3-9-2023
 * @version 1.18
 */
public class Main {

	/**
	 * Metodo principal
	 * @param args: parametros generales
	 */
	public static void main(String[] args) {
		/*variable que almacena los parametros de la cuenta*/
		 CCuenta miCuenta;
		 /*variable que almacena el saldo de la cuenta*/
	        double saldoActual;
	     /*variable que almacena la cantidad de la operacion*/
	        float cantidad = 0;

	        miCuenta = new CCuenta("Beatriz Perez","1000-2365-85-1230456789",200,0);
	        saldoActual = miCuenta.estado();
	        System.out.println("El saldo actual es"+ saldoActual );

	        gestiones(miCuenta, cantidad);
	    }
	/**
	 * Metodo que controla la funcionalidad
	 * @param miCuenta: variable que almacena los valores del objeto acutal
	 * @param cantidad TODO
	 */
	static void gestiones(CCuenta miCuenta, float cantidad) {
		try {
		    miCuenta.retirar(2300);
		} catch (Exception e) {
		    System.out.print("Fallo al retirar");
		}
		try {
		    System.out.println("Ingreso en cuenta");
		    miCuenta.ingresar(695);
		} catch (Exception e) {
		    System.out.print("Fallo al ingresar");
		}
	}

	}


