

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica N° 3</title>
    </head>
    <body>
    <h1>Inscripcion en curso</h1>
    <form action="curso" method="post">
    <label>Nombre: </label>
    <input type="text" name="nombre" required>
    <br></br>
    <label>Apellidos: </label>
    <input type="text" name="apellidos" required>
    <br></br>
    <label>Curso: </label>
    <select name="curso" required>
        <option value=""></option>
        <option value="CSS">css</option>
        <option value="PHP">php</option>
        <option value="MYSQL">mysql</option>
        <option value="HTML 5">html</option>
        
    </select>
    <br></br>
    <input type="submit">
    </form>
    </body>
</html>
