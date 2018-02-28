<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link type="text/css" rel="stylesheet" href="./styles/crudapp.css"/>
</head>
<body>
<div class="content">
    <h1>List Of Users</h1>

 		<div class="data">
			<s:a action="newDatosArticulo" cssClass="add">Add New User</s:a>
			<br />
			<br />
			<table border="0" cellpadding="4" cellspacing="0">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<s:iterator value="datosArticulos" id="datosArticulo">
					<tr>
						<td><s:property value="%{#datosArticulo.titulo}" /></td>
						<td><s:property value="%{#datosArticulo.descripcion}" /></td>
						<td><s:property value="%{#datosArticulo.idusuario}" /></td>
						<td><s:a action="newDatosArticulo?datosArticulo.idArticulo=%{#datosArticulo.idArticulo}" cssClass="edit"></s:a></td>
						<td><s:a action="deleteDatosArticulos?datosArticulo.idArticulo=%{#datosArticulo.idArticulo}"
								cssClass="delete"></s:a></td>
					</tr>
				</s:iterator>
			</table>
			<br />
		</div>
    </div>
</body>
</html>