<%@include file="header2.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Collectorcoordinatormodel"%>
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
      <td width="142">Coordinator Name</td>
      <td width="97">District</td>
      <td width="129">Phone</td>
      <td width="140">Email </td>
      <td width="129">Edit</td>
    </tr>
    <%
        ArrayList<Collectorcoordinatormodel> ac=new ArrayList<Collectorcoordinatormodel>();
        all_service as=new all_service();
        ac=as.coordinatorview();
        for(Collectorcoordinatormodel ad:ac)
        {
            
        
        %>
    <tr>
        <td><%=ad.getCname()%></td>
        <td><%=ad.getDistrict()%></td>
        <td><%=ad.getPhone()%></td>
        <td><%=ad.getEmail()%></td>
        <td><a href="Coordinatorupdate.jsp?id=<%=ad.getCoid()%>">Update</a></td>
    </tr>
        <%
        }
            %>
  </table>
</form>
</body>
</html>
  
            <%@include file="Footer2.jsp" %>