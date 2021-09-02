<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.AdminRescueModel"%>
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
    
	if(document.getElementById("baname").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("a").style.visibility="hidden";
	}
        
        
        
        if(document.getElementById("lename").value=="")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("b").style.visibility="hidden";
	}
  
    
    
	if(document.getElementById("frc").value=="Select1")
	{
		document.getElementById("c").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("c").style.visibility="hidden";
	}
  
  
        if(document.getElementById("ph").value=="")
	{
		document.getElementById("d").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("d").style.visibility="hidden";
	}
        
        if(document.getElementById("ph").value.length!=10)

        {

                document.getElementById("d").style.visibility="visible";
		flag= false;

        }
	else
	{
                document.getElementById("d").style.visibility="hidden";
	}



        if(document.getElementById("mail").value=="")
	{
		document.getElementById("e").style.visibility="visible";
		flag= false;
	}
	else
	{
                document.getElementById("e").style.visibility="hidden";
	}
                var emailPat =/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

                var emailid=document.getElementById("mail").value;

                var matchArray = emailid.match(emailPat);

        if (matchArray == null)

        {
                document.getElementById("e").style.visibility="visible";
              
		flag= false;
	}
        else
        {
	      document.getElementById("e").style.visibility="hidden";
        }
        
        
        
        
        if(document.getElementById("dis").value=="Select2")
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
<%
    String ac=request.getParameter("id");
    ArrayList<AdminRescueModel> am=new ArrayList<AdminRescueModel>();
    all_service as=new all_service();
    am=as.rescueupdate(Integer.parseInt(ac));
    for(AdminRescueModel ap:am)
    {
    %>

<body>
<form id="form1" name="form1" method="post" action="Rescueupdateservlet">
  
   <input type="hidden" name="ids" id="textfield" value="<%=ac %>"/> 
   <table width="394" border="0" align="center">  
          
    <tr>
      <td width="164">Battalion Name</td>
      <td width="214">
          <input type="text" name="bname" id="baname" value="<%=ap.getB_name()%>"/></td>
          <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Leader Name</td>
      <td>
          <input type="text" name="lname" id="lename" value="<%=ap.getL_name()%>"/></td>
          <td><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Force</td>
      <td>
        <select name="force" id="frc">
            
            <option value="National Disaster Response Force" <% if(ap.getType().equalsIgnoreCase("National Disaster Response Force")){%>selected="selected"<%}%>>National Disaster Response Force</option>
            <option value="Air Force" <% if(ap.getType().equalsIgnoreCase("Air Force")){%>selected="selected"<%}%>>Air Force</option>
            <option value="Navy" <% if(ap.getType().equalsIgnoreCase("Navy")){%>selected="selected"<%}%>>Navy</option>
            <option value="Army" <% if(ap.getType().equalsIgnoreCase("Army")){%>selected="selected"<%}%>>Army</option>
            <option value="Coast Guard" <% if(ap.getType().equalsIgnoreCase("Coast Guard")){%>selected="selected"<%}%>>Coast Guard</option>
            <option value="Border Security Force" <% if(ap.getType().equalsIgnoreCase("Border Security Force")){%>selected="selected"<%}%>>Border Security Force</option>
            <option value="Central Reserve Police Force" <% if(ap.getType().equalsIgnoreCase("Central Reserve Police Force")){%>selected="selected"<%}%>>Central Reserve Police Force</option>
            <option value="Kerala Police" <% if(ap.getType().equalsIgnoreCase("Kerala Police")){%>selected="selected"<%}%>>Kerala Police</option>
            <option value="Fire Force" <% if(ap.getType().equalsIgnoreCase("Fire Force")){%>selected="selected"<%}%>>Fire Force</option>
            
      </select></td>
            <td><div  id="c" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Number of Members</td>
      <td>
          <input type="text" name="member" id="textfield4" value="<%=ap.getNo_members()%>"/></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td>
          <input type="text" name="phone" id="ph" value="<%=ap.getPhone()%>"/></td>
          <td><div  id="d" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Email</td>
      <td>
          <input type="text" name="email" id="mail" value="<%=ap.getEmail()%>"/></td>
          <td><div  id="e" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>District</td>
      <td>
          <select name="district" id="dis" style="width: 172px">
            <option value="Kasargode"  <% if(ap.getDistrict().equalsIgnoreCase("Kasargode")){ %> selected="selected" <%}%>>Kasargode</option>
            <option value="Kannur"<% if(ap.getDistrict().equalsIgnoreCase("Kannur")){ %> selected="selected" <%}%>>Kannur</option>
            <option value="Wayanad" <% if(ap.getDistrict().equalsIgnoreCase("Wayanad")){ %>selected="selected" <%}%>>Wayanad</option>
             <option value="Kozhikode" <% if(ap.getDistrict().equalsIgnoreCase("Kozhikode")){ %> selected="selected" <%}%>>Kozhikode</option>
             <option value="Malappuram"<% if(ap.getDistrict().equalsIgnoreCase("Malappuram")){%>selected="selected"<%}%>>Malappuram</option>
            <option value="Palakkad"<% if(ap.getDistrict().equalsIgnoreCase("Palakkad")){ %> selected="selected" <%}%>>Palakkad</option>
            <option value="Thrissur"<% if(ap.getDistrict().equalsIgnoreCase("Thrissur")){ %> selected="selected" <%}%>>Trissur</option>
            <option value="Ernakulam"<% if(ap.getDistrict().equalsIgnoreCase("Ernakulam")){ %> selected="selected" <%}%>>Ernakulam</option>
            <option value="Kottayam"<% if(ap.getDistrict().equalsIgnoreCase("Kottayam")){ %> selected="selected" <%}%>>Kottayam</option>
            <option value="Alappuzha"<% if(ap.getDistrict().equalsIgnoreCase("Alappuzha")){ %> selected="selected" <%}%>>Alappuzha</option>
            <option value="Idukki"<% if(ap.getDistrict().equalsIgnoreCase("Idukki")){ %> selected="selected" <%}%>>Idukki</option>
            <option value="Pathanamthitta"<% if(ap.getDistrict().equalsIgnoreCase("Pathanamthitta")){ %> selected="selected" <%}%>>Pathanamthitta</option>
            <option value="Kollam"<% if(ap.getDistrict().equalsIgnoreCase("Kollam")){ %> selected="selected" <%}%>>Kollam</option>
            <option value="Thiruvanathapuram"<% if(ap.getDistrict().equalsIgnoreCase("Thiruvanathapuram")){ %> selected="selected" <%}%>>Thiruvanathapuram</option>
      </select></td>
      <td><div  id="f" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
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
  
    <%@include file="Footer1.jsp" %>