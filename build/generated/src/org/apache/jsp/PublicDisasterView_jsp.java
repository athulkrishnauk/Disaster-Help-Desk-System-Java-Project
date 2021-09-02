package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modalpackage.Materialreqviewmodel;
import Servicepackage.all_service;
import java.util.ArrayList;
import Modalpackage.Disasterviewmodel;
import java.sql.*;

public final class PublicDisasterView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header6.jsp");
    _jspx_dependants.add("/Footer6.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <title>All Template Needs</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/component.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom-styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.css\">\n");
      out.write("\n");
      out.write("      <script src=\"js/jquery.mobilemenu.js\"></script>\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\n");
      out.write("      <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $('.menu').mobileMenu();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write(" \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"header-wrapper\">\n");
      out.write("      <div class=\"site-name\">\n");
      out.write("        <h1>Disaster Help Desk System</h1>\n");
      out.write("        <h2>SAHAYI</h2>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("      <div class=\"navbar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <i class=\"fw-icon-th-list\"></i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"header.jsp\">Home</a></li>\n");
      out.write("              <li><a href=\"PublicAdminNotiView.jsp\">CMO Notification</a></li>\n");
      out.write("              <li><a href=\"PublicPubInfoView.jsp\">Public Informations</a></li>\n");
      out.write("              <li><a href=\"PublicDisNotiView.jsp\">District Notification</a></li>\n");
      out.write("              <li><a href=\"#aa\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mini-menu\">\n");
      out.write("            <label>\n");
      out.write("          <select class=\"selectnav\">\n");
      out.write("            <option value=\"#\" selected=\"\">Home</option>\n");
      out.write("            <option value=\"#\">About</option>\n");
      out.write("            <option value=\"#\">? Another action</option>\n");
      out.write("            <option value=\"#\">? Something else here</option>\n");
      out.write("            <option value=\"#\">? Another action</option>\n");
      out.write("            <option value=\"#\">? Something else here</option>\n");
      out.write("            <option value=\"#\">Services</option>\n");
      out.write("            <option value=\"#\">Work</option>\n");
      out.write("            <option value=\"#\">Contact</option>\n");
      out.write("          </select>\n");
      out.write("          </label>\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("   \n");
      out.write("  \n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- Controls -->\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("  <table width=\"1349\" border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"117\">Material Type</td>\r\n");
      out.write("      <td width=\"120\">Details</td>\r\n");
      out.write("      <td width=\"111\">Date</td>\r\n");
      out.write("      <td width=\"111\">Camp Name</td>\r\n");
      out.write("      <td width=\"111\">Camp Coordinator Name</td>\r\n");
      out.write("      <td width=\"111\">Phone</td>\r\n");
      out.write("      <td width=\"111\">Email</td>\r\n");
      out.write("      <td width=\"111\">Place</td>\r\n");
      out.write("      <td width=\"111\">District</td>\r\n");
      out.write("      <td width=\"111\">Total People</td>\r\n");
      out.write("      <td width=\"111\">Location</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

     ArrayList<Materialreqviewmodel> am=new ArrayList<Materialreqviewmodel>();
        all_service as=new all_service();
        am=as.publicmaterialreqview();
        for(Materialreqviewmodel mm:am)
        {
        
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print(mm.getMtype());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getDetails());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getDate());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getCa_name());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getCo_name());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getPhone());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getEmail());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getPlace());
      out.write("</td>\r\n");
      out.write("         <td>");
      out.print(mm.getDistrict());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(mm.getTotalp());
      out.write("</td>\r\n");
      out.write("        <td><a target=\"_blank\" href=\"https://maps.google.com/maps?q=");
      out.print(mm.getLongi());
      out.write(',');
      out.print(mm.getLongi());
      out.write("\">Locate</a></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

          }
              
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("       \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"featured-content\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"block\">\n");
      out.write("              <h1>&nbsp;</h1>\n");
      out.write("              </div>            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"block\">\n");
      out.write("              <h1>&nbsp;</h1>\n");
      out.write("              </div>            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("      <div class=\"footer-wrapper\">\n");
      out.write("        <div class=\"site-content\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        \n");
      out.write("            <div class=\"block col-md-2 col-sm-6\" id=\"aa\">\n");
      out.write("            <h1>Contact Us</h1>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"Cmonumber.jsp\">Chief Minister Office</a></li>\n");
      out.write("              <li><a href=\"DisCollectorNumber.jsp\">District Collector</a></li>\n");
      out.write("              <li><a href=\"RescueNumber.jsp\">Rescue Team</a></li>\n");
      out.write("              <li><a href=\"HelpLineNumbers.jsp\">Help line numbers</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("            <h1>CONNECT WITH US</h1>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"https://www.facebook.com/CMOKerala/\">FaceBook</a></li>\n");
      out.write("              <li><a href=\"https://twitter.com/cmokerala?lang=en\">Twitter</a></li>\n");
      out.write("              <li><a href=\"https://www.instagram.com/cmokerala/\">Instagram</a></li>\n");
      out.write("              <li><a href=\"https://www.youtube.com/channel/UCIL_8YdMA3hvma-57E_UXGg/videos\">YouTube</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("            <h1>Latest News</h1>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">Quisque a lectus</a></li>\n");
      out.write("              <li><a href=\"#\">Donec consecte</a></li>\n");
      out.write("              <li><a href=\"#\">Nulla sed leoniton</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-3\">\n");
      out.write("            <h1></h1>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"email\" value=\"\" name=\"EMAIL\" class=\"required email form-control\" id=\"mce-EMAIL\">\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("              <input type=\"submit\" class=\"button btn btn-default\" value=\"Search\" name=\"subscribe\" id=\"mc-embedded-subscribe\">\n");
      out.write("                </span>\n");
      out.write("            </div> \n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-3\">\n");
      out.write("            <h1> Address</h1>\n");
      out.write("            <ul class=\"social\">\n");
      out.write("              <li>Government of Kerala</li>\n");
      out.write("              <br>\n");
      out.write("              <li>Hon'ble Chief Minister</li>\n");
      out.write("              <li>Room No 141, 3rd Floor, North Block, Government Secretariat, Thiruvananthapuram - 695001</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"copy-rights\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          \n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              Copyright(c) Disaster Help Desk System. Designed by: <a href=\"http://www.alltemplateneeds.com\">World Destination (P)Ltd</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              Developed By: <a href=\"http://www.wallpaperswide.com\">Athul Krishna U K</a> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"js/jquery-1.9.1.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
