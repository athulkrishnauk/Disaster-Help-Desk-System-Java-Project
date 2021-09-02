/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletpackage;

import Modalpackage.Helpmodel;
import Servicepackage.all_service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.*;

/**
 *
 * @author user
 */
@WebServlet(name = "Helpreqwebservlet", urlPatterns = {"/Helpreqwebservlet"})
public class Helpreqwebservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Helpreqwebservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Helpreqwebservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        try
        {
           
           String name=request.getParameter("name");
           String gender=request.getParameter("gender");
           String phone=request.getParameter("phone");
           String place=request.getParameter("place");
           String noperson=request.getParameter("nperson");
           String district=request.getParameter("district");
           String details=request.getParameter("details");
           String lati=request.getParameter("lati");
           String longi=request.getParameter("longi");
           
           Helpmodel hm=new Helpmodel();
           hm.setName(name);
           hm.setGender(gender);
           hm.setPhone(phone);
           hm.setPlace(place);
           hm.setNopersons(noperson);
           hm.setDistrict(district);
           hm.setDetails(details);
           hm.setLati(lati);
           hm.setLongi(longi);
           
           InetAddress ip=InetAddress.getLocalHost();
           String ips=ip.getHostAddress();
           
            all_service as=new all_service();
            String aa=as.helprequest(hm,ips);
            if(aa.equals("1"))
            {
                response.getWriter().print("<script>alert('Successfully Send');window.location='header.jsp';</script>");
            }
            else
            {
                response.getWriter().print("<script>alert('Failed');window.location='Helprequest.jsp';</script>");
            }
           
        }
        catch(Exception ex)
        {
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
