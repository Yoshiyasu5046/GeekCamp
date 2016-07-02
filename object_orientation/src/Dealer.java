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
public class Dealer extends Human {
    // [質問]DealerクラスとUserクラスとでcardsをシェアする方法
    public static ArrayList[] cards() {
        ArrayList[] cards = new ArrayList[4];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new ArrayList<>();
            for (int n = 1; n <= 13; n++) {
                cards[i].add(n);
            }
//            System.out.println(cards[i].toString());
        }
        return cards;
    }
    
    public int score(int card) {
        total = 0;
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
        return score(card); //[質問]こういった場合の正しいreturnの処理。
    }
    
    public int pickedCard() {
        int m = rand.nextInt(4); // リストの中からランダムに数字を選ぶことができるようにする
        int n = rand.nextInt(13); // cards[m][n] random m < 4, n < 13で多分できる。
        ArrayList[] cards = cards();
        int picked_card = (int) cards[m].get(n); 
        cards[m].remove(n);
//        pickedCardで引かれたカードがcardsから削除されているかを確かめるためのコード
//        for (int i = 0; i < cards.length; i++) {
//            System.out.println(cards[i].toString());
//        }
        int cardScore = score(picked_card);
        return cardScore;
    }
    
    public ArrayList deal() {
        total = 0;
        ArrayList<Integer> first_two_picks = new ArrayList<>();
        for (; first_two_picks.size() < 2;) {
            int picked_card = pickedCard();
//            System.out.println(score(picked_card)); // picked_cardのスコアを確かめるために使用
            first_two_picks.add(picked_card);
        }
//        System.out.println(open());
        setCard(first_two_picks); // myCardsにカードの中身を挿入
//        open();
//        System.out.println(open()); // dealメソッド実行後のopen()の中身を確かめるときに使用。
        return first_two_picks;
    }
    
    public ArrayList hit() {
        deal();
//        System.out.println(deal());
        open();
//        System.out.println(open());
//        System.out.println(total); //この時点でのtotalの値の確認のために使用
        ArrayList<Integer> otherPicks = new ArrayList<>();
        boolean check = checkSum(total);
        while (check == true) {
            int picked_card = pickedCard();
            otherPicks.add(picked_card);
            setCard(otherPicks);
//            System.out.println(setCard(otherPicks)); // otherPicks追加後にmyCardsのチェックのために使用
            total += open(); // printしていないのになぜtotalが表示されるのか？
//            System.out.println(total);
            check = checkSum(total);
        }
//        System.out.println(open()); // dealメソッド実行後のopen()の中身を確かめるときに使用。
        return otherPicks;
    }
    
    public int open() {
        total = 0;
        for (int i = 0; i < myCards.size(); i++) {
//            System.out.println(myCards.get(i));
            total += myCards.get(i);
        }
        return total;
    }
    
    public ArrayList setCard(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            myCards.add((int) array.get(i));
        }
        return myCards;
    }
    
    public boolean checkSum(int total) {
        if (total <= 17) {
            return true;
        } else {
            return false;
        }   
    }
}
