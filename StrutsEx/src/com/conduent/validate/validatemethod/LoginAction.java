package com.conduent.validate.validatemethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class LoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("control is in action class");
		LoginFrom loginFrom = (LoginFrom) form;
		String name = loginFrom.getUserName();
		String pwd = loginFrom.getPassword();
		if(name.equals("paramesh") && pwd.equals("paramesh")) {
			return mapping.findForward("success");
		} else{
			return mapping.findForward("fail");
		}
		
	}

}
