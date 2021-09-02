

<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>

<script>
    
     function validate()
	{
	var flag=true;
    
	if(document.getElementById("uname").value=="")
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
        
        
        
         function validate()
	{
	var flag=true;
    
	if(document.getElementById("pwd").value=="")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("b").style.visibility="hidden";
	}
        
    
    </script>


</head>

<body>
<form id="form1" name="form1" method="post" action="Loginservlet">
    <br>
    <table width="266"  border="0" align="center" bgcolor="lightblue">
    <tr>
      <td >Username</td>
      <td ><label for="textfield"></label>
      <input type="text" name="user" id="textfield" /></td>
      <td width="105"><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><label for="textfield2"></label>
          <input type="password" name="pass" id="textfield2" /></td>
          <td><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="LOGIN" onclick="return validate();"/>
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>


