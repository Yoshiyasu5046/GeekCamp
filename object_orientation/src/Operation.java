
import java.util.ArrayList;
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
public class Operation {
    Human myCards;
    Random rand = new Random();
    int total;
    
    public static ArrayList[] dealer() {
        ArrayList[] cards = new ArrayList[4];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new ArrayList<>();
            for (int n = 1; n <= 13; n++) {
                cards[i].add(n);
            }
        System.out.println(cards[i].toString());
        }
        return cards;
    }
    
    public int score(int card) {
        int score;
        if (card == 1) {
            if (total > 21) {
                score = 1;
                return score;
            }else if (total < 21) {
                score = 11;
                return score;
            }
        }else if (card < 10) {
            score = card;
            return score;
        }else {
            score = 10;
            return score;
        }
        return score(card); //こういった場合の正しいreturnの処理。
    }
    
    public int pickedCard() {
        int m = rand.nextInt(4); // リストの中からランダムに数字を選ぶことができるようにする
        int n = rand.nextInt(13); // cards[m][n] random m < 4, n < 13で多分できる。
        ArrayList[] cards = dealer();
        int picked_card = (int) cards[m].get(n); 
        cards[m].remove(n);
        return picked_card;
    }
    
    public ArrayList deal() {
        ArrayList<Integer> first_two_picks = new ArrayList<>();
        for (; first_two_picks.size() <= 2;) {
            int picked_card = pickedCard();
            first_two_picks.add(picked_card);
        }
        return first_two_picks;
    }
    
    public ArrayList hit() {
        ArrayList<Integer> third_turns = new ArrayList<>();
        int picked_card = pickedCard();
        third_turns.add(picked_card);
        return third_turns;
    }
    
    public void setCard(ArrayList array) {
        
    }
    public boolean checkSum() {
        // カードが必要な場合をどう表現するべきか？
        if () {
            return true;
        }
        return false;
    }
    public int open() {
        int result = ;
    }
}
