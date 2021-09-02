<%@include file="header5.jsp" %>
<%@page import="Modalpackage.Disasterviewmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Disastermodel"%>
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
      
      <td width="129">User Name</td>
      <td width="175">Phone</td>
      <td width="156">Address</td>
      <td width="114">Disaster Type</td>
      <td width="114">Details</td>
      <td width="134">File</td>
      <td width="120">Place</td>
      <td width="121">District</td>
      <td width="86">Date</td>
    </tr>
    <%
        ArrayList<Disasterviewmodel> ad=new ArrayList<Disasterviewmodel>();
        all_service as=new all_service();
        ad=as.disasterview();
        for(Disasterviewmodel aa:ad)
        {
       
        %>
    <tr>
        <td><%=aa.getName()%></td>
        <td><%=aa.getPhone()%></td>
        <td><%=aa.getHoname()%><br><%=aa.getPost()%><br><%=aa.getCity()%><br><%=aa.getPin()%></td>
        <td><%=aa.getType()%></td>
        <td><%=aa.getDetails()%></td>
        <td><img src="disaster/<%=aa.getFile()%>" width="350px" height="250px"</td>
        <td><%=aa.getPlace()%></td>
        <td><%=aa.getDistrict()%></td>
        <td><%=aa.getDate()%></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer5.jsp" %>