<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Districtnotificationmodel"%>
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
  <table width="521" border="1">
    <tr>
      
      <td width="145">Subject</td>
      <td width="139">Details</td>
      <td width="111">Date</td>
    </tr>
    <%
        String lid=session.getAttribute("lid").toString();
        ArrayList<Districtnotificationmodel> ad=new ArrayList<Districtnotificationmodel>();
        all_service as=new all_service();
        ad=as.districtnoticoordinatorview(lid);
        for(Districtnotificationmodel dn:ad)
        {
        %>
    <tr>
       
        <td><%=dn.getSubject()%></td>
        <td><%=dn.getDetails()%></td>
        <td><%=dn.getDate()%></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>