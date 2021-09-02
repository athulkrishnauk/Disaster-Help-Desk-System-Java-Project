<%@include file="header2.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Campregistrationmodel"%>
<%@page import="java.util.ArrayList"%>
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
      <td width="94">Camp Name</td>
      <td width="195">Camp Coordinator Name</td>
      <td width="132">Phone</td>
      <td width="114">Email</td>
      <td width="118">Place</td>
      <td width="145">District</td>
      <td width="128">Total People</td>
      <td width="126">View Location</td>
    </tr>
    <%
        ArrayList<Campregistrationmodel> am=new ArrayList<Campregistrationmodel>();
        all_service as=new all_service();
        am=as.collectorviewcamp();
        for(Campregistrationmodel ad:am)
        {
            
        
        %>
    <tr>
        <td><%=ad.getCname()%></td>
        <td><%=ad.getConame()%></td>
        <td><%=ad.getPhone()%></td>
        <td><%=ad.getEmail()%></td>
        <td><%=ad.getPlace()%></td>
        <td><%=ad.getDistrict()%></td>
        <td><%=ad.getTotalp()%></td>
        <td><a target="_blank" href="https://maps.google.com/maps?q=<%=ad.getLati()%>,<%=ad.getLongi()%>">Locate</a></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer2.jsp" %>