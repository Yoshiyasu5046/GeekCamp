/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Account {
    String accountNumber;
    int balance;
    
    public String toString() {
        return "￥" + this.balance + "(口座番号= " + this.accountNumber + ")";
    }
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o instanceof Account) {
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if(an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }
}
