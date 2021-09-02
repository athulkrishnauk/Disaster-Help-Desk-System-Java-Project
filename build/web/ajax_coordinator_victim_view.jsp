
<%@page import="Modalpackage.Victimmodel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="Modalpackage.Campregistrationmodel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    String tp=request.getParameter("tp");
    if(tp.equalsIgnoreCase("Camp"))
    {
        Campregistrationmodel cm=new Campregistrationmodel();
        all_service aa=new all_service();
        ArrayList<Campregistrationmodel> ac=aa.coordinatorcamp_views();
    
        %>
        <div id="res3" style="visibility: visible" align="center">
          
            Camp &nbsp;&nbsp;
            <select name="select2" id="select2" onchange="showclass1()">
                <option>Select</option>
                <%
           for(Campregistrationmodel ad:ac)
                {
            
        %>
            <option value="<%=ad.getLid()%>"> <%=ad.getCname()%></option>
              <%
                }
        %>
            </select></tr>
            
      </div>
        <%
    }
    else
    {
        %>
        <table width="1345" border="1">
    <tr>
      <td width="110">Victim Name</td>
      <td width="116">Address</td>
      <td width="122">Phone</td>
      <td width="104">Date</td>
      <td width="104">Action</td>
    </tr>
    <%
            ArrayList<Victimmodel> cv=new ArrayList<Victimmodel>();
            all_service ac=new all_service();
            cv=ac.coordinatoruservictim_view();
       
        for(Victimmodel vv:cv)
        {
            
        
        %>
    <tr>
        <td><%=vv.getVname()%></td>
        <td><%=vv.getHoname()%><br><%=vv.getPlace()%><br><%=vv.getPost()%><br><%=vv.getCity()%><br><%=vv.getDistrict()%><br><%=vv.getPin()%></td>
      <td><%=vv.getPhone()%></td>
      <td><%=vv.getDate()%></td>
      <td><p><a href="victimapproveservlet?id=<%=vv.getVcid()%>">Approved</a></p>
      <a href="victimrejectservlet?id=<%=vv.getVcid()%>">Rejected</a></td>
    </tr>
        <%
        }
        %>
  </table>
        <%
    }
        %>
        
        
    </body>
</html>
