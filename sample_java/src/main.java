/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yoshiyasu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cleric c = new Cleric();
        c.name = "John";
        c.selfAid();
        System.out.println(c.pray(4));
    }
    
}
