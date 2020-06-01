

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Libros</h1>
        <form action="libros" method="post">
            <label>Titulo</label>
            <input type="text" name="titulo" required="">
           <br></br>
            <label>Autor</label>
            <input type="text" name="autor" required="">
            <br></br>
            <label>Resumen</label>
            <br></br>
            <textarea name="resumen" cols="30" rows="10" required=""></textarea>
            <br></br>
            <label>Medio</label>
            <br></br>
            <input type="radio" name="medio" value="Fisico" required="">Fisico
            <br>
            <input type="radio" name="medio" value="Magnetico" required="">Magnetico
            <br></br>
            <input type="submit">
        </form>
    </body>
</html>
