/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author yoshiyasukitahara
 */
@WebServlet(urlPatterns = {"/Q9"})
public class Q9 extends HttpServlet {

   

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
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");        

        request.setCharacterEncoding("UTF-8"); //文字コード定義
        String insertedId = request.getParameter("insertid"); //入力されたID
        String insertedName = request.getParameter("insertname"); //入力された名前
        String insertedTell = request.getParameter("inserttell"); //入力された電話番号
        String insertedAge = request.getParameter("insertage"); //入力された年齢
        String insertedBD = request.getParameter("insertbirth"); //入力された生年月日

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","root","root");
            
            // sql
            db_st = db_con.prepareStatement("insert into profiles values (?, ?, ?, ?, ?)");
            db_st.setInt(1, Integer.parseInt(insertedId));
            db_st.setString(2, insertedName);
            db_st.setString(3, insertedTell);
            db_st.setInt(4, Integer.parseInt(insertedAge));
            db_st.setDate(5, new java.sql.Date(sdf.parse(insertedBD).getTime()));
            int r = db_st.executeUpdate();
            out.println("課題9" + "<br>");
            int d = db_st.executeUpdate(); //データベースに書き込んだ件数
                if(d != 0){    
                    out.println("データベースに"+r+"件の書き込みを成功しました。");    
                }
            db_st.close();
            db_con.close();
        } catch (SQLException e_sql) {
            out.println("接続時にエラーが発生しました：" + e_sql.toString());
        } catch (Exception e) {
            out.println("接続時にエラーが発生しました：" + e.toString());
        } finally {
            if (db_con != null){
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
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