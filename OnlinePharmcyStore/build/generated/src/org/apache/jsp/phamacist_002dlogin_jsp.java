package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phamacist_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style-login.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<title>Pharmacist Login</title>\n");
      out.write("         <style>\n");
      out.write("        .error-box {\n");
      out.write("            background-color: #f8d7da;\n");
      out.write("            color: #721c24;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
 if (request.getAttribute("error") != null) { 
      out.write("\n");
      out.write("        <div class=\"error-box\">\n");
      out.write("            ");
      out.print( request.getAttribute("error") );
      out.write("\n");
      out.write("        </div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"container\">\n");
      out.write("\t\t<div class=\"form-container log-in-container\">\n");
      out.write("                    <form action=\"phamacy\" method=\"post\">\n");
      out.write("\t\t\t\t<h1>Login</h1>\n");
      out.write("\t\t\t\t<div class=\"social-container\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"social\"><i class=\"fa fa-facebook fa-2x\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"social\"><i class=\"fab fa fa-twitter fa-2x\"></i></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span>or use your account</span>\n");
      out.write("\t\t\t\t<input type=\"email\" placeholder=\"Email\" name=\"uname\" />\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Password\" name=\"psw\" />\n");
      out.write("\t\t\t\t<a href=\"#\">Forgot your password?</a>\n");
      out.write("\t\t\t\t<button>Log In</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"overlay-container\">\n");
      out.write("\t\t\t<div class=\"overlay\">\n");
      out.write("\t\t\t\t<div class=\"overlay-panel overlay-right\">\n");
      out.write("\t\t\t\t\t<h1>Hello User!</h1>\n");
      out.write("\t\t\t\t\t<p>Enter your personal details & start your journey with us.</p>\n");
      out.write("\t\t\t\t\t<img src=\"parmacist.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
