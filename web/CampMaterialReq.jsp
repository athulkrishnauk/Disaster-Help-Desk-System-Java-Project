<%@include file="header4.jsp" %>
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
    
	if(document.getElementById("mtype").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("a").style.visibility="hidden";
	}
        
        
        
        
        if(document.getElementById("details").value=="")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("b").style.visibility="hidden";
	}
        
        
                return flag;
	}
    
</script>

</head>
<%
    String lid=session.getAttribute("lid").toString();
    %>

<body>
<form id="form1" name="form1" method="post" action="Campmaterialreqservlet">
  
    
    <table width="500" border="0" align="center" style="margin-top: 30px">
      
    <tr>
        <input type="hidden" name="ids" value="<%=lid%>"/>
      <td width="300">Material Type</td>
      <td>
      <input type="text" name="material" id="mtype" /></td>
      <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Details</td>
      <td>
      <textarea name="details" id="details" cols="45" rows="5"></textarea></td>
      <td><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="SUBMIT" onclick="return validate();"/>
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
        <%@include file="Footer4.jsp" %>