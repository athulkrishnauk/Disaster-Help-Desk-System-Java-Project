<%-- 
    Document   : camp_ajax
    Created on : Sep 19, 2018, 5:01:28 PM
    Author     : user
--%>

<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Victimmodel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
    <body>
      <table width="1345" border="1">
    <tr>
      <td width="110">Victim Name</td>
      <td width="116">Address</td>
      <td width="122">Phone</td>
      <td width="104">Date</td>
    </tr>
    <%
            String cp=request.getParameter("cmplid");
            ArrayList<Victimmodel> cv=new ArrayList<Victimmodel>();
            all_service ac=new all_service();
            cv=ac.collectorcampvictim_view(cp);
       
        for(Victimmodel vv:cv)
        {
            
        
        %>
    <tr>
        <td><%=vv.getVname()%></td>
        <td><%=vv.getHoname()%><br><%=vv.getPlace()%><br><%=vv.getPost()%><br><%=vv.getCity()%><br><%=vv.getDistrict()%><br><%=vv.getPin()%></td>
      <td><%=vv.getPhone()%></td>
      <td><%=vv.getDate()%></td>
    </tr>
        <%
        }
        %>
  </table>
    </body>
</html>
