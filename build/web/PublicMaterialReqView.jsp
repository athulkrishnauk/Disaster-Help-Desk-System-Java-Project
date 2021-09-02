<%@page import="Modalpackage.Materialreqviewmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Disasterviewmodel"%>
<%@include file="header6.jsp" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="">
  <table width="1349" border="1">
    <tr>
      <td width="117">Material Type</td>
      <td width="120">Details</td>
      <td width="111">Date</td>
      <td width="111">Camp Name</td>
      <td width="111">Camp Coordinator Name</td>
      <td width="111">Phone</td>
      <td width="111">Email</td>
      <td width="111">Place</td>
      <td width="111">District</td>
      <td width="111">Total People</td>
      <td width="111">Location</td>
    </tr>
    <%
     ArrayList<Materialreqviewmodel> am=new ArrayList<Materialreqviewmodel>();
        all_service as=new all_service();
        am=as.publicmaterialreqview();
        for(Materialreqviewmodel mm:am)
        {
        %>
    <tr>
        <td><%=mm.getMtype()%></td>
        <td><%=mm.getDetails()%></td>
        <td><%=mm.getDate()%></td>
        <td><%=mm.getCa_name()%></td>
        <td><%=mm.getCo_name()%></td>
        <td><%=mm.getPhone()%></td>
        <td><%=mm.getEmail()%></td>
        <td><%=mm.getPlace()%></td>
         <td><%=mm.getDistrict()%></td>
        <td><%=mm.getTotalp()%></td>
        <td><a target="_blank" href="https://maps.google.com/maps?q=<%=mm.getLongi()%>,<%=mm.getLongi()%>">Locate</a></td>
    
    </tr>
    <%
          }
              %>
  </table>
</form>
</body>
</html>

<%@include file="Footer6.jsp" %>
