/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletpackage;

import Modalpackage.Districtnotificationmodel;
import Servicepackage.all_service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "Districtnotificationservlet", urlPatterns = {"/Districtnotificationservlet"})
public class Districtnotificationservlet extends HttpServlet {

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
            out.println("<title>Servlet Districtnotificationservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Districtnotificationservlet at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
        
        all_service as=new all_service();
        HttpSession session=request.getSession();
        String lid=session.getAttribute("lid").toString();
        String district=as.getdistrict(Integer.parseInt(lid));
        String subject=request.getParameter("subject");
        String details=request.getParameter("details");
        
       Districtnotificationmodel dm=new Districtnotificationmodel();
       dm.setDistrict(district);
       dm.setSubject(subject);
       dm.setDetails(details);
            
            String ad=as.districtnotificationadd(dm);
            if(ad.equals("1"))
            {
                response.getWriter().print("<script>alert('Notification Added...!!!');window.location='Collector_home.jsp';</script>");
            }
            else
            {
                response.getWriter().print("<script>alert('Notification Faild...!!!');window.location='CollectorNotificationAdd.jsp';</script>");
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
