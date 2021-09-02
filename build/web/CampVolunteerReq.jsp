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
    
	if(document.getElementById("area").value=="select")
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

<body>
<form id="form1" name="form1" method="post" action="Volunteerreqservlet">
    <table width="600" border="0" align="center" style="margin-top: 30px">
    
    <tr>
      <td>Area of Volunteering</td>
      <td>
        <select name="area" id="area">
            <option value="select">Select Area of Volunteering</option>
            <option value="Doctor">Doctor</option>
            <option value="Health Service">Health Service</option>
            <option value="Electrical Work">Electrical Work</option>
            <option value="Mechanical work ">Mechanical work </option>
            <option value="Civil Work">Civil Work</option>
            <option value="Plumbing work">Plumbing work</option>
            <option value="Vehicle Support">Vehicle Support</option>
            <option value="Cooking">Cooking</option>
            <option value="Relief Operation">Relief Operation</option>
            <option value="Cleaning ">Cleaning </option>
            <option value="Boat Service">Boat service</option>
            <option value="Rock Climbing">Rock Climbing</option>
            <option value="Other">Other</option>
      </select></td>
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