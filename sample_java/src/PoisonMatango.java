/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class PoisonMatango extends Matango{
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた");
            int dmg = h.getHp() / 5;
            h.setHp(h.getHp() - dmg);
            System.out.println(dmg + "ポイントのダメージ");
            this.poisonCount--;
        }
    }
}
