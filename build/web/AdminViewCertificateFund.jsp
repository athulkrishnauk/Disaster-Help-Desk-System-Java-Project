<%@include file="header1.jsp" %>
<%@page import="Modalpackage.Certificatefunduser"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Certificatefundmodel"%>
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
      <td width="40">Sl_No</td>
      <td width="84">User</td>
      <td width="84">Gender</td>
       <td width="84">Phone</td>
        <td width="84">Email</td>
      <td width="107">Address</td>
      <td width="152">Details</td>
      <td width="158">File</td>
      <td width="93">Date</td>
      <td width="97">Reply</td>
    </tr>
    <%
        ArrayList<Certificatefunduser> ac=new ArrayList<Certificatefunduser>();
        all_service as=new all_service();
        ac=as.admincerificatefundview();
        int i=0;
        for(Certificatefunduser cf:ac)
        {
            i++;
        %>
    <tr>
        <td><%=i%></td>
        <td><%=cf.getName()%></td>
        <td><%=cf.getGender()%></td>
        <td><%=cf.getPhone()%></td>
        <td><%=cf.getEmail()%></td>
        <td><%=cf.getHoname()%><br><%=cf.getPost()%><br><%=cf.getCity()%><br><%=cf.getDistrict()%><br><%=cf.getPin()%></td>
        <td><%=cf.getDetails()%></td>
        <td><%=cf.getFile()%></td>
        <td><%=cf.getDate()%></td>
        <td><a href="AdminCertificateFundReply.jsp?id=<%=cf.getCfid()%>">Reply</a></td>
           
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer1.jsp" %>