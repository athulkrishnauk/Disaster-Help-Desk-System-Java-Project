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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
@WebServlet(name = "Userviewmaterialreq", urlPatterns = {"/Userviewmaterialreq"})
public class Userviewmaterialreq extends HttpServlet {

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
            out.println("<title>Servlet Userviewmaterialreq</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Userviewmaterialreq at " + request.getContextPath() + "</h1>");
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
        JSONArray ja=new JSONArray();
        
        try
        {
            Androidservice as=new Androidservice();
            ResultSet rs=as.userviewmaterialreq();
            while(rs.next())
            {
                JSONObject jj=new JSONObject();
                jj.put("m_type", rs.getString("m_type"));
                jj.put("details", rs.getString("details"));
                jj.put("date", rs.getString("date"));
                jj.put("ca_name", rs.getString("ca_name"));
                jj.put("co_name", rs.getString("co_name"));
                jj.put("phone", rs.getString("phone"));
                jj.put("email", rs.getString("email"));
                jj.put("place", rs.getString("place"));
                jj.put("district", rs.getString("district"));
                jj.put("total_people", rs.getString("total_people"));
                jj.put("latitude", rs.getString("latitude"));
                jj.put("longitude", rs.getString("longitude"));
                
                ja.add(jj);
                
            }
            
            jo.put("status", ja);
        }
        catch(Exception ex)
        {
            
            jo.put("status", ex.getMessage());
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
