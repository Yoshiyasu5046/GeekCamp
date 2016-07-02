package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>内容確認</title>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>内容確認</h1>\n");
      out.write("        ");

            //文字コード
            request.setCharacterEncoding("UTF-8");

            //データの受け取り
            String name = request.getParameter("txtName");
            String gender = request.getParameter("gender");
            String hobby = request.getParameter("hobby");
            out.print(name);
            out.print("<br>");
            out.print(gender);
            out.print("<br>");
            out.print(hobby);
            
            // ユーザー1回目の訪問
            Date time = new Date();
            SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String strTime = f.format(time);
            out.println("<br>");
            out.println(strTime);
            
            // Cookieの設定
            Cookie c = new Cookie("LastLogin", strTime);
            response.addCookie(c);

            // Cookieによる次回以降の訪問
            Cookie cookie_result[] = request.getCookies();
            out.println("<br>");
            
            if(cookie_result != null) {
                 for(int i = 0; i < cookie_result.length; i++) {
                     out.println("<br>");
                     if(cookie_result[i].getName().equals("LastLogin")) {
                        out.println("クッキーでの最後のログインは、" + cookie_result[i].getValue());
                        break;
                     }
                 }
             }
            
            // セッションの設定
            HttpSession hs = request.getSession(false);
            if (hs == null) {
                hs.setAttribute("LastLogin", strTime);
            }else {
                out.println("<br>");
                long accessTime = session.getLastAccessedTime();
                Date accessDate = new Date(accessTime);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String hsTime = sdf.format(accessDate);
                out.println("セッションでの最後のログインは" + hsTime);
            }
              
        
      out.write("\n");
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
