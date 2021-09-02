package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CoordinatorVolunteerReqst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("         var xmlHttp;\n");
      out.write("         \n");
      out.write("         function shows()\n");
      out.write("         {\n");
      out.write("             tp=document.getElementById(\"type\").value;\n");
      out.write("                     alert(tp);\n");
      out.write("                if (typeof XMLHttpRequest != \"undefined\")\n");
      out.write("                {\n");
      out.write("                     \n");
      out.write("\n");
      out.write("                     xmlHttp= new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                else if (window.ActiveXObject)\n");
      out.write("                {\n");
      out.write("                     xmlHttp= new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("                     alert(\"Browser does not support XMLHTTP Request\")\n");
      out.write("                     return;\n");
      out.write("                }\n");
      out.write("                     var url=\"CoordinatorVolunteerReqAjax.jsp\";\n");
      out.write("                     url +=\"?tps=\" +tp;\n");
      out.write("                                \n");
      out.write("                     xmlHttp.onreadystatechange = stateChange2;\n");
      out.write("                     xmlHttp.open(\"GET\", url, true);\n");
      out.write("                     xmlHttp.send(null);\n");
      out.write("         }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function stateChange2()\n");
      out.write("            {\n");
      out.write("                    if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"res1\").innerHTML=xmlHttp.responseText  \n");
      out.write("                        //alert(xmlHttp.responseText)\n");
      out.write("                    }\n");
      out.write("   \n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("    ");

        session.getAttribute("lid").toString();
        
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("    <table width=\"200\" border=\"0\" align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("      <td>Type</td>\n");
      out.write("      <td><label for=\"select\"></label>\n");
      out.write("          <select name=\"select\" id=\"type\" onchange=\"shows()\">\n");
      out.write("              <option value=\"Select\">Select</option>\n");
      out.write("            <option value=\"Camp\">Camp</option>\n");
      out.write("            <option value=\"user\">User</option>\n");
      out.write("          </select></td></tr>\n");
      out.write("    </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div id=\"res1\"></div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
