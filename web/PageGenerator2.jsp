<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Table</h1>
        
        <table>
            <%
            for (int row = 0; row < 3; row++){
                out.println("<tr>");
                for(int col = 0; col < 3; col++){
                    out.println("<td>row" + row + "col" + col + "</td>");
                }
            }                    
            %>
        </table>
        
    </body>
</html>
