/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2022-09-28 06:21:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.jsp.Questions;
import com.java.jsp.QuestionDAO;

public final class AnswerAllQuestionForRestoringPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.java.jsp.Questions");
    _jspx_imports_classes.add("com.java.jsp.QuestionDAO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("            rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\" type=\"text/css\" />\r\n");
      out.write("         <style type=\"text/css\">\r\n");
      out.write("         \r\n");
      out.write("         .required:after {\r\n");
      out.write("    content:\" *\";\r\n");
      out.write("    color: red;\r\n");
      out.write("  }\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url(\"img/pass4.jpeg\");\r\n");
      out.write("            background-color: #cccccc;\r\n");
      out.write("        }\r\n");
      out.write("        .img-rounded {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-light bg-light\">\r\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"> <img src=\"img/icons.jpg\"\r\n");
      out.write("                                                   height=\"30\" width=\"100\" alt=\"Password\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav ml-auto\" style=\"margin-right: 30px;\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"HomePage.jsp\">Home</a>    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav> \r\n");
      out.write("        <div>\r\n");
      out.write("            <h1>\r\n");
      out.write("                <b>Welcome To Restore Password Session</b>\r\n");
      out.write("            </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form action=\"AddQuestionForFutureRestorePassword.jsp\" method=\"post\">\r\n");
      out.write("            <!-- Sign up form -->\r\n");
      out.write("            <section class=\"signup\">\r\n");
      out.write("                <div class=\"container\"> \r\n");
      out.write("                    <div class=\"signup-content\"> \r\n");
      out.write("                        <div class=\"signup-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Restore PassWord </h2>\r\n");
      out.write("                            <form class=\"register-form\" id=\"register-form\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\" class=\"required\"><i class=\"zmdi zmdi-email\"></i></label>\r\n");
      out.write("                                    <input type=\"number\" name=\"id\" id=\"id\" placeholder=\"Automatically Generated \" required=\"required\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\" class=\"required\"><i class=\"zmdi zmdi-email\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"nickName\" id=\"email\" placeholder=\"Enter Your Nick Name\" required=\"required\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\" class=\"required\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"schoolName\" id=\"pass\" placeholder=\"Enter School Name\" required=\"required\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\" class=\"required\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"petName\" id=\"pass\" placeholder=\"Enter Pet Name\" required=\"required\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\" class=\"required\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"favSports\" id=\"pass\" placeholder=\"Enter Your Favourite Sports\" required=\"required\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\" class=\"required\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"favIdeal\" id=\"pass\" placeholder=\"Enter Your Favourite Ideal \" required=\"required\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               \r\n");
      out.write("                                <div class=\"form-group form-button\">\r\n");
      out.write("                                    <input type=\"submit\" name=\"signup\" id=\"signup\" class=\"form-submit\" value=\"Submit\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
