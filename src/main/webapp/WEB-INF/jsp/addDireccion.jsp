<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Direcciones</title>
<link href="/styles/crudapp.css" rel="stylesheet" type="text/css" />
<s:head theme="simple" />
</head>
<body>

	<div class="content">
		<s:if test="%{direccion.idDireccion != null}">
			<h1>Actualizar direccion</h1>
		</s:if>
		<s:else>
			<h1>Añadir direccion</h1>
		</s:else>
		<s:form action="saveDireccion" theme="css_xhtml">
			<s:if test="%{direccion.idDireccion != null}">
				<s:hidden name="direccion.idDireccion" />
			</s:if>
        Nombre:<s:textfield name="direccion.nombre" maxlength="20"
				id="direccion.nombre" />
			<br />
        Tipo:<s:textfield name="direccion.tipo" maxlength="20"
				id="direccion.tipo" />
		Direccion:<s:textfield name="direccion.direccion" maxlength="50"
				id="direccion.direccion" />
	 Codigo Postal:<s:textfield name="direccion.codigopostal"
				maxlength="20" id="direccion.codigopostal" />	
		Poblacion:<s:textfield name="direccion.poblacion" maxlength="20"
				id="direccion.poblacion" />
		Provincia:<s:textfield name="direccion.provincia" maxlength="20"
				id="direccion.provincia" />
		Pais:<s:textfield name="direccion.pais" maxlength="20"
				id="direccion.pais" />
			<br />
			<input type="submit" title="Guardar" value="guardar" />
		</s:form>
		<br />
	</div>

</body>
</html>