<%@page import="Dbpackage.Constants"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="javax.crypto.Cipher"%>
<%@page import="java.security.PrivateKey"%>
<%@page import="java.security.spec.PKCS8EncodedKeySpec"%>
<%@page import="java.security.KeyFactory"%>

<%@page import="java.io.IOException"%>

<%@page import="java.io.DataInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    String fnm=request.getParameter("filename");
  
    String dcpth=Constants.infoURL+fnm;
     
    File file = new File(dcpth);
    int length   = 0;
    ServletOutputStream outStream = response.getOutputStream();
    //response.setContentType("text/html");
    response.setContentType("APPLICATION/OCTET-STREAM");
    response.setContentLength((int)file.length());
    
    response.setHeader("Content-Disposition", "attachment; filename=\"" + fnm + "\"");
    int cnt= (int)file.length();
    byte[] byteBuffer = new byte[cnt];
    DataInputStream in = new DataInputStream(new FileInputStream(file));
 
    while ((in != null) && ((length = in.read(byteBuffer)) != -1))
    {
        outStream.write(byteBuffer,0,length);
    } 
    in.close();
    outStream.close();
     
    response.sendRedirect("AdminPublicView.jsp");
  
%>