/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidConnection;

import Servicepackage.Androidservice;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
@WebServlet(name = "Voluteerprofileservlet", urlPatterns = {"/Voluteerprofileservlet"})
public class Voluteerprofileservlet extends HttpServlet {

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
            out.println("<title>Servlet Voluteerprofileservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Voluteerprofileservlet at " + request.getContextPath() + "</h1>");
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
            String lid=request.getParameter("lid");
            
            Androidservice as=new Androidservice();
            ResultSet rs=as.volunteerprofileview(lid);
            if(rs.next())
            {
                jo.put("name", rs.getString("v_name"));
                jo.put("gender", rs.getString("gender"));
                jo.put("phone", rs.getString("phone"));
                jo.put("email", rs.getString("email"));
                jo.put("hname", rs.getString("ho_name"));
                jo.put("post", rs.getString("post"));
                jo.put("city", rs.getString("city"));
                jo.put("district", rs.getString("district"));
                jo.put("state", rs.getString("state"));
                jo.put("pin", rs.getString("pin"));
                jo.put("org", rs.getString("organization"));
                jo.put("area", rs.getString("area_vo"));
                
                
                jo.put("status", "ok");
                
            }
            else
            {
                jo.put("status", "no");
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
