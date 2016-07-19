/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author yoshiyasukitahara
 */
public class UserDataBeans implements Serializable {
    //フィールド
    private int userID;
    private String name;
    private int year;
    private int month;
    private int day;
    private String tell;
    private int type;
    private String comment;
    private Date birthday;
    private Timestamp newDate;
    
    public static UserDataBeans getInstance(){
        return new UserDataBeans();
    }
    
    public UserDataBeans() {
        
    }
    
    public UserDataBeans(String name, String year, String month, String day, String tell, String type, String comment){
        setName(name);
        setYear(year);
        setMonth(month);
        setDay(day);
        setTell(tell);
        setType(type);
        setComment(comment);
    }
    
    public UserDataBeans(String name, Date birthday, String tell, String type, String comment, Timestamp newDate) {
        setName(name);
        setBirthday(birthday);
        setTell(tell);
        setType(type);
        setComment(comment);
        setNewDate(newDate);
    }
    
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //空文字(未入力)の場合空文字をセット
        if(name.trim().length()==0){
            this.name = "";
        }else{
            this.name = name;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(String year) {
        //初期選択状態の場合0をセット
        if(year.equals("")){
            this.year = 0;
        }else{
            this.year = Integer.parseInt(year);
        }
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(String month) {
        if(month.equals("")){
            this.month = 0;
        }else{
            this.month = Integer.parseInt(month);
        }
    }

    public int getDay() {
        return day;
    }
    public void setDay(String day) {
        if(day.equals("")){
            this.day = 0;
        }else{
            this.day = Integer.parseInt(day);
        }
    }
    
    public Date getBirthday(){
        return birthday;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    } 

    public String getTell() {
        return tell;
    }
    public void setTell(String tell) {
        if(tell.trim().length()==0){
            this.tell = "";
        }else{
            this.tell = tell;
        }
    }

    public int getType() {
        return type;
    }
    public void setType(String type) {
       if(type == null || type.equals("")){
            this.type = 0;
        }else{
            this.type = Integer.parseInt(type);
        }
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        if(comment.trim().length()==0){
            this.comment = "";
        }else{
            this.comment = comment;
        }
    }
    
    public Timestamp getNewDate() {
        return newDate;
    }
    public void setNewDate(Timestamp newDate) {
        this.newDate = newDate;
    }
    
    public ArrayList<String> chkproperties(){
        ArrayList<String> chkList = new ArrayList<String>();
        if(this.name.equals("")){
            chkList.add("name");
        }
        if(this.year == 0){
            chkList.add("year");
        }
        if(this.month == 0){
            chkList.add("month");
        }
        if(this.day == 0){
            chkList.add("day");
        }
        if(this.tell.equals("")){
            chkList.add("tell");
        }
        if(this.type == 0){
            chkList.add("type");
        }
        if(this.comment.equals("")){
            chkList.add("comment");
        }
        
        return chkList;
    }
    
    public void UD2DTOMapping(UserDataDTO udd) {
        udd.setName(this.name);
        if(this.year != 0 || this.month != 0 || this.day != 0){
            Calendar birthday = Calendar.getInstance();
            if(this.month == 0 || this.day == 0){
                birthday.set(this.year,0,1);
            }else{
                birthday.set(this.year,(this.month)-1,this.day);
            }
            udd.setBirthday(birthday.getTime());
        }else{
            udd.setBirthday(null);
        }
        udd.setTell(this.tell);
        udd.setType(this.type);
        udd.setComment(this.comment);
    }
    
    public void DTO2UDBeansMapping(UserDataDTO udd) {
        this.name = udd.getName();
        this.year = Integer.parseInt(new SimpleDateFormat("yyyy").format(udd.getBirthday()));
        this.month = Integer.parseInt(new SimpleDateFormat("MM").format(udd.getBirthday()));
        this.day = Integer.parseInt(new SimpleDateFormat("dd").format(udd.getBirthday()));
        this.tell = udd.getTell();
        this.type = udd.getType();
        this.comment = udd.getComment();
    }

    public void DTO2UDB_BD_ND_Mapping(UserDataDTO udd) {
        this.userID = udd.getUserID();
        this.name = udd.getName();
        this.birthday = udd.getBirthday();
        this.tell = udd.getTell();
        this.type = udd.getType();
        this.comment = udd.getComment();
        this.newDate = udd.getNewDate();
    }
    
}
