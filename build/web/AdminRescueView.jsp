<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.AdminRescueModel"%>
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
      <td width="109">Battalion Name</td>
      <td width="107">Leader Name</td>
      <td width="72">Force</td>
      <td width="148">Number of Members</td>
      <td width="134">Phone</td>
      <td width="188">Email</td>
      <td width="142">District</td>
      <td width="106">Edit</td>
    </tr>
    <%
        ArrayList<AdminRescueModel> am=new ArrayList<AdminRescueModel>();
        all_service as=new all_service();
        am=as.rescueview();
        for(AdminRescueModel ap:am)
        {
        %>
    <tr>
        <td><%=ap.getB_name()%></td>
        <td><%=ap.getL_name()%></td>
        <td><%=ap.getType()%></td>
        <td><%=ap.getNo_members()%></td>
        <td><%=ap.getPhone()%></td>
        <td><%=ap.getEmail()%></td>
        <td><%=ap.getDistrict()%></td>
        <td><a href="Rescueupdate.jsp?id=<%=ap.getRid()%>">Update</a></td>
    </tr>
        <%
        }
            %>
  </table>
</form>
</body>
</html>
            <%@include file="Footer1.jsp" %>