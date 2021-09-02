<%@include file="header2.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Collectorcoordinatormodel"%>
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
                return flag;
	}
        

        

    
    </script>

</head>
<%
    String aa=request.getParameter("id");
    ArrayList<Collectorcoordinatormodel> ac=new ArrayList<Collectorcoordinatormodel>();
    all_service as=new all_service();
    ac=as.coordinatorupdate(Integer.parseInt(aa));
    for(Collectorcoordinatormodel ad:ac)
    {
    %>

<body>
<form id="form1" name="form1" method="post" action="Coordinatorupdateservlet">
    
    <input type="hidden" name="ids" id="textfield" value="<%=aa%>" />
    
    <table width="397" border="0" align="center">
    <tr>
      <td width="156">Coordinator Name</td>
      <td width="225">
          <input type="text" name="cname" id="cname" value="<%=ad.getCname()%>"/></td>
          <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>District</td>
      <td>
          <select name="district" id="dis" style="width: 158px">
            <option value="Kasargode" <%if(ad.getDistrict().equalsIgnoreCase("Kasargode")){%>selected="selected" <%}%>>Kasargode</option>
            <option value="Kannur" <%if(ad.getDistrict().equalsIgnoreCase("Kannur")){%>selected="selected" <%}%>>Kannur</option>
            <option value="Wayanad" <%if(ad.getDistrict().equalsIgnoreCase("Wayanad")){%>selected="selected" <%}%>>Wayanad</option>
             <option value="Kozhikode" <%if(ad.getDistrict().equalsIgnoreCase("Kozhikode")){%>selected="selected" <%}%>>Kozhikode</option>
            <option value="Kozhikode" <%if(ad.getDistrict().equalsIgnoreCase("Malappuram")){%>selected="selected" <%}%>>Malappuram</option>
            <option value="Palakkad" <%if(ad.getDistrict().equalsIgnoreCase("Palakkad")){%>selected="selected" <%}%>>Palakkad</option>
            <option value="Thrissur" <%if(ad.getDistrict().equalsIgnoreCase("Trissur")){%>selected="selected" <%}%>>Trissur</option>
            <option value="Ernakulam" <%if(ad.getDistrict().equalsIgnoreCase("Ernakulam")){%>selected="selected" <%}%>>Ernakulam</option>
            <option value="Kottayam" <%if(ad.getDistrict().equalsIgnoreCase("Kottayam")){%>selected="selected" <%}%>>Kottayam</option>
            <option value="Alappuzha" <%if(ad.getDistrict().equalsIgnoreCase("Alappuzha")){%>selected="selected" <%}%>>Alappuzha</option>
            <option value="Idukki" <%if(ad.getDistrict().equalsIgnoreCase("Idukki")){%>selected="selected" <%}%>>Idukki</option>
            <option value="Pathanamthitta" <%if(ad.getDistrict().equalsIgnoreCase("Pathanamthitta")){%>selected="selected" <%}%>>Pathanamthitta</option>
            <option value="Kollam" <%if(ad.getDistrict().equalsIgnoreCase("Kollam")){%>selected="selected" <%}%>>Kollam</option>
            <option value="Thiruvanathapuram" <%if(ad.getDistrict().equalsIgnoreCase("Thiruvanathapuram")){%>selected="selected" <%}%>>Thiruvanathapuram</option>
      </select></td>
      <td ><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td>
          <input type="text" name="phone" id="ph" value="<%=ad.getPhone()%>" /></td>
           <td ><div  id="c" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Email</td>
      <td>
          <input type="text" name="email" id="mail" value="<%=ad.getEmail()%>"/></td>
          <td ><div  id="d" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
   
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="UPDATE" onclick="return validate();"/>
      </div></td>
    </tr>
    <%
    }
        %>
  </table>
</form>
</body>
</html>
  
        <%@include file="Footer2.jsp" %>