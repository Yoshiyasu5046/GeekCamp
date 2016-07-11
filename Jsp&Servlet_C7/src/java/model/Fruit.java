/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yoshiyasukitahara
 */
public class Fruit implements java.io.Serializable {
    private String name;
    private int price;
    public Fruit() {}
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
