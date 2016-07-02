/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Wand {
    private String name; // 杖の威力
    private double power; // 杖の魔力
    public String getName() {return this.name;}
    public void setName(String name) {
        if (name != null || name.length() > 3) {
            this.name = name;
        }
        throw new IllegalArgumentException ("杖の名前が異常です");
    }
    public double getPower() {return this.power;}
    public void setPower(double power) {
        
        this.power = power;
    }
}
