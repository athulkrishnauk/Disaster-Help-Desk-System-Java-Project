/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletpackage;

import Modalpackage.Campregistrationmodel;
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
@WebServlet(name = "Campregistrationservlet", urlPatterns = {"/Campregistrationservlet"})
public class Campregistrationservlet extends HttpServlet {

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
            out.println("<title>Servlet Campregistrationservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Campregistrationservlet at " + request.getContextPath() + "</h1>");
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
            String cname=request.getParameter("cname");
            String coname=request.getParameter("coname");
            String phone=request.getParameter("phone");
            String email=request.getParameter("email");
            String place=request.getParameter("place");
            String district=request.getParameter("district");
            String totalp=request.getParameter("totalp");
            String latitude=request.getParameter("lati");
            String longitude=request.getParameter("longi");
            String password=request.getParameter("pass");
            
            
            Loginpackage lp=new Loginpackage();
            lp.setUsername(email);
            lp.setPassword(password);
            lp.setType("Camp");
                all_service as=new all_service();
                as.logins(lp);
                int lid=as.maxLogin();
            
            Campregistrationmodel ca=new Campregistrationmodel();
            ca.setLid(lid);
            ca.setCname(cname);
            ca.setConame(coname);
            ca.setPhone(phone);
            ca.setEmail(email);
            ca.setPlace(place);
            ca.setDistrict(district);
            ca.setTotalp(totalp);
            ca.setLati(latitude);
            ca.setLongi(longitude);
            
            
            all_service ap=new all_service();
            String ad=ap.camp(ca);
            if(ad.equals("1"))
            {
               response.getWriter().print("<script>alert('Registration Success...!!!');window.location='header.jsp';</script>");
            }
            else
            {
                response.getWriter().print("<script>alert('Registration Faild...!!!');window.location='CampRegistration.jsp'</script>");
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
