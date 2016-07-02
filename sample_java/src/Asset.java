/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Asset {
    private String name;
    private int price;
    // Constructor
    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // getter methods
    public String getName() {return this.name;}
    public int getprice() {return this.price;}
}

