package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <title>All Template Needs</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/component.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom-styles.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\r\n");
      out.write("\t\r\n");
      out.write("     \r\n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/demo.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.css\">\r\n");
      out.write("\r\n");
      out.write("      <script src=\"js/jquery.mobilemenu.js\"></script>\r\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        $('.menu').mobileMenu();\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write(" \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"header-wrapper\">\r\n");
      out.write("      <div class=\"site-name\">\r\n");
      out.write("        <h1>Disaster Help Desk System</h1>\r\n");
      out.write("        <h2>SAHAYI</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"menu\">\r\n");
      out.write("      <div class=\"navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("              <i class=\"fw-icon-th-list\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li><a href=\"Admin_home.jsp\">Home</a></li>\r\n");
      out.write("              <li><a href=\"AdminNotificationView.jsp\">CMO Notification</a></li>\r\n");
      out.write("              <li><a href=\"AdminPublicView.jsp\">Public Informations</a></li>\r\n");
      out.write("              <li><a href=\"AdminCollectorNotiView.jsp\">District Notification</a></li>\r\n");
      out.write("              <li><a href=\"#aa\">Contact</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div><!--/.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"mini-menu\">\r\n");
      out.write("            <label>\r\n");
      out.write("          <select class=\"selectnav\">\r\n");
      out.write("            <option value=\"#\" selected=\"\">Home</option>\r\n");
      out.write("            <option value=\"#\">About</option>\r\n");
      out.write("            <option value=\"#\">? Another action</option>\r\n");
      out.write("            <option value=\"#\">? Something else here</option>\r\n");
      out.write("            <option value=\"#\">? Another action</option>\r\n");
      out.write("            <option value=\"#\">? Something else here</option>\r\n");
      out.write("            <option value=\"#\">Services</option>\r\n");
      out.write("            <option value=\"#\">Work</option>\r\n");
      out.write("            <option value=\"#\">Contact</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          </label>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action -->\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("  <!-- Wrapper for slides -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!-- Controls -->\r\n");
      out.write("      ");
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
