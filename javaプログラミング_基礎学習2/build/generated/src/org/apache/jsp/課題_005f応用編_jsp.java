package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class 課題_005f応用編_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Javaプログラミング　基礎学習2　課題（応用編）</h2>\n");
      out.write("        ");

//       10.クエリストリングを利用して、以下の処理を実現してください。
//          簡易素因数分解のロジックを作成します。クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
//          元の値と素因数分解の結果を表示するようにしてください。
//          2ケタ以上の素数が含まれた数値の場合は、「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。
            
//            String numString = request.getParameter("numString");
//            int num = Integer.parseInt(numString);
            int num = 17;
           
            if (num < 2) {
                out.println(num);
                out.println("<br>");
                out.println("素数ではない");
            } else if (num == 2) {
                out.println("元の値は" + num);
                out.println("<br>");
                out.println("素因数分解の結果は" + num);
            } else if (num > 2) {
                for (int i = 2; i <= (num - 1); i++) {
                    if (num % i == 0) {
                        out.println(i);
                        out.println("素数ではない");
                    } else {
                        if (num > 10) {
                            out.println("「元の値　1ケタの素因数　その他」" + num + "はその他へ分類");
                            break;
                        }
                        break;
                    }
                }
            out.println("元の値は" + num);
            out.println("<br>");
            out.println("素因数分解の結果は" + num);
            }    
//                
            
        
        
        
        
        
        
        
        
        
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
