<%@include file="header1.jsp" %>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<%
  session.getAttribute("lid").toString();
%>
<script>
    
    
    function validate()
	{
	var flag=true;
    
	if(document.getElementById("reply").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("a").style.visibility="hidden";
	}
        
        
        return flag;
	}
        
    
    
    
    
    </script>
</head>
<%
    String id=request.getParameter("id");
    %>
<body>
<form id="form1" name="form1" method="post" action="Complaintreplyservlet">
    <table width="458" border="0" align="center">
    <tr>
        <input type="hidden" name="ids" value="<%=id%>"/>
      <td width="129">Complaint Reply</td>
      <td width="313"><label for="textarea"></label>
      <textarea name="reply" id="reply" cols="45" rows="5"></textarea></td>
      <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="REPLY" onclick="return validate();"/>
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
        <%@include file="Footer1.jsp" %>