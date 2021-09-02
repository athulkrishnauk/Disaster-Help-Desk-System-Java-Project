<%-- 
    Document   : admin_home
    Created on : Sep 6, 2018, 2:45:25 PM
    Author     : user
--%>
<%@include file="header4.jsp" %>
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
                <a class="btn" href="CampView.jsp">Camp view</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760864.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="CampAddVictim.jsp">Add Victim</a>
                    </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3760868.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1></h1>
                    <p></p>
                    <a class="btn" href="CampMaterialReq.jsp">Material Request</a>
                  </div>
                  </div>
              </div>
            </div>
            <div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
              <img src="img/3760872.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CampMaterialReqView.jsp">Material Request Status</a>
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
              <img src="img/3760880.png" alt="" class="img-responsive">
              <div class="caption">
                <h1></h1>
                <p></p>
                <a class="btn" href="CampVolunteerReq.jsp">Volunteer Request</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3760886.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1></h1>
                      <p></p>
                      <a class="btn" href="CampVolunteerReqView.jsp">Volunteer Request Status</a>
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

<%@include file="Footer4.jsp" %>
