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

  <c:forEach var="item" items="${empleado}">

   <form action="/cambiarNombre">
	  <h2 style="color: green;">Nombre</h2>
	    <p>${item.name}<p>
	     <input type="text" value="" var="item" name="nombre">
     
    <input id="submit" type="submit" tabindex="5" value="cambiarNombre">
	</form>

	<form action="/cambiarEmail">
	  <h2 style="color: green;">Email</h2>
	    <p>${item.email}<p>
	     <input type="text" value="" var="item" name="email">
     
    <input id="submit" type="submit" tabindex="5" value="cambiarEmail">
	</form>

	<form action="/cambiarDireccion">
	  <h2 style="color: green;">Direccion</h2>
	    <p>${item.address}<p>
	     <input type="text" value="" var="item" name="address">
     
    <input id="submit" type="submit" tabindex="5" value="cambiarDireccion">
	</form>

	<form action="/cambiarTelefono">
	  <h2 style="color: green;">Telefono</h2>
	    <p>${item.telephone}<p>
	     <input type="text" value="" var="item" name="telephone">
     
    <input id="submit" type="submit" tabindex="5" value="cambiarTelefono">
	</form>
   </c:forEach>
   <form action="/delete">
   		<h2 style="color: red;">Borrar Empleado</h2>
   		<input id="submit" type="submit" tabindex="5" value="delete">
   </form>
   <a href="http://localhost:9999/employee">Volver</a>  
    </body>
</html>
