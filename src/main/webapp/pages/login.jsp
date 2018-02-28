<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Login</title>
</head>
<body>
	<center>
		<div class="container">

			<h3>Login</h3>
			<s:form action="login" method="post">
				<s:textfield name="usuario.email" label="Enter User Name" />
				<s:password name="usuario.password" label="Enter Password" />
				<s:submit label="Login" />
			</s:form>
		</div>
		<br /> <br />

		<div class="container">
			<h3>Registro</h3>
			<s:form action="saveUsuario" theme="css_xhtml">
				<s:if test="%{usuario.idUsuario != null}">
					<s:hidden name="usuario.idUsuario" />
				</s:if>
        Email:<s:textfield name="usuario.email" maxlength="20"
					id="email" />
				<br />
        Password:<s:password name="usuario.password" maxlength="20"
					id="password" />
				<br />
				<input type="submit" title="Guardar" value="Guardar" />
			</s:form>

		</div>
	</center>

</body>
</html>