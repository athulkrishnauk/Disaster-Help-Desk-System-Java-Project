/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletpackage;

import Modalpackage.Admincollectormodel;
import Modalpackage.Loginpackage;

import Servicepackage.all_service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "Admincollectorservlet", urlPatterns = {"/Admincollectorservlet"})
public class Admincollectorservlet extends HttpServlet {

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
            out.println("<title>Servlet Admincollectorservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Admincollectorservlet at " + request.getContextPath() + "</h1>");
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
        try
        {
        String name=request.getParameter("name");
        String district=request.getParameter("district");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String password=request.getParameter("pass");
        
       Loginpackage lp=new Loginpackage();
       lp.setUsername(email);
       lp.setPassword(password);
       lp.setType("collector");
            all_service ser=new all_service();
            ser.logins(lp);
            int lid=ser.maxLogin();
            
        Admincollectormodel ac=new Admincollectormodel();
        ac.setName(name);
        ac.setDistrict(district);
        ac.setPhone(phone);
        ac.setEmail(email);
        ac.setLid(lid);
            all_service as=new all_service();
            String ap=as.collectors(ac);
            if(ap.equals("1"))
            {
                response.getWriter().print("<script>alert('registration success...!!');window.location='Admin_home.jsp';</script>");
            }
            else
            {
                response.getWriter().print("<script>alert('Registration Faild...!!');window.location='AdminCollector.jsp';</script>");
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
