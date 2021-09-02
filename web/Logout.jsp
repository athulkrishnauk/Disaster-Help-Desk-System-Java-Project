<%-- 
    Document   : Logout
    Created on : Oct 11, 2018, 1:54:00 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
            session.removeAttribute("lid");
            response.getWriter().print("<script>alert('Successfully Logout');window.location='header.jsp';</script>");
    %>
    <body>
        
    </body>
</html>
