<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Panel de Usuario</title>
<link type="text/css" rel="stylesheet" href="./styles/crudapp.css" />
</head>
<body>
	<div class="data">


		<a href="index.jsp"> Inicio</a>
		<s:a action="loadDatosUsuario">Mi cuenta</s:a>
		<br /> <br />

		<table border="0" cellpadding="4" cellspacing="0">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Teléfono</th>
				<th>Edit</th>
				<!-- 		<th>Delete</th> -->
			</tr>

			<tr>
				<td><s:property value="datosUsuario.idUsuario" /></td>
				<td><s:property value="datosUsuario.nombre" /></td>
				<td><s:property value="datosUsuario.apellidos" /></td>
				<td><s:property value="datosUsuario.telefono" /></td>
				<td><s:a cssClass="edit"></s:a></td>
				<!-- 		<td><s:a action="deleteUser?user.id=%{#user.id}"
							cssClass="delete"></s:a></td> -->
			</tr>
		</table>
		<s:a action="direccionesUsuario">Mis direcciones</s:a>
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
		<br />
		<s:a action="newArticulo" cssClass="add">Añadir articulo</s:a>
		<br />
		<table border="0" cellpadding="4" cellspacing="0">
            <tr>
                <th>Titulo</th>
                <th>Descripcion</th>
                <th>Categoria</th>

            </tr>
            <s:iterator value="articulos" id="articulo">
                <tr>
                    <td><s:property value="%{#articulo.titulo}"/></td>
                    <td><s:property value="%{#articulo.descripcion}"/></td>
                    <td><s:property value="%{#articulo.categoria}"/></td>
      
                    <td><s:a action="newArticulo?articulo.idArticulo=%{#articulo.idArticulo}" cssClass="edit"></s:a></td>
                    <td><s:a action="deleteArticulo?articulo.idArticulo=%{#articulo.idArticulo}" cssClass="delete"></s:a></td>
                </tr>
            </s:iterator>
        </table>
		<br />
	</div>
</body>
</html>