<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br /><br/>
		<s:a action="newDireccion" cssClass="add">Añadir direccion</s:a>
		<br />
		<table border="0" cellpadding="4" cellspacing="0">
            <tr>
                <th>Nombre</th>
                <th>Tipo</th>
                <th>Direccion</th>
                <th>Codigo Postal</th>
                <th>Poblacion</th>
                <th>Provincia</th>
                <th>Pais</th>
            </tr>
            <s:iterator value="direcciones" id="direccion">
                <tr>
                    <td><s:property value="%{#direccion.nombre}"/></td>
                    <td><s:property value="%{#direccion.tipo}"/></td>
                    <td><s:property value="%{#direccion.direccion}"/></td>
                    <td><s:property value="%{#direccion.codigopostal}"/></td>
                    <td><s:property value="%{#direccion.poblacion}"/></td>
                    <td><s:property value="%{#direccion.provincia}"/></td>
                    <td><s:property value="%{#direccion.pais}"/></td>
                    <td><s:a action="newDireccion?direccion.idDireccion=%{#direccion.idDireccion}" cssClass="edit"></s:a></td>
                    <td><s:a action="deleteDireccion?direccion.idDireccion=%{#direccion.idDireccion}" cssClass="delete"></s:a></td>
                </tr>
            </s:iterator>
        </table>
</body>
</html>