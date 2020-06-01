

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica N° 3</title>
    </head>
    <body>
        <h1>Registro de Productos</h1>
        <form action="productos" method="post">
            <label>Producto</label>
            <input type="text" name="producto" required>
            <br></br>
            <label>Categoria</label>
            <select name="categoria" required>
                <option value=""></option>
                <option value="Dulces">Dulces</option>
                <option value="Lacteos">Lacteos</option>
                <option value="Gaseosas">Gaseosas</option>
            </select>
           <br></br>
            <label>Existencia</label>
            <input type="text" name="existencia" required>
            <br></br>
            <label>Precio</label>
            <input type="text" name="precio" required>
           <br></br>
            <input type="submit">
        </form>
    </body>
</html>
