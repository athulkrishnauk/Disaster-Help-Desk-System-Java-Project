<%@include file="header4.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Materialmodel"%>
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
  <table width="1349" border="1">
    <tr>
      <td width="154">Material Type</td>
      <td width="70">Details</td>
      <td width="139">Date</td>
      <td width="103">Status</td>
    </tr>
    <%
        String lid=session.getAttribute("lid").toString();
        ArrayList<Materialmodel> am=new ArrayList<Materialmodel>();
        all_service as=new all_service();
        am=as.campmaterialstatusview(lid);
        for(Materialmodel mm:am)
        {
        %>
    <tr>
        <td><%=mm.getMtype()%></td>
        <td><%=mm.getDetails()%></td>
        <td><%=mm.getDate()%></td>
        <td><%=mm.getStatus()%></td>
        
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer4.jsp" %>