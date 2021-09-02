<%@include file="header6.jsp" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="Donatewebfundservlet">
    <table width="301" border="0" align="center" style="margin-top: 10px">
    <tr>
      <td width="120">Name</td>
      <td width="165"><label>
        <input type="text" name="name" />
      </label></td>
    </tr>
    <tr>
      <td>Amount</td>
      <td><label>
        <input type="text" name="amount" />
      </label></td>
    </tr>
    <tr>
        <td></td>
      <td colspan="2"><label>
        <div align="center">
          <input type="submit" name="Submit" value="Donate" />
          </div>
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>

<%@include file="Footer6.jsp" %>
