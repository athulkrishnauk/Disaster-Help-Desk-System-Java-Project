<%@include file="header6.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Helpmodel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.InetAddress"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="">
    <table width="322" border="1" align="center">
    <tr>
      <td width="153">Status</td>
      <td width="153">Date</td>
    </tr>
    <%
        InetAddress ip=InetAddress.getLocalHost();
        String ips=ip.getHostAddress();
        ArrayList<Helpmodel> hm=new ArrayList<Helpmodel>();
        all_service as=new all_service();
        hm=as.webhelpstatus(ips);
        for(Helpmodel aa:hm)
        {
        %>
    <tr>
        <td><%=aa.getReply()%></td>
        <td><%=aa.getRdate()%></td>
    </tr>
        <%
        }
        %>
  </table>
</form>
</body>
</html>
        <%@include file="Footer6.jsp" %>