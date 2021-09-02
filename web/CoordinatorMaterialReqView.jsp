<%@include file="header3.jsp" %>
<%@page import="Modalpackage.Materialreqviewmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Materialmodel"%>
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
      <td width="117">Material Type</td>
      <td width="120">Details</td>
      <td width="111">Date</td>
      <td width="111">Camp Name</td>
      <td width="111">Camp Coordinator Name</td>
      <td width="111">Phone</td>
      <td width="111">Email</td>
      <td width="111">Place</td>
      <td width="129">Action</td>
    </tr>
    <%
        String lid=session.getAttribute("lid").toString();
        ArrayList<Materialreqviewmodel> am=new ArrayList<Materialreqviewmodel>();
        all_service as=new all_service();
        am=as.coordinatormaterialreqview(lid);
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
        <td><p><a href="Materialreqapproveservlet?id=<%=mm.getMid()%>">Approve</a></p>
            <p><a href="Materialreqrejectservlet?id=<%=mm.getMid()%>">Reject</a></p></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
  
    <%@include file="Footer3.jsp" %>