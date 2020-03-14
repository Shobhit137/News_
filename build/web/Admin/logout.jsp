<%-- 
    Document   : logout
    Created on : 15 Mar, 2020, 1:43:03 AM
    Author     : shobh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("../login.jsp");
            %>
    </body>
</html>
