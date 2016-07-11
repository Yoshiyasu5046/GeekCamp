/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

/**
 *
 * @author yoshiyasukitahara
 */
public class UserDataBeans {
    //フィールド
    private String name = "";
    private String year = "";
    private String month = "";
    private String day = "";
    private String type = "";
    private String tell = "";
    private String comment = "";
    
    public UserDataBeans(String name, String year, String month, String day, String type, String tell, String comment){
            this.type = type;
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
            this.type = type;
            this.tell = tell;
            this.comment = comment;
    }
    
    public UserDataBeans(String year, String month) {
        this.year = year;
        this.month = month;
    }
    
    //フィールドのプロパティ
        public void setName(String name){this.name = name;}
    
        public String getName(){
            return name;
        }
        public void setYear(String year){this.year = year;}
    
        public String getYear(){
            return year;
        }
        public void setMonth(String month){this.month = month;}
    
        public String getMonth(){
            return month;
        }
        public void setDay(String day){this.day = day;}
    
        public String getDay(){
            return day;
        }
        public void setType(String type){this.type = type;}
    
        public String getType(){
            return type;
        }
        public void setTell(String tell){this.tell = tell;}
    
        public String getTell(){
            return tell;
        }
        public void setComment(String comment){this.comment = comment;}
    
        public String getComment(){
            return comment;
        }
}
