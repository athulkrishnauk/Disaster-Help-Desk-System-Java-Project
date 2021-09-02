<%@include file="header3.jsp" %>
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
      <td width="98">Camp Name</td>
      <td width="170">Camp Coordinator Name</td>
      <td width="95">Phone </td>
      <td width="121">Email</td>
      <td width="121">Place</td>
      <td width="133">District</td>
      <td width="104">Total People</td>
      <td width="105">Location View</td>
      <td width="88">Action</td>
    </tr>
    <%
        String lid=session.getAttribute("lid").toString();
        ArrayList<Campregistrationmodel> ac=new ArrayList<Campregistrationmodel>();
        all_service as=new all_service();
        ac=as.coordinatorcampview(lid);
        for(Campregistrationmodel cr:ac)
        {
            
        
        %>
    <tr>
        <td><%=cr.getCname()%></td>
        <td><%=cr.getConame()%></td>
        <td><%=cr.getPhone()%></td>
        <td><%=cr.getEmail()%></td>
        <td><%=cr.getPlace()%></td>
        <td><%=cr.getDistrict()%></td>
        <td><%=cr.getTotalp()%></td>
        <td><a target="_blank" href="https://maps.google.com/maps?q=<%=cr.getLati()%>,<%=cr.getLongi()%>">Location</a></td>
      <td><p><a href="Campapproveservlet?id=<%=cr.getCaid()%>">Approve</a></p>
          <p><a href="Camprejectservlet?id=<%=cr.getCaid()%>">Reject</a></p></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer3.jsp" %>