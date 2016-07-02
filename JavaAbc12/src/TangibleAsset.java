/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;
    // constructor
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
    // getter methods
    public String getColor() {return this.color;}
    public double getWeight() {return this.weight;}
    public void setWeight(double weight) {this.weight = weight;}
}
