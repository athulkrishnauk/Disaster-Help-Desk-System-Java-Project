<%@include file="header6.jsp" %>
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
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="1348" border="1">
    <tr>
      <td width="79">Subject</td>
      <td width="163">Details</td>
      <td width="105">Date</td>
    </tr>
    <%
        //String loginid=session.getAttribute("lid").toString();
        ArrayList<Districtnotificationmodel> ad=new ArrayList<Districtnotificationmodel>();
        all_service as=new all_service();
        ad=as.districtnotificationcmnview();
        
        for(Districtnotificationmodel dd:ad)
        {
        %>
    <tr>
        <td><%=dd.getSubject()%></td>
        <td><%=dd.getDetails()%></td>
        <td><%=dd.getDate()%></td>
    </tr>
        <%
        }
            %>
  </table>
</form>
</body>
</html>
  <%@include file="Footer6.jsp" %>