<%-- 
    Document   : Rescue_home
    Created on : Sep 20, 2018, 1:33:39 AM
    Author     : user
--%>
<%@include file="header5.jsp" %>
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
              <img src="img/3760905.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="RescueViewDisaster.jsp">View Disaster Affected locations</a>
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
                      <a class="btn" href="RescueHelpView.jsp">View Help</a>
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
                    <a class="btn" href="Logout.jsp">LOGOUT</a>
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

<%@include file="Footer5.jsp" %>