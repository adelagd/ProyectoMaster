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
    <h1>Lista de usuarios</h1>

    <div class="data">
        <s:a action="newUsuario" cssClass="add">Nuevo Usuario</s:a>
        <s:a href="./WEB-INF/jsp/login.jsp" cssClass="add">Login</s:a>
        
        <br/><br/>
        <table border="0" cellpadding="4" cellspacing="0">
            <tr>
                <th>Id</th>
                <th>Email</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <s:iterator value="usuarios" id="usuario">
                <tr>
                    <td><s:property value="%{#usuario.idusuario}"/></td>
                    <td><s:property value="%{#usuario.email}"/></td>
                    
                    <td><s:a action="newUsuario?usuario.idusuario=%{#usuario.idusuario}" cssClass="edit"></s:a></td>
                    <td><s:a action="deleteUsuario?usuario.idusuario=%{#usuario.idusuario}" cssClass="delete"></s:a></td>
                </tr>
            </s:iterator>
        </table>
        <br/>
        <center>
        <h3>Login</h3>
        <s:form action="login" method="post">
            <s:textfield name="userName" label="Enter User Name" />
            <s:password name="password" label="Enter Password" />
            <s:submit label="Login" />
        </s:form>
    </center>
    </div>
    </div>
</body>
</html>