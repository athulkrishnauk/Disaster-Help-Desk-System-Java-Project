<%@include file="header4.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Campregistrationmodel"%>
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
      <td width="136">Camp Name</td>
      <td width="177">Camp Coordinator Name</td>
      <td width="101">Phone</td>
      <td width="115">Email</td>
      <td width="106">Place</td>
      <td width="117">District</td>
      <td width="92">Total People</td>
      <td width="106">Location View</td>
      <td width="117">Status</td>
      <td width="83">Edit</td>
    </tr>
    <%
        String lid=session.getAttribute("lid").toString();
        ArrayList<Campregistrationmodel> ac=new ArrayList<Campregistrationmodel>();
        all_service as=new all_service();
        ac=as.campownview(lid);
        for(Campregistrationmodel ca:ac)
        {
        %>
    <tr>
        <td><%=ca.getCname()%></td>
        <td><%=ca.getConame()%></td>
        <td><%=ca.getPhone()%></td>
        <td><%=ca.getEmail()%></td>
        <td><%=ca.getPlace()%></td>
        <td><%=ca.getDistrict()%></td>
        <td><%=ca.getTotalp()%></td>
      <td><a target="_blank" href="https://maps.google.com/maps?q=<%=ca.getLati()%>,<%=ca.getLongi()%>">Locate</a></td>
      <td><%=ca.getStatus()%></td>
      <td><a href="Campupdate.jsp?id=<%=ca.getCaid()%>">Update</a></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer4.jsp" %>