<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Comenzando con Spring MVC</title>
 </head>
 <body>
 <form method="POST" action="basicForm">
  <h1 style="color: green; text-align: center;">Insertar nuevo empleado</h1>
    Id:<input type="text" name="id"/><br>
    Nombre:<input type="text" name="name"/><br>
    Email:<input type="text" name="email"/><br>
    Direccion:<input type="text" name="address"/><br>
    Telefono:<input type="text" name="telephone"/><br>
  <input id="submit" type="submit" tabindex="5" value="insert">
 </form>
 </body>
</html>