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
@WebServlet(name = "Volunteerregservlet", urlPatterns = {"/Volunteerregservlet"})
public class Volunteerregservlet extends HttpServlet {

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
            out.println("<title>Servlet Volunteerregservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Volunteerregservlet at " + request.getContextPath() + "</h1>");
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
        
        JSONObject jo=new JSONObject();
        
        try
        {
            String name=request.getParameter("name");
            String phone=request.getParameter("phone");
            String email=request.getParameter("email");
            String hname=request.getParameter("hname");
            String post=request.getParameter("post");
            String city=request.getParameter("city");
            String dis=request.getParameter("dis");
            String state=request.getParameter("state");
            String pin=request.getParameter("pin");
            String org=request.getParameter("org");
            String area=request.getParameter("area");
            String pass=request.getParameter("pass");
            String gender=request.getParameter("gender");
            
            Androidservice aa=new Androidservice();
            aa.login(email, pass, "Volunteer");
            int lid=aa.maxlogins();
            
            Androidservice as=new Androidservice();
            String rs=as.Volunteerreg(lid, name,gender, phone, email, hname, post, city, dis, state, pin, org, area);
            if(rs.equals("1"))
            {
                jo.put("status", "1");
            }
            else
            {
                jo.put("status", "0");
            }
        }
        catch(Exception ex)
        {
            jo.put("status", ex.toString());
        }
        
        response.getWriter().print(jo.toString());
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
