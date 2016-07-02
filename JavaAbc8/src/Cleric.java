/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Yoshiyasu
 */
public class Cleric {
    Random rand = new Random();
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;
    public void selfAid() {
        this.mp -= 5;
        this.hp = this.maxHp;
    }
    public int pray(int num) {
        int praySec = num;
        int recovery = praySec + rand.nextInt(2);
        this.mp += recovery;
        if (this.mp > 10) {
            this.mp = this.maxMp;
        }
        return recovery;
    }
}
