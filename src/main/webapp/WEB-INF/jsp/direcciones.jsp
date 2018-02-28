<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- TODO - Give relevant name -->
    <title>Struts-Hibernate CRUD App - Reeves</title>
    <link type="text/css" rel="stylesheet" href="./styles/crudapp.css"/>
</head>
<body>
<div class="content">
    <h1>Lista de direcciones</h1>

    <div class="data">
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
        <br/>
    </div>
    </div>
</body>
</html>