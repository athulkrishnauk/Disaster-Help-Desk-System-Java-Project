/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletpackage;

import Modalpackage.Adminpublicinfomodel;
import Servicepackage.all_service;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author user
 */
@WebServlet(name = "Adminpublicinfoservlet", urlPatterns = {"/Adminpublicinfoservlet"})
public class Adminpublicinfoservlet extends HttpServlet {

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
            out.println("<title>Servlet Adminpublicinfoservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Adminpublicinfoservlet at " + request.getContextPath() + "</h1>");
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
        String UPLOAD_DIRECTORY = "C:\\Users\\user\\Documents\\NetBeansProjects\\Sahayi\\web\\info\\";
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
       
            String subject="";
            String details="";
            String type="";
            String file="";
         
            // process only if its multipart content
	if (isMultipart) {
		// Create a factory for disk-based file items
	           FileItemFactory factory = new DiskFileItemFactory();
                
		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			// Parse the request
			List<FileItem> multiparts = upload.parseRequest(request);
			for (FileItem item : multiparts) {
				if (!item.isFormField()) {
				        file = new File(item.getName()).getName();
					item.write(new File(UPLOAD_DIRECTORY + File.separator + file));
				}
                                else{
                                    if(item.getFieldName().equals("subject")){
                                        subject=item.getString();
                                    }
                                    else if(item.getFieldName().equals("details")){
                                        details=item.getString();
                                    }
                                    else if(item.getFieldName().equals("type")){
                                        type=item.getString();
                                    }
                                }
			}
                        
		} 
		catch (Exception e) 
		{
		}
	}

           Adminpublicinfomodel am=new Adminpublicinfomodel();
           am.setSubject(subject);
           am.setDetails(details);
           am.setType(type);
           am.setFile(file);
           
            all_service as=new all_service();
            String ad=as.publicinfo(am);
            if(ad.equals("1"))
            {
                response.getWriter().print("<script>alert('Successfully Uploaded...!!!');window.location='Admin_home.jsp';</script>");
            }
            else
            {
                response.getWriter().print("<script>alert('Faild...!!!');window.location='AdminPublicInfo.jsp';</script>");
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
