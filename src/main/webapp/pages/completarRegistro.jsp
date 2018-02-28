<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/styles/crudapp.css" rel="stylesheet" type="text/css"/>
<title>Completar registro</title>

</head>
<body>
<div class="content">
   <s:if test="%{datosUsuario.idUsuario != null}">
        <h1>Actualizar Datos</h1>
    </s:if>
    <s:else>
        <h1>Añadir Datos</h1>
    </s:else>
	<s:form action="saveDatosUsuario" theme="css_xhtml">
	 <s:if test="%{datosUsuario.idUsuario != null}">
            <s:hidden name="datosUsuario.idUsuario"/>
       </s:if>
		<s:textfield name="datosUsuario.nombre" label="Nombre:" id="datosUsuario.nombre"/>
		<s:textfield name="datosUsuario.apellidos" label="Apellidos:" id="datosUsuario.apellidos"/>
		<s:textfield name="datosUsuario.telefono" label="Telefono:" id="datosUsuario.telefono"/>

		<s:submit label="Guardar" />
	
	</s:form>
	
</div>
</body>
</html>