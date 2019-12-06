<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<html:form action="/login">
		<table>
			<tr>
				<td><bean:message key="signFrom.name" /></td>
				<td><html:text property="userName"></html:text></td>
				<td><font color = "red" size= "2"><html:errors property="userName.required" /></font></td>
			</tr>
			<tr>
				<td><bean:message key="signFrom.pwd" /></td>
				<td><html:password property="password"></html:password></td>
				<td><font color = "red" size= "2"><html:errors property = "password.required"/></font></td>
			</tr>
			<tr>
				<td></td>
				<td><html:submit>
						<bean:message key="signFrom.submit" />
					</html:submit></td>
			</tr>
		</table>
	</html:form>
</body>
</html>