<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Admincollectormodel"%>
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
      <td width="140">Collector Name</td>
      <td width="139">District</td>
      <td width="139">Phone</td>
      <td width="210">Email</td>
      <td width="104">Edit</td>
    </tr>
    <%
        ArrayList<Admincollectormodel> al=new ArrayList<Admincollectormodel>();
        all_service as=new all_service();
        al=as.collectorview();
        for(Admincollectormodel ad:al)
        {
        
        %>
      <tr>
          <td><%=ad.getName()%></td>
          <td><%=ad.getDistrict()%></td>
          <td><%=ad.getPhone()%></td>
          <td><%=ad.getEmail()%></td>
          <td><a href="Collectorupdate.jsp?id=<%=ad.getId() %>">Update</a></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer1.jsp" %>