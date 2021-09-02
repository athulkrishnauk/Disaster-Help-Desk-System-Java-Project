<%@include file="header6.jsp" %>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Adminpublicinfomodel"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="">
  <table width="1345" border="1">
    <tr>
      <td width="153">Subject</td>
      <td width="139">Details</td>
      <td width="133">File</td>
    </tr>
    <%
        ArrayList<Adminpublicinfomodel> am=new ArrayList<Adminpublicinfomodel>();
        all_service as=new all_service();
        am=as.publicinfoview();
        for(Adminpublicinfomodel ad:am)
        {
            
        %>
    <tr>
        <td><%=ad.getSubject()%></td>
        <td  width="400px"><%=ad.getDetails()%></td>
        <td>
            <%
            if(ad.getFile().contains("mp4")){
            %>
            <video width="800px" height="400px" controls>
                <source type="video/mp4" src="info/<%=ad.getFile()%>">
            </video>
            <%
            }else if(ad.getType().equalsIgnoreCase("Image")){
            %>
            <img src="info/<%=ad.getFile()%>" width="800px" height="400px"/>
            <%
            }
            %></br><a href="download_info.jsp?filename=<%=ad.getFile()%>"><%=ad.getFile()%></a></td>
    </tr>
        <%
        }
            %>
  </table>
</form>
</body>
</html>
  <%@include file="Footer6.jsp" %>