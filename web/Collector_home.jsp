<%-- 
    Document   : Collector_home
    Created on : Sep 12, 2018, 2:07:17 PM
    Author     : user
--%>
<%@include file="header2.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <%
    String lid=session.getAttribute("lid").toString();
    all_service s=new all_service();
    String dis=s.getdistrict(Integer.parseInt(lid));
    session.setAttribute("district", dis);
    %>
    
    <body>
        
        
        <div class="container">
      <div class="featured-block">
        <!-- Example row of columns -->
        <div class="row">
          <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760750.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CollectorCoordinator.jsp">Coordinator Registration</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760757.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="CollectorCoordinatorView.jsp">Coordinator View</a>
                    </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760583.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="CollectorNotificationAdd.jsp">Notification Add</a>
                  </div>
                  </div>
              </div>
            </div>
             <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760593.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="CollectorCampView.jsp">Camp View</a>
                  </div>
                  </div>
              </div>
            </div>
            
            
          </div>
          
        </div> 
        <div class="ruler"></div>  
        </div>
        
        
        
        
         <div class="container">
      <div class="featured-block">
        <!-- Example row of columns -->
        <div class="row">
           
            <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760606.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CollectorVictimView.jsp">Victim View</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760638.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="CollectorComplaintView.jsp">Complaint View</a>
                    </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760722.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="CollectorViewCertificateFund.jsp">View Certificate and Fund Request</a>
                  </div>
                  </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760762.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="CollectorHelpView.jsp">View Help</a>
                  </div>
                  </div>
              </div>
            </div>
            
          </div>
          
        </div> 
        <div class="ruler"></div>  
        </div>
        
        
        
        
        <div class="container">
      <div class="featured-block">
        <!-- Example row of columns -->
        <div class="row">
          
            
            
            
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760727.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="Logout.jsp">Logout</a>
                  </div>
                  </div>
              </div>
            </div>
            
            
          </div>
          
        </div> 
        <div class="ruler"></div>  
        </div>
       
        
    </body>
</html>
<%@include file="Footer2.jsp" %>