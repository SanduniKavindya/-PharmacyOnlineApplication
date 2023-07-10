package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class manage_002dcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
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
      out.write("  <body class=\"app sidebar-mini rtl\">\n");
      out.write("    <!-- Navbar-->\n");
      out.write("    <header class=\"app-header\"><a class=\"app-header__logo\" href=\"admin.png\">");
      out.print(session.getAttribute("username") );
      out.write("</a>\n");
      out.write("      <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\" aria-label=\"Hide Sidebar\"></a>\n");
      out.write("      <!-- Navbar Right Menu-->\n");
      out.write("      <ul class=\"app-nav\">\n");
      out.write("        <li class=\"app-search\">\n");
      out.write("          <input class=\"app-search__input\" type=\"search\" placeholder=\"Search\">\n");
      out.write("          <button class=\"app-search__button\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("        </li>\n");
      out.write("        <!--Notification Menu-->\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Show notifications\"><i class=\"fa fa-bell-o fa-lg\"></i></a>\n");
      out.write("          <ul class=\"app-notification dropdown-menu dropdown-menu-right\">\n");
      out.write("            <li class=\"app-notification__title\">You have 4 new notifications.</li>\n");
      out.write("            <div class=\"app-notification__content\">\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                  <div>\n");
      out.write("                    <p class=\"app-notification__message\">Lisa sent you a mail</p>\n");
      out.write("                    <p class=\"app-notification__meta\">2 min ago</p>\n");
      out.write("                  </div></a></li>\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                  <div>\n");
      out.write("                    <p class=\"app-notification__message\">Mail server not working</p>\n");
      out.write("                    <p class=\"app-notification__meta\">5 min ago</p>\n");
      out.write("                  </div></a></li>\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                  <div>\n");
      out.write("                    <p class=\"app-notification__message\">Transaction complete</p>\n");
      out.write("                    <p class=\"app-notification__meta\">2 days ago</p>\n");
      out.write("                  </div></a></li>\n");
      out.write("              <div class=\"app-notification__content\">\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                    <div>\n");
      out.write("                      <p class=\"app-notification__message\">Lisa sent you a mail</p>\n");
      out.write("                      <p class=\"app-notification__meta\">2 min ago</p>\n");
      out.write("                    </div></a></li>\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                    <div>\n");
      out.write("                      <p class=\"app-notification__message\">Mail server not working</p>\n");
      out.write("                      <p class=\"app-notification__meta\">5 min ago</p>\n");
      out.write("                    </div></a></li>\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\n");
      out.write("                    <div>\n");
      out.write("                      <p class=\"app-notification__message\">Transaction complete</p>\n");
      out.write("                      <p class=\"app-notification__meta\">2 days ago</p>\n");
      out.write("                    </div></a></li>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <li class=\"app-notification__footer\"><a href=\"#\">See all notifications.</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <!-- User Menu-->\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Open Profile Menu\"><i class=\"fa fa-user fa-lg\"></i></a>\n");
      out.write("          <ul class=\"dropdown-menu settings-menu dropdown-menu-right\">\n");
      out.write("            \n");
      out.write("            <li><a class=\"dropdown-item\" href=\"select-Login.html\"><i class=\"fa fa-sign-out fa-lg\"></i> Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </header>\n");
      out.write("    <!-- Sidebar menu-->\n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("    <aside class=\"app-sidebar\">\n");
      out.write("      <div class=\"app-sidebar__user\">\n");
      out.write("        <div>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"app-menu\">\n");
      out.write("        <li><a class=\"app-menu__item active\" href=\"adminpannel.jsp\"><i class=\"app-menu__icon fa fa-dashboard\"></i><span class=\"app-menu__label\">Dashboard</span></a></li>\n");
      out.write("        <li class=\"treeview\"><a class=\"app-menu__item\" href=\"#\" data-toggle=\"treeview\"><i class=\"app-menu__icon fa fa-plus-square\"></i><span class=\"app-menu__label\">Medicine</span><i class=\"treeview-indicator fa fa-angle-right\"></i></a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a class=\"treeview-item\" href=\"add-medicine.jsp\"><i class=\"icon fa fa-circle-o\"></i> Add medicine</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"manage-medicine.jsp\" target=\"_blank\" ><i class=\"icon fa fa-circle-o\"></i> Manage Medicine</a></li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"app-menu__item\" href=\"stock.jsp\"><i class=\"app-menu__icon fa fa-medkit\"></i><span class=\"app-menu__label\">Stock</span></a></li>\n");
      out.write("        <li class=\"treeview\"><a class=\"app-menu__item\" href=\"#\" data-toggle=\"treeview\"><i class=\"app-menu__icon fa fa-ambulance\"></i><span class=\"app-menu__label\">Supplier</span><i class=\"treeview-indicator fa fa-angle-right\"></i></a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a class=\"treeview-item\" href=\"add-supplier.jsp\"><i class=\"icon fa fa-circle-o\"></i> Add Supplier</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"manage-supplier.jsp\"><i class=\"icon fa fa-circle-o\"></i> Manage Supplier</a></li>\n");
      out.write("           \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview\"><a class=\"app-menu__item\" href=\"#\" data-toggle=\"treeview\"><i class=\"app-menu__icon fa fa-user\"></i><span class=\"app-menu__label\">Customer</span><i class=\"treeview-indicator fa fa-angle-right\"></i></a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a class=\"treeview-item\" href=\"add-customer.jsp\"><i class=\"icon fa fa-circle-o\"></i> Add Customer</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"manage-customer.jsp\"><i class=\"icon fa fa-circle-o\"></i> Manage Customer</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       <li><a class=\"app-menu__item\" href=\"notification.jsp\"><i class=\"app-menu__icon fa fa-bell-o\"></i><span class=\"app-menu__label\">Notifications</span></a></li>\n");
      out.write("          <li><a class=\"app-menu__item\" href=\"page-invoice.jsp\"><i class=\"app-menu__icon fa fa-file\"></i><span class=\"app-menu__label\">Invoice</span></a></li>\n");
      out.write("\t\t  <ul class=\"treeview-menu\">\n");
      out.write("           \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("    </aside>\n");
      out.write("    <main class=\"app-content\">\n");
      out.write("      <div class=\"app-title\">\n");
      out.write("        <div>\n");
      out.write("          <h1><i class=\"fa fa-edit\"></i> Manage Customer</h1>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <ul class=\"app-breadcrumb breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><i class=\"fa fa-home fa-lg\"></i></li>\n");
      out.write("          <li class=\"breadcrumb-item\">Customer</li>\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"#\">Manage Customer</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <div class=\"tile-body\">\n");
      out.write("              <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("\t\t\t\t  <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>E mail</th>\n");
      out.write("\t           <th>Phone</th>\n");
      out.write("                   <th>password</th>\n");
      out.write("                   <th>address</th>\t\t\t\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                      ");

        try{
           
                   

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bandulapvt?useSSL=false","root","");
            Statement st=con.createStatement();
            
            String str="select * from customer";
            ResultSet rs=st.executeQuery(str);
            while(rs.next()){
                
      out.write("\n");
      out.write("                <tr>           \n");
      out.write("    <td>");
      out.print(rs.getString("id"));
      out.write(" </td>\n");
      out.write("    <td>");
      out.print(rs.getString("name"));
      out.write(" </td>\n");
      out.write("    <td>");
      out.print(rs.getString("email"));
      out.write(" </td>\n");
      out.write("    <td>");
      out.print(rs.getString("phone"));
      out.write(" </td>\n");
      out.write("    <td>");
      out.print(rs.getString("password"));
      out.write(" </td>\n");
      out.write("    <td>");
      out.print(rs.getString("address"));
      out.write(" </td>\n");
      out.write("     <td>\n");
      out.write("         <a href=\"edit\">Edit</a></td><td>\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                     <a href=\"Mdelete.jsp\">Delete</a>                     \n");
      out.write("                    </td>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    ");

            }
            
        }catch(Exception e){
            
}
      out.write("\n");
      out.write("                 \n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("    <!-- Essential javascripts for application to work-->\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <!-- The javascript plugin to display page loading on top-->\n");
      out.write("    <script src=\"js/plugins/pace.min.js\"></script>\n");
      out.write("    <!-- Page specific javascripts-->\n");
      out.write("    <!-- Data table plugin-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">$('#sampleTable').DataTable();</script>\n");
      out.write("    <!-- Google analytics script-->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      if(document.location.hostname == 'pratikborsadiya.in') {\n");
      out.write("      \t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("      \t(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("      \tm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("      \t})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("      \tga('create', 'UA-72504830-1', 'auto');\n");
      out.write("      \tga('send', 'pageview');\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
