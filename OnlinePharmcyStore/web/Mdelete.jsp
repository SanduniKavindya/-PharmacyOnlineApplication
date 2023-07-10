<%-- 
    Document   : Mdelete
    Created on : Jul 3, 2023, 6:43:13 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>




<% 
        // Retrieve the ID of the record to be deleted
        String id = request.getParameter("id");
        
    PreparedStatement pst;
    ResultSet rs;
    int row;
         Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Delete the record from the database
            Class.forName("com.mysql.jdbc.Driver");
             Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            
            
            
            statement.executeUpdate();
            
             pst = con.prepareStatement("DELETE FROM medicine WHERE id = ?");
             pst.setString(1, id);
             row = pst.executeUpdate();

            // Redirect back to the display page
            
             response.sendRedirect("stock.jsp");
            


        } catch (Exception e) {
            out.println("error"+e.toString());
        } 
%>