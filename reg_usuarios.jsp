
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form action="usuario" method="post">
            <label>Nombre: </label>
            <input type="text" name="nombre" required>
            <br></br>
            <label>Apellidos: </label>
            <input type="text" name="apellidos" required>
          <br></br>
            <label>Correo electronico: </label>
            <input type="text" name="correo" required>
           <br></br>
            <label>Contraseña: </label>
            <input type="password" name="password" required>
            <br></br>
            <input type="submit">
        </form>
    </body>
</html>
