package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する
 * DB接続系はDBManagerクラスに一任
 * 基本的にはやりたい1種類の動作に対して1メソッド
 * @author hayashi-s
 */
public class UserDataDAO {
    
    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st = con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate) VALUES(?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * データの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public ArrayList<UserDataDTO> search(UserDataDTO ud) throws SQLException{
        
        // フォームの入力内容に合致するユーザー情報をDBから取得するための処理。
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "SELECT * FROM user_t";
            boolean flag = false;
            
            if (!ud.getName().equals("")) {
                sql += " WHERE name like ?";
                flag = true;
            }
            if (ud.getBirthday() != null) {
                // ud.getBirthday()に値があり、flagがfalse（nameがnullの場合）の時の処理。
                if(!flag){
                    sql += " WHERE birthday like ?";
                    flag = true;
                }else{
                    sql += " AND birthday like ?";
                }
            } 
            if (ud.getType()!=0) {
                // ud.getType()に値が入っており、かつnameもbirthdayにも値が入力されていない場合
                if(!flag) {
                    sql += " WHERE type like ?";
                } else{
                    sql += " AND type like ?";       
                }
            }
            
            // フォームの一部が未入力の場合に備えた処理。
            st = con.prepareStatement(sql);
            int queryCheck = 1;
            if (!ud.getName().equals("")) {
                st.setString(queryCheck, "%"+ud.getName()+"%");
                queryCheck++;
            }
            if (ud.getBirthday()!=null) {
                st.setString(queryCheck, "%"+ new SimpleDateFormat("yyyy").format(ud.getBirthday()) + "%");
                queryCheck++;
            }
            if (ud.getType()!=0) {
                st.setInt(queryCheck, ud.getType());
                queryCheck++;
            }

            // 検索内容と一致するユーザーのユーザー情報を配列リストに格納し、この配列リストを返す。
            ResultSet rs = st.executeQuery();
            ArrayList<UserDataDTO> al = new ArrayList<UserDataDTO>();
            while(rs.next()){
                UserDataDTO resultUd = new UserDataDTO();
                resultUd.setUserID(rs.getInt(1));
                resultUd.setName(rs.getString(2));
                resultUd.setBirthday(rs.getDate(3));
                resultUd.setTell(rs.getString(4));
                resultUd.setType(rs.getInt(5));
                resultUd.setComment(rs.getString(6));
                resultUd.setNewDate(rs.getTimestamp(7));
                al.add(resultUd);
            }
            
            System.out.println("search completed");

            return al;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    
    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException{
        
        // 該当IDに合致するユーザー情報をDBから取得するための処理。
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "SELECT * FROM user_t WHERE userID = ?";
            
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());
            
            ResultSet rs = st.executeQuery();
            
            
            // 上のIDを持つユーザー情報を返す。
            UserDataDTO udd = new UserDataDTO();
            if (rs.next()) {
                udd.setUserID(rs.getInt(1));
                udd.setName(rs.getString(2));
                udd.setBirthday(rs.getDate(3));
                udd.setTell(rs.getString(4));
                udd.setType(rs.getInt(5));
                udd.setComment(rs.getString(6));
                udd.setNewDate(rs.getTimestamp(7));
            }
             
            System.out.println("search completed");

            return udd;
            
        }catch(SQLException e){
            System.out.println("検索結果が存在しません。");
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    public UserDataDTO update(UserDataDTO ud) throws SQLException{
        
        // アップデートされたユーザー情報をDBに格納。
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st = con.prepareStatement("UPDATE user_t SET name=?, birthday=?, tell=?, type=?, comment=?, newDate=? WHERE userID = ?");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.setInt(7,ud.getUserID());
            st.executeUpdate();
            System.out.println("update completed");
            
            return ud;
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
        
    }
    
    public UserDataDTO delete(UserDataDTO ud) throws SQLException{
        
        // 指定されたユーザー情報をDBから消去。
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st = con.prepareStatement("DELETE FROM user_t WHERE userID = ?");
            st.setString(1, String.valueOf(ud.getUserID()));
            st.executeUpdate();
            System.out.println("delete completed");
            
            return ud;
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
        
    }
    


}
