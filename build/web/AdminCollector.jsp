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
    
	if(document.getElementById("cname").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("a").style.visibility="hidden";
	}
  
    
    
	if(document.getElementById("dis").value=="Select")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("b").style.visibility="hidden";
	}
  
  
        if(document.getElementById("ph").value=="")
	{
		document.getElementById("c").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("c").style.visibility="hidden";
	}
        
        if(document.getElementById("ph").value.length!=10)

        {

                document.getElementById("c").style.visibility="visible";
		flag= false;

        }
	else
	{
                document.getElementById("c").style.visibility="hidden";
	}



        if(document.getElementById("mail").value=="")
	{
		document.getElementById("d").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("d").style.visibility="hidden";
	}
                var emailPat =/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

                var emailid=document.getElementById("mail").value;

                var matchArray = emailid.match(emailPat);

        if (matchArray == null)

        {
                document.getElementById("d").style.visibility="visible";
              
		flag= false;
	}
        else
        {
	      document.getElementById("d").style.visibility="hidden";
        }
   
   
   
        if(document.getElementById("passw").value=="")
	{
		document.getElementById("e").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("e").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("cpassw").value=="")
	{
		document.getElementById("f").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("f").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("passw").value!=document.getElementById("cpassw").value)
        {
                document.getElementById("f").style.visibility="visible";
		flag= false;
        }
        else
        {
                document.getElementById("f").style.visibility="hidden";
        }
                return flag;
	}
        

        

    
    </script>

</head>

<body>
<form id="form1" name="form1" method="post" action="Admincollectorservlet">
    <br>
    <table width="363" border="0" align="center">
    <tr>
      <td width="300">Collector Name</td>
      <td width="172">
      <input type="text" name="name" id="cname" /></td>
      <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>

    </tr>
    <tr>
      <td>District</td>
      <td>
          <select name="district" id="dis" style="width: 158px">
            <option value="Select">Select District</option>
            <option value="Kasargode">Kasargode</option>
            <option value="Kannur">Kannur</option>
            <option value="Wayanad">Wayanad</option>
             <option value="Kozhikode">Kozhikode</option>
            <option value="Malappuram">Malappuram</option>
            <option value="Palakkad">Palakkad</option>
            <option value="Thrissur">Trissur</option>
            <option value="Ernakulam">Ernakulam</option>
            <option value="Kottayam">Kottayam</option>
            <option value="Alappuzha">Alappuzha</option>
            <option value="Idukki">Idukki</option>
            <option value="Pathanamthitta">Pathanamthitta</option>
            <option value="Kollam">Kollam</option>
            <option value="Thiruvanathapuram">Thiruvanathapuram</option>
      </select></td>
      <td ><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>

    </tr>
    <tr>
      <td>Phone</td>
      <td>
      <input type="text" name="phone" id="ph" /></td>
      <td ><div  id="c" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>

    </tr>
    <tr>
      <td>Email</td>
      <td>
          <input type="email" name="email" id="mail" /></td>
          <td ><div  id="d" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Password</td>
      <td>
          <input type="password" name="pass" id="passw" /></td>
          <td ><div  id="e" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>

    </tr>
    <tr>
        <td width="300">Confirm Password</td>
      <td>
          <input type="password" name="cpass" id="cpassw" /></td>
      <td width="116"><div  id="f" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>

    </tr>
    <tr>
        <td colspan="2" width="300"><div align="center">
        <input type="submit" name="button" id="button" value="REGISTER" onclick="return validate();"/>
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>

<%@include file="Footer1.jsp" %>