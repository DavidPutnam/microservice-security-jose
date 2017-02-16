package io.pivotal.spring.cloud.jose.outbound;

public class InvalidMessageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1230373186457021666L;

	public InvalidMessageException(String message) {
		super(message);
	}

}