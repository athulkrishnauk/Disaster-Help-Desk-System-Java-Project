package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Servicepackage.all_service;
import Modalpackage.Volunteerreqmodel;

public final class CoordinatorVolunteerReqAjax_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"\" method=\"\">\r\n");
      out.write("  <table width=\"973\" border=\"1\">\r\n");
      out.write("      \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"140\">Camp Name</td>\r\n");
      out.write("      <td width=\"152\">Address</td>\r\n");
      out.write("      <td width=\"144\">Phone</td>\r\n");
      out.write("      <td width=\"179\">Area of Volunteering</td>\r\n");
      out.write("      <td width=\"188\">Details</td>\r\n");
      out.write("      <td width=\"130\">Date</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

        String tp=request.getParameter("tps");
        if(tp.equalsIgnoreCase("Camp"))

        {
        
      out.write("\r\n");
      out.write("    ");

            Volunteerreqmodel cm=new Volunteerreqmodel();
            all_service aa=new all_service();
            ArrayList<Volunteerreqmodel> ac=aa.coordinatorvolunteerreqview();
            for(Volunteerreqmodel ad:ac)
            {
          
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        \r\n");
      out.write("        <td>");
      out.print(ad.getType());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(ad.getDate());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(ad.getDetails());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(ad.getStatus());
      out.write("</td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

            }
            
            
      out.write("\r\n");
      out.write("                 ");

        }
        
      out.write("\r\n");
      out.write("            \r\n");
      out.write("     </table>  \r\n");
      out.write("       \r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
