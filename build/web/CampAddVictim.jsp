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
    
	if(document.getElementById("vname").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("a").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("ph").value=="")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("b").style.visibility="hidden";
	}
        
        if(document.getElementById("ph").value.length!=10)

        {

                document.getElementById("b").style.visibility="visible";
		flag= false;

        }
	else
	{
                document.getElementById("b").style.visibility="hidden";
	}
        
        
        
        
        if(document.getElementById("mail").value=="")
	{
		document.getElementById("c").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("c").style.visibility="hidden";
	}
                var emailPat =/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

                var emailid=document.getElementById("mail").value;

                var matchArray = emailid.match(emailPat);

        if (matchArray == null)

        {
                document.getElementById("c").style.visibility="visible";
              
		flag= false;
	}
        else
        {
	      document.getElementById("c").style.visibility="hidden";
        }
        
        
        
        if(document.getElementById("hname").value=="")
	{
		document.getElementById("d").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("d").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("place").value=="")
	{
		document.getElementById("e").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("e").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("post").value=="")
	{
		document.getElementById("f").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("f").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("city").value=="")
	{
		document.getElementById("g").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("g").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("dis").value=="Select")
	{
		document.getElementById("h").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("h").style.visibility="hidden";
	}
        
        
        
        
        if(document.getElementById("pin").value=="")
	{
		document.getElementById("j").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("j").style.visibility="hidden";
	}
        if(document.getElementById("pin").value.length!=6)

        {

                document.getElementById("j").style.visibility="visible";
		flag= false;

        }
	else
	{
                document.getElementById("j").style.visibility="hidden";
	}

        return flag;
	}
             
      
</script>
</head>
<%
    String lid=session.getAttribute("lid").toString();
    
    
    %>

<body>
<form id="form1" name="form1" method="post" action="Addvictimservlet">
    <table width="392" border="0" align="center">
    <tr>
        <input type="hidden" name="ids" value="<%=lid%>"/>
      <td width="145">Victim Name</td>
      <td width="231"><label for="textfield"></label>
      <input type="text" name="vname" id="vname" /></td>
       <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
       <tr>
      <td width="82">Gender</td>
      <td width="151"><label>
        <input name="gender" type="radio" value="Male" />
      Male 
      <input name="gender" type="radio" value="Female" />
      Female</label></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><label for="textfield2"></label>
      <input type="text" name="phone" id="ph" /></td>
       <td><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><label for="textfield3"></label>
      <input type="text" name="email" id="mail" /></td>
       <td><div  id="c" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
      <tr>
      <td>House Name</td>
      <td><label for="textfield4"></label>
      <input type="text" name="house" id="hname" /></td>
       <td><div  id="d" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label for="textfield4"></label>
      <input type="text" name="place" id="place" /></td>
       <td><div  id="e" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Post</td>
      <td><label for="textfield5"></label>
      <input type="text" name="post" id="post" /></td>
       <td><div  id="f" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>City</td>
      <td><label for="textfield6"></label>
      <input type="text" name="city" id="city" /></td>
       <td><div  id="g" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label for="select"></label>
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
       <td><div  id="h" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Pin</td>
      <td><label for="textfield7"></label>
      <input type="text" name="pin" id="pin" /></td>
       <td><div  id="j" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="ADD" onclick="return validate();"/>
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
      
        <%@include file="Footer4.jsp" %>