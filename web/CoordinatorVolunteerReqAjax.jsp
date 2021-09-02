<%@page import="Modalpackage.Volunteerreqviewmodel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Servicepackage.all_service"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
    <form action="" method="">
        <%
        String tp=request.getParameter("tps");
        if(tp.equalsIgnoreCase("Camp"))

        {
            %>
        
  <table width="1345" border="1">
      
    <tr>
      <td width="140">Camp Name</td>
      <td width="140">Camp Coordinator Name</td>
      <td width="144">Phone</td>
      <td width="152">Address</td>
      <td width="152">Location</td>
      <td width="179">Area of Volunteering</td>
      <td width="188">Details</td>
      <td width="130">Date</td>
      <td width="130">Action</td>
    </tr>
    <%
            Volunteerreqviewmodel cm=new Volunteerreqviewmodel();
            all_service aa=new all_service();
            ArrayList<Volunteerreqviewmodel> ac=aa.coordinatorvolunteerreqview();
            for(Volunteerreqviewmodel ad:ac)
            {
          %>
    <tr>
        
        <td><%=ad.getCa_name()%></td>
        <td><%=ad.getCo_name()%></td>
        <td><%=ad.getPhone()%></td>
        <td><%=ad.getPlace()%><br><%=ad.getDistrict()%></td>
        <td><a target="_blank" href="https://maps.google.com/maps?q=<%=ad.getLatitude()%>,<%=ad.getLongitude()%>">Locate</a></td>
        <td><%=ad.getArea_vo()%></td>
        <td><%=ad.getDetails()%></td>
        <td><%=ad.getDate()%></td>
        <td><p><a href="Volreqapproveservlet?id=<%=ad.getVid()%>">Approve</a></p>
          <p><a href="Volreqrejectservlet?id=<%=ad.getVid()%>">Reject</a></p></td>
    </tr>
    <%
            }
   %>
   
  </table>
   <%
        }else{
            ArrayList<Volunteerreqviewmodel> av=new ArrayList<Volunteerreqviewmodel>();
            all_service as=new all_service();
            av=as.coordinatoruservolunteerreqview();
        %>
  <table border="1" width="1345">
        <tr>
         <td width="140">User Name</td>
      <td width="144">Phone</td>
      <td width="152">Address</td>
      <td width="179">Area of Volunteering</td>
      <td width="188">Details</td>
      <td width="130">Date</td>
      <td width="130">Action</td>
         </tr>
        
        <%
        
            
            for(Volunteerreqviewmodel vr:av)
            {
 
        %>
        <tr>
            <td><%=vr.getName()%></td>
            <td><%=vr.getPhone()%></td>
            <td><%=vr.getHo_name()%><br><%=vr.getPost()%><br><%=vr.getCity()%><br><%=vr.getDistrict()%><br><%=vr.getPin()%></td>
            <td><%=vr.getArea_vo()%></td>
            <td><%=vr.getDetails()%></td>
            <td><%=vr.getDate()%></td>
            <td><p><a href="Volreqapproveservlet?id=<%=vr.getVid()%>">Approve</a></p>
          <p><a href="Volreqrejectservlet?id=<%=vr.getVid()%>">Reject</a></p></td>
        </tr>
        <%
            }
        }
        %>
     </table>  
       
</form>
</body>
</html>