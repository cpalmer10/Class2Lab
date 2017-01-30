<%-- 
    Document   : WelcomeResponse
    Created on : Jan 30, 2017, 11:19:26 AM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Response</title>
    </head>
    <body>
        <h2>Welcome Response</h2>
        <h1><%out.print(request.getAttribute("greeting"));%></h1>
    </body>
</html>
