/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Yoshiyasu
 */
public static class MainSample {
    Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(dealer());
        pickedCard();
    }
    public static ArrayList[] dealer() {
        ArrayList[] cards = new ArrayList[4];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new ArrayList<Integer>();
            for (int n = 1; n <= 13; n++) {
                cards[i].add(n);
            }
//        System.out.println(cards[i].toString());
        }
        return cards;
    }
    public int pickedCard() {
        int m = rand.nextInt(4); // リストの中からランダムに数字を選ぶことができるようにする
        int n = rand.nextInt(13); // cards[m][n] random m < 4, n < 13で多分できる。
        ArrayList[] cards = dealer();
        int picked_card = (int) cards[m].get(n); 
        cards[m].remove(n);
        return picked_card;
    }
}
