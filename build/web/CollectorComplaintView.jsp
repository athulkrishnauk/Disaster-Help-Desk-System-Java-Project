<%@include file="header2.jsp" %>
<%@page import="Modalpackage.Complaintviewmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Complaintmodel"%>
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
      <td width="40" height="25">Sl_No</td>
      <td width="147">User</td>
      <td width="147">Phone</td>
      <td width="147">Email</td>
      <td width="157">Address</td>
      <td width="157">Department</td>
      <td width="274">Complaints</td>
      <td width="93">Date</td>
      <td width="99">Action</td>
    </tr>
    <%
        ArrayList<Complaintviewmodel> ac=new ArrayList<Complaintviewmodel>();
        all_service as=new all_service();
        ac=as.collectorcomplaintview();
        int i=0;
        for(Complaintviewmodel aa:ac)
        {
            i++;
        %>
    <tr>
      <td><%=i%></td>
      <td><%=aa.getName()%></td>
      <td><%=aa.getPhone()%></td>
      <td><%=aa.getEmail()%></td>
      <td><%=aa.getHoname()%><br><%=aa.getPost()%><br><%=aa.getCity()%><br><%=aa.getDistrict()%><br><%=aa.getDistrict()%></td>
      <td><%=aa.getDepartment()%></td>
      <td><%=aa.getComplaint()%></td>
      <td><%=aa.getCdate()%></td>
      <td><p><a href="complaintforwardservlet?id=<%=aa.getComid()%>">Forward</a></p>
          <p><a href="complaintrejectservlet?id=<%=aa.getComid()%>">Reject</a></p></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer2.jsp" %>