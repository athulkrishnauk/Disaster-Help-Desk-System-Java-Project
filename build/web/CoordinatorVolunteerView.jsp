<%@include file="header3.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Volunteermodel"%>
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
      <td width="147">Volunteer Name</td>
      <td width="147">Gender</td>
      <td width="147">Phone</td>
      <td width="137">Email</td>
      <td width="155">Address</td>
      <td width="159">Organization</td>
      <td width="150">Area of Volunteering</td>
    </tr>
    <%
        ArrayList<Volunteermodel> av=new ArrayList<Volunteermodel>();
        all_service as=new all_service();
        av=as.coordinatorvolunteerview();
        for(Volunteermodel vv:av)
        {
        
        %>
    <tr>
        <td><%=vv.getV_name()%></td>
        <td><%=vv.getGender()%></td>
        <td><%=vv.getPhone()%></td>
        <td><%=vv.getEmail()%></td>
        <td><%=vv.getHoname()%><br><%=vv.getPost()%><br><%=vv.getCity()%><br><%=vv.getDistrict()%><br><%=vv.getState()%><br><%=vv.getPin()%></td>
        <td><%=vv.getOrg()%></td>
        <td><%=vv.getArea()%></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
  
     <%@include file="Footer3.jsp" %>