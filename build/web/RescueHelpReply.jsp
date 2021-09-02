<%@include file="header5.jsp" %>
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
<%
    String id=request.getParameter("id");
    %>
<body>
<form id="form1" name="form1" method="post" action="Helpreplyservlet">
    <table width="458" border="0" align="center">
    <tr>
        <input type="hidden" name="ids" value="<%=id%>"/>
      <td width="129">Reply</td>
      <td width="313"><label for="textarea"></label>
      <textarea name="reply" id="textarea" cols="45" rows="5"></textarea></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="REPLY" />
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
        <%@include file="Footer5.jsp" %>