package com.conduent.basic;

import org.apache.struts.action.ActionForm;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class HelloWorldForm extends ActionForm{
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
