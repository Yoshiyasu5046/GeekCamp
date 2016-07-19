package jums;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class DeleteResult extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        
        try {
            //アクセスルートチェック
            String accesschk = request.getParameter("ac");
            if(accesschk == null || (Integer) hs.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }
        
            UserDataBeans udb = new UserDataBeans();
            UserDataDTO deleteDTO = (UserDataDTO) hs.getAttribute("resultData");

            //入力された情報をDTOに入れてUPDATEする
            udb.UD2DTOMapping(deleteDTO);
            UserDataDTO deleteData = UserDataDAO.getInstance().delete(deleteDTO);

            // リクエストスコープに格納
            request.setAttribute("deleteUdb", deleteData);
            
            // 検索結果ページへのURLをセッションに保存。
            String to_searchResult = (String) hs.getAttribute("to_searchResult");
            request.setAttribute("to_searchResult", to_searchResult);

            // resultdetail.jspへのurlパスをリクエストスコープに格納
            String to_resultDetail = (String) hs.getAttribute("to_resultDetail");
            request.setAttribute("to_resultDetail", to_resultDetail);
            
            // セッションを消去
            hs.invalidate();
        
            request.getRequestDispatcher("/deleteresult.jsp").forward(request, response);
        
        
        } catch(Exception e) { 
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        } finally {
            out.close();
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
        processRequest(request, response);
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
