<%@include file="header3.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Helpmodel"%>
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
      <td width="106">Name</td>
      <td width="102">Phone </td>
      <td width="86">Place</td>
      <td width="144">Number of Persons</td>
      <td width="110">District</td>
      <td width="140">Details</td>
      <td width="70">Date </td>
      <td width="107">View Location</td>
    </tr>
    <%
        ArrayList<Helpmodel> ah=new ArrayList<Helpmodel>();
        all_service as=new all_service();
        ah=as.collectorhelpview();
        for(Helpmodel ad:ah)
        {
        %>
    <tr>
        <td><%=ad.getName()%></td>
        <td><%=ad.getPhone()%></td>
        <td><%=ad.getPlace()%></td>
        <td><%=ad.getNopersons()%></td>
        <td><%=ad.getDistrict()%></td>
        <td><%=ad.getDetails()%></td>
        <td><%=ad.getDate()%></td>
        <td><a target="_blank" href="https://maps.google.com/maps?q=<%=ad.getLongi()%>,<%=ad.getLati()%>">Location</a></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
  
     <%@include file="Footer3.jsp" %>