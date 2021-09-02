/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidConnection;

import Servicepackage.Androidservice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
@WebServlet(name = "Userregservlet", urlPatterns = {"/Userregservlet"})
public class Userregservlet extends HttpServlet {

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
            out.println("<title>Servlet Userregservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Userregservlet at " + request.getContextPath() + "</h1>");
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
        
        JSONObject jp=new JSONObject();
        try
        {
        
        
        
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String hname=request.getParameter("hname");
        String post=request.getParameter("post");
        String city=request.getParameter("city");
        String district=request.getParameter("district");
        String pin=request.getParameter("pin");
        String pass=request.getParameter("pass");
        
        Androidservice sr=new Androidservice();
        sr.login(email, pass,"User");
        int lid=sr.maxlogins();
        
        Androidservice as=new Androidservice();
        String aa=as.userreg(lid,name,gender ,phone, email, hname, post, city, district, pin);
        if(aa.equals("1"))
        {
            jp.put("status", "1");
        }
        else
        {
             jp.put("status", "0");
        }
        }
        catch(Exception ex)
        {
            jp.put("status", ex.toString());
        }
            response.getWriter().write(jp.toString());
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
