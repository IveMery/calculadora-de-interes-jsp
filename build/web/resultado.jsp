<%-- 
    Document   : resultado
    Created on : 19-07-2023, 13:22:58
    Author     : ivett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Resultado Simulación</title>
    </head>
    <body>
        <nav class="bg-dark text-center text-white p-2"><h1>Calculadora de interés</h1></nav>
        <main class="d-flex justify-content-center vh-100 align-items-center">
            <div class="card p-3 bg-success text-white">
                <h1 class="text-center">Resultado Simulación</h1>
                <div class="text-center"> <%
                    Double interesSimple = (Double) request.getAttribute("interesSimple");
                    if (interesSimple != null) {
                        int interesSimpleEntero = interesSimple.intValue();
                    %>
                    <h2>Datos ingresados</h2>
                    <p>Capital ingresado:$ <%= request.getAttribute("capital")%></p>
                    <p>Tasa de interés anual: <%= request.getAttribute("tasaAnual")%> %</p>
                    <p>Número de años: <%= request.getAttribute("numeroAnios")%> años</p>
                    <h3>Cálculo de Interés <br> $<%= interesSimpleEntero%></h3>
                        <%
                            }
                        %>
                </div>
            </div>
        </main>
    </body>
</html>
