<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Arrticulo</title>
<link href="/styles/crudapp.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="content">
    <s:if test="%{user.id != null}">
        <h1>Actualizar articulo</h1>
    </s:if>
    <s:else>
        <h1>Nuevo articulo</h1>
    </s:else>
    <s:form action="saveArticulo" theme="css_xhtml">
        <s:if test="%{articulo.idArticulo != null}">
            <s:hidden name="articulo.idArticulo"/>
        </s:if>
        Titulo:<s:textfield name="articulo.titulo" maxlength="20" id="articulo.titulo"/>
        <br/>
        Descripcion:<s:textfield name="articulo.descripcion"  id="articulo.descripcion"/>
        <br/>
        Categoría:<s:textfield name="articulo.categoria" maxlenght="20" id="articulo.categoria" />
        <br/>
  <!--       Color:<s:textfield name="articulo.color" maxlenght="20" id="articulo.color" />
        <br/>
       Talla:<s:textfield name="articulo.talla" maxlenght="20" id="articulo.talla" />
        <br/>
        Marca:<s:textfield name="articulo.marca" maxlenght="20" id="articulo.marca" />
        <br/>
        Precio Original:<s:textfield name="articulo.precio_original" maxlenght="20" id="articulo.precio_original" />
        <br/>
        Precio de Venta:<s:textfield name="articulo.precio_venta" maxlenght="20" id="articulo.precio_venta" />
        <br/>
        Envio:<s:textfield name="articulo.precio_envio" maxlenght="20" id="articulo.precio_envio" />
        <br/> -->
        <input type="submit" title="Guardar" value="Guardar"/>
    </s:form>
    <br/>
</div>
</body>
</html>