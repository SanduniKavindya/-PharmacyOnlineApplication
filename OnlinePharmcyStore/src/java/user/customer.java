/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(name = "customer", urlPatterns = {"/customer"})
public class customer extends HttpServlet {

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
            out.println("<title>Servlet customer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet customer at " + request.getContextPath() + "</h1>");
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
         String username=request.getParameter("uname");
       String pass=request.getParameter("psw");
       String name;
       //HttpSession session=request.getSession();
       RequestDispatcher dispatcher=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            PreparedStatement pst=con.prepareStatement("select * from user where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, pass);
            //pst.getString(3,name);
            
         ResultSet rs=pst.executeQuery();
         
         if(rs.next()){
             //String userLogout="Logout";
             HttpSession session = request.getSession();
             session.setAttribute("username",rs.getString("username"));
             //session.setAttribute("username",username);
             // session.setAttribute("username", request.getParameter("username"));
           
            //request.setAttribute("user", userLogout);
            //session.setAttribute("uname", uname);
            
             dispatcher = request.getRequestDispatcher("Medicine.jsp");
             dispatcher.forward(request,response);
             
         }
          else{
         
       String errorMessage = "Wrong username or password.";
            request.setAttribute("error", errorMessage);
            request.getRequestDispatcher("customer-login.jsp").forward(request, response);
         }
        
            
        } catch (Exception e) {
            e.printStackTrace();
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
