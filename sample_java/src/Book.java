/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Book extends TangibleAsset {
    private String isbn;
    // Constructor
    public Book (String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }
    // getter methods
    public String getBook () {return this.isbn;}
}