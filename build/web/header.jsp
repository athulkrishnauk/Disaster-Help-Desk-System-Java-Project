
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   

    <title>Disaster Help Desk Official Website</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/component.css">
    <link rel="stylesheet" href="css/custom-styles.css">
    <link rel="stylesheet" href="css/font-awesome.css">
	
     
	 <link rel="stylesheet" href="css/demo.css">
    <link rel="stylesheet" href="css/font-awesome-ie7.css">

      <script src="js/jquery.mobilemenu.js"></script>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script>
    $(document).ready(function(){
        $('.menu').mobileMenu();
    });
  </script>
 
  
  <script>
    
     function validate()
	{
	var flag=true;
    
	if(document.getElementById("uname").value=="")
	{
		document.getElementById("a").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("a").style.visibility="hidden";
	}
            return flag;
        }    
        
        
        
         function validate()
	{
	var flag=true;
    
	if(document.getElementById("pwd").value=="")
	{
		document.getElementById("b").style.visibility="visible";
		flag= false;
	}
	else
	{
	document.getElementById("b").style.visibility="hidden";
	}
        
    
    </script>
  
  </head>

  <body>
    <div class="header-wrapper">
      <div class="site-name">
        <h1>Disaster Help Desk System</h1>
        <h2>SAHAYI</h2>
      </div>
    </div>
    <div class="menu">
      <div class="navbar">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <i class="fw-icon-th-list"></i>
            </button>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="header.jsp">Home</a></li>
              <li><a href="About.jsp">About</a></li>
              <li><a href="PublicAdminNotiView.jsp">CMO Notification</a></li>
              <li><a href="PublicPubInfoView.jsp">Public Information</a></li>
              <li><a href="PublicDisNotiView.jsp">District Notification</a></li>
              <li><a href="#aa">Contact</a></li>
            </ul>
          </div><!--/.navbar-collapse -->
        </div>
      </div>
      <div class="mini-menu">
            <label>
          <select class="selectnav">
            <option value="#" selected="">Home</option>
            <option value="#">About</option>
            <option value="#">? Another action</option>
            <option value="#">? Something else here</option>
            <option value="#">? Another action</option>
            <option value="#">? Something else here</option>
            <option value="#">Services</option>
            <option value="#">Work</option>
            <option value="#">Contact</option>
          </select>
          </label>
          </div>
    </div>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="banner">
      <div id="carousel-example-generic" class="carousel slide">
  
  <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="item active">
              <img src="img/Kerala_flood_rescue.JPG" alt="">
            <div class="carousel-caption">
              <h1>Stand With Kerala</h1>
              <h2>Your Help can Rebuild the Lives of the Affected</h2>
              <a href="DonateFund.jsp" class="btn">DONATE</a>
            </div>
          </div>
          <div class="item">
            <img src="img/banners.jpg" alt="">
            <div class="carousel-caption">
              <h1>Stand With Kerala</h1>
              <h2>Your Help can Rebuild the Lives of the Affected</h2>
              <a href="DonateFund.jsp" class="btn">DONATE</a>
            </div>
          </div>
          <div class="item">
            <img src="img/bannerss.jpg" alt="">
            <div class="carousel-caption">
              <h1>Stand With Kerala</h1>
              <h2>Your Help can Rebuild the Lives of the Affected</h2>
              <a href="DonateFund.jsp" class="btn">DONATE</a>
            </div>
          </div>
        </div>

  <!-- Controls -->
      <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
        <i class="fw-icon-chevron-left"></i>
      </a>
      <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
        <i class="fw-icon-chevron-right"></i>
      </a>
    </div>
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
                <h1>Material Request</h1>
                <p>Link used to know the needs of camp and also know the camp location,details,etc....</p>
                <a class="btn" href="PublicMaterialReqView.jsp">Material Request</a>
              </div>
              </div>
            </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                    <img src="img/3776402.png" alt="" class="img-responsive">
                    <div class="caption">
                      <h1>Help Request</h1>
                      <p>Link using for help request send and also know about the status of help request</p>
                      <a class="btn" href="helpreq.jsp">Help Request</a>
                    </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="block">
                <div class="thumbnail">
                  <img src="img/3776371.png" alt="" class="img-responsive">
                  <div class="caption">
                    <h1>Camp Registration</h1>
                    <p>Link for camp registration.The link is only using camp coordinator for camp registration</p>
                    <a class="btn" href="CampRegistration.jsp">Camp Registration</a>
                  </div>
                  </div>
              </div>
            </div>
      
<div class="col-md-3">
            <div class="block">
            <div class="thumbnail">
                <img src="img/3776391.png" alt="" class="img-responsive">
                <div class="caption">
                    <h1>LOGIN</h1>
                    <form id="form1" name="form1" method="post" action="Loginservlet">
                        <table width="283"  border="0" align="center" bgcolor="lightblue">
                            <tr>
                              <td>Username</td>
                              <td>
                                <input type="text" name="user" size="18" id="textfield" /></td>
                                <td width="105"><div  id="a" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
                            </tr>
                            <tr>
                              <td>Password</td>
                              <td>
                                <input type="password" name="pass" size="18" id="textfield2" /></td>
                                <td><div  id="b" style="visibility:hidden"><font color="#FF0000">Invalid Entry!!!</font></div></td>
                            </tr>
                            <tr>
                                <td colspan="2"><div align="center">
                                    <input type="submit" name="button" class="btn" id="button" value="LOGIN" onclick="return validate();"/>
                                </div></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
            </div>
            </div>
            
          </div>
        </div> 
        <div class="ruler"></div>  
        </div>
        
    <%@include file="Footer.jsp" %>