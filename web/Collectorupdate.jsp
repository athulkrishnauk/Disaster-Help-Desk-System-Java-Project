<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Admincollectormodel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    String ac=request.getParameter("id");
    ArrayList<Admincollectormodel> am=new ArrayList<Admincollectormodel>();
    all_service as=new all_service();
    am=as.collectorupdate(Integer.parseInt(ac));
    for(Admincollectormodel ap:am)
    {
    %>

<body>
<form id="form1" name="form1" method="post" action="Collectorupdateservlet">
  
    <input type="hidden" name="ids" id="textfield" value="<%=ac %>"/>
    
    <table width="363" align="center" border="0">
      
          <tr>
      <td width="146">Collector Name</td>
      <td width="201">
          <input type="text" name="name" id="cname" value="<%=ap.getName() %> "/></td>
          <td><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>District</td>
      <td>
      
        <select name="district" id="dis" style="width: 172px">
            
            <option value="Kasargode"  <% if(ap.getDistrict().equalsIgnoreCase("Kasargode")){ %> selected="selected" <%}%>>Kasargode</option>
            <option value="Kannur"<% if(ap.getDistrict().equalsIgnoreCase("Kannur")){ %> selected="selected" <%}%>>Kannur</option>
            <option value="Wayanad" <% if(ap.getDistrict().equalsIgnoreCase("Wayanad")){ %>selected="selected" <%}%>>Wayanad</option>
             <option value="Kozhikode" <% if(ap.getDistrict().equalsIgnoreCase("Kozhikode")){ %> selected="selected" <%}%>>Kozhikode</option>
             <option value="Kozhikode"<% if(ap.getDistrict().equalsIgnoreCase("Malappuram")){%>selected="selected"<%}%>>Malappuram</option>
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
            <td ><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td>
          <input type="text" name="phone" id="ph" value="<%=ap.getPhone() %>" /></td>
          <td ><div  id="c" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
    </tr>
    <tr>
      <td>Email</td>
      <td>
          <input type="email" name="email" id="mail" value="<%=ap.getEmail() %>" /></td>
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

<%@include file="Footer1.jsp" %>