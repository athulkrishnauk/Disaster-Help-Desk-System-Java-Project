<%-- 
    Document   : admin_home
    Created on : Sep 6, 2018, 2:45:25 PM
    Author     : user
--%>
<%@include file="header1.jsp" %>
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
    <body>
        
        
        
         <div class="container">
      <div class="featured-block">
        <!-- Example row of columns -->
        <div class="row">
          <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760131.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="AdminCollector.jsp">Collector Registration</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760144.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="AdminCollectorView.jsp">Collector View</a>
                    </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760121.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="AdminRescue.jsp">Rescue Team Registration</a>
                  </div>
                  </div>
              </div>
            </div>
            <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760164.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="AdminRescueView.jsp">Rescue Team View</a>
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
              <img src="img/3760583.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="AdminNotification.jsp">Add Notification</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760580.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="AdminPublicInfo.jsp">Add Public Information</a>
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
                    <a class="btn" href="AdminCampView.jsp">Camp View</a>
                  </div>
                  </div>
              </div>
            </div>
            <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760606.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="AdminVictimView.jsp">Victim View</a>
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
              <img src="img/3760627.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="AdminFundView.jsp">Fund View</a>
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
                      <a class="btn" href="AdminComplaintView.jsp">Complaint View</a>
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
                    <a class="btn" href="AdminViewCertificateFund.jsp">View Certificate and Fund Request</a>
                  </div>
                  </div>
              </div>
            </div>
            
            
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
<%@include file="Footer1.jsp" %>