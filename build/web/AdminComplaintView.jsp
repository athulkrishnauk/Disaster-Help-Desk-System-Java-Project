<%@include file="header1.jsp" %>
<%@page import="Modalpackage.Complaintviewmodel"%>
<%@page import="Servicepackage.all_service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modalpackage.Complaintmodel"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Untitled Document</title>
    </head>
<%
  session.getAttribute("lid").toString();
%>
    <body>
        <form id="form1" name="form1" method="post" action="">
            <table width="1349" border="1">
                <tr>
                    <td width="40">Sl_No</td>
                    <td width="108">User</td>
                    <td width="108">Phone</td>
                    <td width="108">Email</td>
                    <td width="153">Address</td>
                    <td width="153">Department</td>
                    <td width="170">Complaints</td>
                    <td width="119">Date </td>
                    <td width="97">Reply</td>
                </tr>
                <%
                    ArrayList<Complaintviewmodel> ac = new ArrayList<Complaintviewmodel>();
                    all_service as = new all_service();
                    ac = as.complaintview();
                    int i=0;
                    for (Complaintviewmodel ad:ac)
                    {
                        i++;
                %>
                <tr>
                    <td><%=i%></td>
                    <td><%=ad.getName()%></td>
                    <td><%=ad.getPhone()%></td>
                    <td><%=ad.getEmail()%></td>
                    <td><%=ad.getHoname()%><br><%=ad.getPost()%><br><%=ad.getCity()%><br><%=ad.getDistrict()%><br><%=ad.getDistrict()%></td>
                    <td><%=ad.getDepartment()%></td>
                    <td><%=ad.getComplaint()%></td>
                    <td><%=ad.getCdate()%></td>
                    <td><a href="AdminComplaintReply.jsp?id=<%=ad.getComid()%>">Reply</a></td>
                </tr>
                <%
                    }
                %>
            </table>
        </form>
    </body>
</html>
                <%@include file="Footer1.jsp" %>