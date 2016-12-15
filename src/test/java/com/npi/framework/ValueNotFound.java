package com.npi.framework;

public class ValueNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValueNotFound(String Key) {
		super(Key);
	}

}
