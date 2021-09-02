<%-- 
    Document   : Coordinator_home
    Created on : Sep 17, 2018, 2:34:37 PM
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
        
    <body>
        
        <div class="container">
      <div class="featured-block">
        <!-- Example row of columns -->
        <div class="row">
          <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760593.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CoordinatorCampView.jsp">Camp view</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760778.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="CoordinatorVolunteerView.jsp">Volunteer view</a>
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
                    <a class="btn" href="CoordinatorHelpView.jsp">View Help</a>
                  </div>
                  </div>
              </div>
            </div>
            <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760788.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CoordinatorVolunteerReqst.jsp">Volunteer request view</a>
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
              <img src="img/3760812.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CoordinatorMaterialReqView.jsp">Material Request view</a>
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
                      <a class="btn" href="CoordinatorVictimView.jsp">Victim View</a>
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

<%@include file="Footer3.jsp" %>