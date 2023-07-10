/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "Cinsert1", urlPatterns = {"/Cinsert1"})
public class Cinsert1 extends HttpServlet {

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
            out.println("<title>Servlet Cinsert1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cinsert1 at " + request.getContextPath() + "</h1>");
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
       
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String password = request.getParameter("password");
        String address = request.getParameter("address");
         RequestDispatcher dispatcher=null;
       
        try {
             Statement st ;

                   

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            PreparedStatement pst=con.prepareStatement("insert into customer (name ,email ,phone ,password ,address) values (?,?,?,?,?)");
            pst.setString(1, name);
                        pst.setString(2, email);
                        pst.setInt(3, phone);
                         pst.setString(4, password);
                         pst.setString(5, address);
                         
                         
                                              //  pst.setString(8, ql);
                                                
                                                int rowCount = pst.executeUpdate();
                                                
                                                
                                                HttpSession session=request.getSession();
                                                
                                                if(rowCount>0){
                                                    request.setAttribute("insertSuccess", true);
                                                    dispatcher=request.getRequestDispatcher("customer-login.jsp");
                                                    request.setAttribute("successMessage", "customer added successfully");
                                                     
                                                }
                                                else{
                                                    String errorMessage = "Wrong Insert.";
                                                     request.setAttribute("error", errorMessage);
                                                    request.getRequestDispatcher("index.html").forward(request, response);

                                                }
         
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
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
