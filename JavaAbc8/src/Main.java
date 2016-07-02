/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cleric c = new Cleric();
        System.out.println(c.mp);
        c.selfAid();
        System.out.println(c.mp);
        System.out.println(c.pray(3));
    }
    
}
