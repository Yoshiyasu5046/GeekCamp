
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Cleric {
    private String name;
    private int hp;
    static final int maxHp = 50;
    private int mp;
    static final int maxMp = 50;
    // constructor
    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    public Cleric(String name, int hp) {
        this(name, hp, Cleric.maxHp);
    }
    public Cleric(String name) {
        this(name, Cleric.maxHp, Cleric.maxMp);
    }
}
