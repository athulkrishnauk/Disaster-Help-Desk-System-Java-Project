<%@include file="header5.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Adminnotificationmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<%
    session.getAttribute("lid").toString();
    %>
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="1348" border="1" >
    <tr>
      <td width="126">Subject</td>
      <td width="119">Details</td>
      <td width="169">Date</td>
    </tr>
    <%
        ArrayList<Adminnotificationmodel> an=new ArrayList<Adminnotificationmodel>();
        all_service as=new all_service();
        an=as.notiview();
        for(Adminnotificationmodel ap:an)
            
        {
        %>
    <tr>
        <td><%=ap.getSubject() %></td>
        <td><%=ap.getDetails() %></td>
        <td><%=ap.getDate() %></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer5.jsp" %>