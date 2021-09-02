<%@include file="header6.jsp" %>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

    
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
<script src="https://maps.googleapis.com/maps/api/js?key=xxxxxxx&callback=myMap"></script>
     
     

<form id="form1" name="form1" method="post" action="Campregistrationservlet">
    <table width="360" border="0" align="center">
    <tr>
      <td width="173">Camp Name</td>
      <td width="171"><label for="textfield"></label>
      <input type="text" name="cname" id="textfield" /></td>
    </tr>
    <tr>
      <td>Camp Coordinator Name</td>
      <td><label for="textfield2"></label>
      <input type="text" name="coname" id="textfield2" /></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><label for="textfield3"></label>
      <input type="text" name="phone" id="textfield3" /></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><label for="textfield4"></label>
      <input type="text" name="email" id="textfield4" /></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label for="textfield5"></label>
      <input type="text" name="place" id="textfield5" /></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label for="select"></label>
          <select name="district" id="select" style="width: 158px">
            <option value="Select">Select District</option>
            <option value="Kasargode">Kasargode</option>
            <option value="Kannur">Kannur</option>
            <option value="Wayanad">Wayanad</option>
             <option value="Kozhikode">Kozhikode</option>
            <option value="Kozhikode">Malappuram</option>
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
    </tr>
    <tr>
      <td>Total People</td>
      <td><label for="textfield6"></label>
      <input type="text" name="totalp" id="textfield6" /></td>
    </tr>
    <tr>
      <td>Latitude</td>
      <td><label for="textfield7"></label>
      <input type="text" name="lati" id="lati" /></td>
    </tr>
    <tr>
      <td>Longitude</td>
      <td><label for="textfield8"></label>
      <input type="text" name="longi" id="longi" /></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><label for="textfield9"></label>
          <input type="password" name="pass" id="textfield9" /></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="button" id="button" value="REGISTER" />
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
<%@include file="Footer6.jsp" %>