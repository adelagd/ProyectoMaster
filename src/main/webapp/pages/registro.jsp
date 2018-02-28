<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro</title>


</head>
<body>

		<h3>Login</h3>
        <s:form action="altaUsuario" method="post">
            <s:textfield name="usuario.email" label="Enter User Name" />
            <s:password name="usuario.password" label="Enter Password" />
            <s:submit label="Login" />
        </s:form>

</body>
</html>