<%@include file="header4.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Campregistrationmodel"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>

</head>
    
    <%
    session.getAttribute("lid").toString();
    %>
<%
    String aa=request.getParameter("id");
    ArrayList<Campregistrationmodel> ac=new ArrayList<Campregistrationmodel>();
    all_service as=new all_service();
    ac=as.campupdate(Integer.parseInt(aa));
    for(Campregistrationmodel cr:ac)
    {
    %>
<body>
    
         <center>
<div  id="googleMap" style="width:70%;height:400px;"></div>
</center>
<script>
function myMap() {
var mapProp= {
    center:new google.maps.LatLng(12.508742,75.120850),
    zoom:5,
};
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

google.maps.event.addListener(map, 'click', function(event) {
    //alert(event.latLng.lat() + ", " + event.latLng.lng());
    document.getElementById("lati").value=event.latLng.lat();
    document.getElementById("longi").value=event.latLng.lng();
});

}
</script>
    <script src="https://maps.googleapis.com/maps/api/js?key=xxxxxxxx &callback=myMap"></script>
    
<form id="form1" name="form1" method="post" action="Campupdateservlet">
    <table width="360" border="0" align="center" style="margin-top: 30px">
    <tr>
        <input type="hidden" name="ids" value="<%=aa%>"/>
      <td width="173">Camp Name</td>
      <td width="171"><label for="textfield"></label>
          <input type="text" name="cname" id="textfield" value="<%=cr.getCname()%>"/></td>
    </tr>
    <tr>
      <td>Camp Coordinator Name</td>
      <td><label for="textfield2"></label>
          <input type="text" name="coname" id="textfield2" value="<%=cr.getConame()%>"/></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><label for="textfield3"></label>
          <input type="text" name="phone" id="textfield3" value="<%=cr.getPhone()%>"/></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><label for="textfield4"></label>
          <input type="text" name="email" id="textfield4" value="<%=cr.getEmail()%>"/></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label for="textfield5"></label>
          <input type="text" name="place" id="textfield5" value="<%=cr.getPlace()%>"/></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label for="select"></label>
          <select name="district" id="select" style="width: 158px">
             <option value="Kasargode"  <% if(cr.getDistrict().equalsIgnoreCase("Kasargode")){ %> selected="selected" <%}%>>Kasargode</option>
            <option value="Kannur"<% if(cr.getDistrict().equalsIgnoreCase("Kannur")){ %> selected="selected" <%}%>>Kannur</option>
            <option value="Wayanad" <% if(cr.getDistrict().equalsIgnoreCase("Wayanad")){ %>selected="selected" <%}%>>Wayanad</option>
             <option value="Kozhikode" <% if(cr.getDistrict().equalsIgnoreCase("Kozhikode")){ %> selected="selected" <%}%>>Kozhikode</option>
             <option value="Malappuaram"<% if(cr.getDistrict().equalsIgnoreCase("Malappuram")){%>selected="selected"<%}%>>Malappuram</option>
            <option value="Palakkad"<% if(cr.getDistrict().equalsIgnoreCase("Palakkad")){ %> selected="selected" <%}%>>Palakkad</option>
            <option value="Thrissur"<% if(cr.getDistrict().equalsIgnoreCase("Thrissur")){ %> selected="selected" <%}%>>Trissur</option>
            <option value="Ernakulam"<% if(cr.getDistrict().equalsIgnoreCase("Ernakulam")){ %> selected="selected" <%}%>>Ernakulam</option>
            <option value="Kottayam"<% if(cr.getDistrict().equalsIgnoreCase("Kottayam")){ %> selected="selected" <%}%>>Kottayam</option>
            <option value="Alappuzha"<% if(cr.getDistrict().equalsIgnoreCase("Alappuzha")){ %> selected="selected" <%}%>>Alappuzha</option>
            <option value="Idukki"<% if(cr.getDistrict().equalsIgnoreCase("Idukki")){ %> selected="selected" <%}%>>Idukki</option>
            <option value="Pathanamthitta"<% if(cr.getDistrict().equalsIgnoreCase("Pathanamthitta")){ %> selected="selected" <%}%>>Pathanamthitta</option>
            <option value="Kollam"<% if(cr.getDistrict().equalsIgnoreCase("Kollam")){ %> selected="selected" <%}%>>Kollam</option>
            <option value="Thiruvanathapuram"<% if(cr.getDistrict().equalsIgnoreCase("Thiruvanathapuram")){ %> selected="selected" <%}%>>Thiruvanathapuram</option>
      </select></td>
    </tr>
    <tr>
      <td>Total People</td>
      <td><label for="textfield6"></label>
          <input type="text" name="totalp" id="textfield6" value="<%=cr.getTotalp()%>"/></td>
    </tr>
    <tr>
      <td>Latitude</td>
      <td><label for="textfield7"></label>
          <input type="text" name="lati" id="lati" value="<%=cr.getLati()%>"/></td>
    </tr>
    <tr>
      <td>Longitude</td>
      <td><label for="textfield8"></label>
          <input type="text" name="longi" id="longi" value="<%=cr.getLongi()%>" /></td>
    </tr>
   
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="UPDATE" />
      </div></td>
    </tr>
    <%
    }
     %>
  </table>
</form>
</body>
</html>
     <%@include file="Footer4.jsp" %>