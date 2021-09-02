/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidConnection;

import Dbpackage.Constants;
import Servicepackage.Androidservice;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
@WebServlet(name = "Userpostdisasterservlet", urlPatterns = {"/Userpostdisasterservlet"})
public class Userpostdisasterservlet extends HttpServlet {

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
            out.println("<title>Servlet Userpostdisasterservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Userpostdisasterservlet at " + request.getContextPath() + "</h1>");
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
        
        JSONObject jo=new JSONObject();
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        
        byte[] photoBytes=null;
        ServletFileUpload upload=new ServletFileUpload();
            FileItemIterator iter=null;
            //String stid=null;
//            String qrdata=null;
            String place="";
            String photo="";
            String details="";
            String disaster="";  
            String dis="";
            String lid="";
            String fileExt="";
            
            try{
            int flag=0;
            iter=upload.getItemIterator(request);
            while(iter.hasNext())
            {
                FileItemStream item=iter.next();
                String nam=item.getFieldName();
                InputStream stream=item.openStream();
                if(item.isFormField())
                {
                    String str=Streams.asString(stream);
                    if(nam.equals("place"))
                    {
                        place=str;
                    }
                    if(nam.equals("details"))
                    {
                        details=str;
                    }
                    if(nam.equals("disaster"))
                    {
                        disaster=str;
                    }
                    if(nam.equals("dis"))
                    {
                        dis=str;
                    }
                    if(nam.equals("lid"))
                    {
                        lid=str;
                    }
                }
                else
                {        
                    photoBytes=IOUtils.toByteArray(stream);
                    fileExt=item.getName().substring(item.getName().lastIndexOf(".") + 1);
                }                
            }
            
            
            
            int disasterID=3;
            
            Androidservice ad=new Androidservice();
            
            Androidservice as=new Androidservice();
            String aa=as.postdisaster(lid, disaster, details, fileExt, place, dis);
            disasterID=ad.maxdisaster();
            
            photo="disaster_"+disasterID+"."+fileExt;
            File f=new File(Constants.disasterURL+photo);
            if(!f.exists())
            {
                f.createNewFile();
            }
            FileOutputStream fos=new FileOutputStream(f);
            IOUtils.write(photoBytes, fos);
            fos.close();
            as.updatedisaster(disasterID+"", photo);
            if(aa.equals("1"))
            {
                jo.put("status", "1");
            }
            else
            {
                jo.put("status", "0");
            }
            }
            catch(Exception e){
                System.out.println(e.toString());
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
