<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title>New User</title>
    <link href="/styles/crudapp.css" rel="stylesheet" type="text/css"/>
    <s:head theme="simple"/>
</head>
<body>
<div class="content">
    <s:if test="%{usuario.idusuario != null}">
        <h1>Update User</h1>
    </s:if>
    <s:else>
        <h1>Add New User</h1>
    </s:else>
    <s:form action="saveUsuario" theme="css_xhtml">
        <s:if test="%{usuario.idusuario != null}">
            <s:hidden name="usuario.idusuario"/>
        </s:if>
        Email:<s:textfield name="usuario.email" maxlength="20" id="usuario.email"/>
        <br/>
        Password:<s:textfield name="usuario.password" maxlenght="20" id="usuario.password"/>
        <br>
        <input type="submit" title="Guardar Usuario" value="Guardar Usuario"/>
    </s:form>
    <br/>
</div>
</body>
</html>