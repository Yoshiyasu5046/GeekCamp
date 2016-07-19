/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author yoshiyasukitahara
 */
public class Mutter implements Serializable {
    private String user;
    private String content;
    
    public Mutter() {}
    public Mutter(String user, String content) {
        this.user = user;
        this.content = content;
    }
    
    public String getUser() {return this.user;}
    public String getContent() {return this.content;}


}
