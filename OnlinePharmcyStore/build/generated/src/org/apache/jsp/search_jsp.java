package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta name=\"description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <!-- Twitter meta-->\n");
      out.write("    <meta property=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("    <meta property=\"twitter:site\" content=\"@pratikborsadiya\">\n");
      out.write("    <meta property=\"twitter:creator\" content=\"@pratikborsadiya\">\n");
      out.write("    <!-- Open Graph Meta-->\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("    <meta property=\"og:site_name\" content=\"Vali Admin\">\n");
      out.write("    <meta property=\"og:title\" content=\"Vali - Free Bootstrap 4 admin theme\">\n");
      out.write("    <meta property=\"og:url\" content=\"http://pratikborsadiya.in/blog/vali-admin\">\n");
      out.write("    <meta property=\"og:image\" content=\"http://pratikborsadiya.in/blog/vali-admin/hero-social.png\">\n");
      out.write("    <meta property=\"og:description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <title></title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    <!-- Font-icon css-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<main class=\"app-content\">\n");
      out.write("      <div class=\"app-title\">\n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <ul class=\"app-breadcrumb breadcrumb side\">\n");
      out.write("          <li class=\"breadcrumb-item\"><i class=\"fa fa-home fa-lg\"></i></li>\n");
      out.write("          <li class=\"breadcrumb-item\">Tables</li>\n");
      out.write("          <li class=\"breadcrumb-item active\"><a href=\"#\">Data Table</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <div class=\"tile-body\">\n");
      out.write("              <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\n");
      out.write("                <thead>\n");
      out.write("<tr>\n");
      out.write("   <th>ID</th> \n");
      out.write("  <th>Name</th>\n");
      out.write("                    <th>Category</th>\n");
      out.write("\t\t\t\t\t<th>Company</th>\n");
      out.write("\t\t\t\t\t<th>Quantity</th>\n");
      out.write("\t\t\t\t\t<th>Expire Date</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("\t\t\t\t<th></th>\n");
      out.write("                  </tr>\n");
      out.write("\n");

try{
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            Statement st=con.createStatement();
            String name=request.getParameter("name");
String sql ="select * from medicine where name='"+name+"'";
ResultSet rs=st.executeQuery(sql);
while(rs.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(rs.getInt("id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("category") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("company") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getInt("quantity") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("expire_date") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("price") );
      out.write("</td>\n");
      out.write("\n");

}

} catch (Exception e) {
System.out.println(e.getMessage());
}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write(" </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
