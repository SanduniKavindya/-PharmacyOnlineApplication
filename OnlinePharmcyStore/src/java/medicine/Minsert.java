/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine;

import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
@WebServlet(name = "Minsert", urlPatterns = {"/Minsert"})
public class Minsert extends HttpServlet {

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
            out.println("<title>Servlet Minsert</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Minsert at " + request.getContextPath() + "</h1>");
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
        String category = request.getParameter("category");
        String company = request.getParameter("company");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String expireDate = request.getParameter("expireDate");
        double price = Double.parseDouble(request.getParameter("price"));

         RequestDispatcher dispatcher=null;
       
        try {
             Statement st ;

                   

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            PreparedStatement pst=con.prepareStatement("insert into medicine (name ,category ,company ,quantity ,expire_date,price) values (?,?,?,?,?,?)");
            pst.setString(1, name);
                        pst.setString(2, category);
                        pst.setString(3, company);
                         pst.setInt(4, quantity);
                         pst.setString(5, expireDate);
                         pst.setDouble(6, price);
                         
                                              //  pst.setString(8, ql);
                                                
                                                int rowCount = pst.executeUpdate();
                                                
                                                
                                                HttpSession session=request.getSession();
                                                
                                                if(rowCount>0){
                                                    request.setAttribute("insertSuccess", true);
                                                    dispatcher=request.getRequestDispatcher("add-medicine.jsp");
                                                    request.setAttribute("successMessage", "Medicine added successfully");
                                                     
                                                }
                                                else{
                                                    String errorMessage = "Wrong Insert.";
                                                     request.setAttribute("error", errorMessage);
                                                    request.getRequestDispatcher("add-medicine.jsp").forward(request, response);

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
