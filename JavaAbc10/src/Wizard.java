/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    // getter setter
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Wand getWand() {
        return this.wand;
    }
    public void setWand(Wand wand) {
        this.wand = wand;
    }
    
    // operations
    void heal(Hero h) {
        int basePoint = 10;
        int recoverPoint = (int) (basePoint * this.getWand().getPower());
        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + "回復した");
    }
}
