<%@include file="header6.jsp" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

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
<script src="https://maps.googleapis.com/maps/api/js?key=xxxxxxx &callback=myMap"></script>
    
<form id="form1" name="form1" method="post" action="Helpreqwebservlet">
    <table width="338" border="0" align="center">
    <tr>
      <td width="161">Name</td>
      <td width="161"><label>
        <input type="text" name="name" />
      </label></td>
    </tr>
    <tr>
      <td>Gender</td>
      <td><label>
        <input name="gender" type="radio" value="male" />
      Male 
      <input name="gender" type="radio" value="female" />
      Female</label></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><label>
        <input type="text" name="phone" />
      </label></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label>
        <input type="text" name="place" />
      </label></td>
    </tr>
    <tr>
      <td>Number of persons </td>
      <td><label>
        <input type="text" name="nperson" />
      </label></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label>
      <select name="district">
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
      </select>
      </label></td>
    </tr>
    <tr>
      <td>Details</td>
      <td><label>
        <textarea name="details"></textarea>
      </label></td>
    </tr>
    <tr>
      <td>Latitude</td>
      <td><label>
        <input type="text" name="lati" id="longi"/>
      </label></td>
    </tr>
    <tr>
      <td>Longitude</td>
      <td><label>
        <input type="text" name="longi" id="lati"/>
      </label></td>
    </tr>
      
        <tr><td></td>
      <td colspan="2"><label>
        <div align="center">
          <input type="submit" name="Submit" value="SEND" />
          </div>
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>
<%@include file="Footer6.jsp" %>