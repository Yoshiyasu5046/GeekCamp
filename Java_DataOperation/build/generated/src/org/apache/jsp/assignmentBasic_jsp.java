package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.Cookie;
import java.util.Date;

public final class assignmentBasic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SelfIntroduction</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>自己紹介</h1>\n");
      out.write("        <form action=\"http://localhost:8084/Java_DataOperation/result.jsp\" method=\"post\">\n");
      out.write("        <p>ID:<input type=\"text\" name=\"txtName\"></p>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("        性別:<input type=\"radio\" name=\"gender\" value=\"male\">男\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"female\">女    \n");
      out.write("        </p>\n");
      out.write("        <p>趣味<br>\n");
      out.write("            <textarea name=\"hobby\" cols=\"30\" rows=\"5\"></textarea>\n");
      out.write("        </p>\n");
      out.write("        <input type=\"submit\" value=\"送信する\"> \n");
      out.write("        \n");
      out.write("        ");

            HttpSession hs = request.getSession(false);
            if (hs == null) {
                hs.setAttribute("txtName", "txtName");
                hs.setAttribute("gender", "gender");
                hs.setAttribute("hobby", "hobby");
            }else {
                out.println("<br>");
                Object name = hs.getAttribute("txtName");
                Object gender = hs.getAttribute("txtName");
                Object hobby = hs.getAttribute("txtName");
            }
        
      out.write("\n");
      out.write("        <p>前回の入力内容\n");
      out.write("<!--            <input type=\"text\" name=name>\n");
      out.write("            <input type=\"text\" name=gender>\n");
      out.write("            <input type=\"text\" name=hobby>\n");
      out.write("        -->\n");
      out.write("        </p>\n");
      out.write("    </body>\n");
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
