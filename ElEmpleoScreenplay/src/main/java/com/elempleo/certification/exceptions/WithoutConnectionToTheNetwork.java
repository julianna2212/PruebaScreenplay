package com.elempleo.certification.exceptions;

/**
 * Excepción para controlar la conexión a internet
 * @author juliana.garcia
 */
public class WithoutConnectionToTheNetwork extends AssertionError {

	private static final long serialVersionUID = 1L;
	private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";

	public static String getErrorNetworkMessage() {
		return ERROR_NETWORK_CONNECTION;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public WithoutConnectionToTheNetwork(String message, Throwable cause) {
		super(message, cause);
	}

}
