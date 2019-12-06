package com.conduent.validate.validatemethod;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class LoginFrom extends ActionForm {

	public String userName;
	public String password;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		System.out.println("Request is in Validate(-,-) method ");
		ActionErrors errors = new ActionErrors();
		if (userName == null || userName.length() < 1) {
			errors.add("userName.required", new ActionMessage(
					"error.userName.required"));
		}
		if (password == null || password.length() < 1) {
			errors.add("password.required", new ActionMessage(
					"error.password.required"));
		}
		System.out.println("Request is in Validate(-,-) method @end ");
		return errors;
	}
}
