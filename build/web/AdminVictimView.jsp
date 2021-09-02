<%@include file="header1.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Victimmodel"%>
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
    <script>
         var xmlHttp;
            function showclass(){
                if (typeof XMLHttpRequest != "undefined"){
                    var dis=document.getElementById("select").value;
                   // alert(dis);
                xmlHttp= new XMLHttpRequest();
                }
                else if (window.ActiveXObject){
                    xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                }
                if (xmlHttp==null){
                    alert("Browser does not support XMLHTTP Request")
                    return;
                }
                var url="ajax_victim_view.jsp";
                url +="?dis=" +dis
                //alert(url)
                xmlHttp.onreadystatechange = stateChange;
                xmlHttp.open("GET", url, true);
                xmlHttp.send(null);
            }
            
            
            function stateChange(){
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
                    document.getElementById("res").innerHTML=xmlHttp.responseText  
                    //alert(xmlHttp.responseText)
                }
	}
  
            function showclass1(){
                   cmpid=document.getElementById("select2").value;
                    alert(cmpid);
                if (typeof XMLHttpRequest != "undefined"){
                xmlHttp= new XMLHttpRequest();
                }
                else if (window.ActiveXObject){
                    xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                }
                if (xmlHttp==null){
                    alert("Browser does not support XMLHTTP Request")
                    return;
                }
                var url="camp_ajax.jsp";
                url +="?cmplid=" +cmpid;
                //alert(url)
                
                xmlHttp.onreadystatechange = stateChange1;
                xmlHttp.open("GET", url, true);
                xmlHttp.send(null);
            }
            
            
            function stateChange1(){
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
                    document.getElementById("res1").innerHTML=xmlHttp.responseText  
                    //alert(xmlHttp.responseText)
                }
            }
                 
                
            function shows(){
                if (typeof XMLHttpRequest != "undefined"){
                    
                   dis=document.getElementById("dis").value;
                   id=document.getElementById("typs").value;
//                   alert(id);
//                   alert(dis);
                    xmlHttp= new XMLHttpRequest();
                }
                else if (window.ActiveXObject){
                    xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                }
                if (xmlHttp==null){
                    alert("Browser does not support XMLHTTP Request")
                    return;
                }
                var url="ajax_victim_view.jsp";
                url +="?dis=" +dis+"&tp="+id;
                                
                xmlHttp.onreadystatechange = stateChange2;
                xmlHttp.open("GET", url, true);
                xmlHttp.send(null);
            }
            
            
            function stateChange2(){
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
                    document.getElementById("res1").innerHTML=xmlHttp.responseText  
                    //alert(xmlHttp.responseText)
                }
                
                
                
                
	}
    </script>
<% 
        session.getAttribute("lid").toString();
%>
    
<body>
<form id="form1" name="form1" method="post" action="">
    <table width="200" border="0" align="center">
    <tr>
      <td>District</td>
      <td>
          <select name="select" id="dis">
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
    </tr>
        <tr><td>Type</td>
            <td>
                <select name="typ" id="typs" onchange="shows()">
                    <option value="selct">Select Type</option>
                    <option value="camp">Camp</option>
                    <option value="user">User</option>
                </select>
            </td></tr>
  </table>
    <div id="res" align="center" >
          
      </div>
    <div id="res1"></div>
  <p>&nbsp;</p>
</form>
</body>
</html>
<%@include file="Footer1.jsp" %>