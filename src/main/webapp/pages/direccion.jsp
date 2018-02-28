<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Direccion: <s:property value="direccion.nombre" /></h1>
	<br />
	Tipo: <s:property value="direccion.tipo" />
	Direccion: <s:property value="direccion.direccion" />
	Codigo Postal: <s:property value="direccion.codigoPostal" />
	Población: <s:property value="direccion.poblacion" />
	Provincia: <s:property value="direccion.provincia" />
	Pais: <s:property value="direccion.pais" />
	
	

</body>
</html>