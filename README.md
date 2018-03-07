# SpringZ

## Proyecto extendido de SpringZ en el cual se le añade una crud de empleados donde puedes añadir, eliminar modificar e insertar empleados.

## A tener en cuenta:
Debemos de crear nuestra base de datos, en este caso db1, les dejo el archivo para hacerlo.
Debemos tener en cuenta nuestro usuario y contraseña, ya que posiblemente sean diferentes, en dicho caso, tendremos que modificar el archivo database.properties dentro de WEB-INF

## Ejecutar
Simplemente ejecutamos dentro de la carpeta de nuestro proyecto:
<code>mvn clean install jetty:run</code>

Acto seguido, accedemos desde nuestro navegador a:
http://localhost:9999/employee

Y listo, ya podemos empezar a tocar nuestro programa.

## Funcionamiento:
En la página principal, tendremos una lista de nuestros empleados en la cual, si le damos a uno, nos aparecerá su información y nos dejara modificarla asi como eliminar a este empleado.

En la página principal tambien es donde podremos añadir un nuevo empleado
