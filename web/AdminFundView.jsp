<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Fundmodel"%>
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
      <td width="135">Name</td>
      <td width="129">Amount</td>
      <td width="107">Date</td>
    </tr>
    <%
        ArrayList<Fundmodel> af=new ArrayList<Fundmodel>();
        all_service as=new all_service();
        af=as.fundview();
        for(Fundmodel aa:af)
        {
        %>
    <tr>
        <td><%=aa.getName()%></td>
        <td><%=aa.getAmount()%></td>
        <td><%=aa.getDate()%></td>
    </tr>
        <%
        }
            %>
  </table>
</form>
</body>
</html>
            <%@include file="Footer1.jsp" %>