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
public abstract class Human {
    ArrayList<Integer> myCards = new ArrayList<>();
    int total;
    Random rand = new Random();
    public abstract int open();
    public abstract ArrayList setCard(ArrayList array);
    public abstract boolean checkSum(int total);
}
