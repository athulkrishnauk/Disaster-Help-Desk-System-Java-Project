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
@WebServlet(name = "Helpreqservlet", urlPatterns = {"/Helpreqservlet"})
public class Helpreqservlet extends HttpServlet {

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
            out.println("<title>Servlet Helpreqservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Helpreqservlet at " + request.getContextPath() + "</h1>");
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
            String gender=request.getParameter("gender");
            String phone=request.getParameter("phone");
            String place=request.getParameter("place");
            String dis=request.getParameter("dis");
            String noperson=request.getParameter("noperson");
            String details=request.getParameter("details");
            String longi=request.getParameter("longi");
            String lati=request.getParameter("lati");
            String imei=request.getParameter("imei");
            Androidservice as=new Androidservice();
            String aa=as.helprequest(name, gender, phone, place, noperson, dis, details, longi, lati,imei);
            if(aa.equals("1"))
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
