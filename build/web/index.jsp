<%-- 
    Document   : calculadora
    Created on : 18-07-2023, 16:14:44
    Author     : ivett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Calculadora de Interes</title>
    </head>
    <body>
        <nav class="bg-dark text-center text-white p-2"><h1>Calculadora de interés</h1></nav>

        <div class="d-flex justify-content-center vh-100 align-items-center">
            <form action="calculadoraservlet" method="POST">
                <label>Ingrese el capital:</label>
                <input type="number" class="form-control" placeholder="100000" name="capital" required /><br>
                <label>Tasa de Interés:</label>
                <input type="number" class="form-control" placeholder="10" name="tasaAnual" required/><br>
                <label>Número de Años:</label>
                <input type="number" class="form-control" placeholder="3" name="numeroAnios" required/><br>
                <input class="btn btn-success" type="submit" value="Calcular"/>
            </form>
        </div>
    </body>
</html>
