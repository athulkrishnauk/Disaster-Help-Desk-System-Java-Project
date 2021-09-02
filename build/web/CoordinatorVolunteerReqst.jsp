<%-- 
    Document   : CoordinatorVolunteerReqst
    Created on : Oct 12, 2018, 5:46:08 PM
    Author     : user
--%>
<%@include file="header3.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    session.getAttribute("lid").toString();
    %>
    <script>
         var xmlHttp;
         
         function shows()
         {
             tp=document.getElementById("type").value;
                     alert(tp);
                if (typeof XMLHttpRequest != "undefined")
                {
                     

                     xmlHttp= new XMLHttpRequest();
                }
                else if (window.ActiveXObject)
                {
                     xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                }
                if (xmlHttp==null)
                {
                     alert("Browser does not support XMLHTTP Request")
                     return;
                }
                     var url="CoordinatorVolunteerReqAjax.jsp";
                     url +="?tps=" +tp;
                                
                     xmlHttp.onreadystatechange = stateChange2;
                     xmlHttp.open("GET", url, true);
                     xmlHttp.send(null);
         }
            
            
            function stateChange2()
            {
                    if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                    {
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
      <td>Type</td>
      <td><label for="select"></label>
          <select name="select" id="type" onchange="shows()">
              <option value="Select">Select</option>
            <option value="Camp">Camp</option>
            <option value="user">User</option>
          </select></td></tr>
    </table>
        </form>
        
        <div id="res1"></div>
        
    </body>
</html>
<%@include file="Footer.jsp" %>
