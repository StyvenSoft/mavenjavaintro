/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

import objectoriented.Account;

/**
 *
 * @author s7eveen
 */
public class TestAccountException {
    
    public static void main(String[] args) {
        Account account = new CurrentAccount(123);
        
        account.depositary(210);
        account.remove(200);
        account.remove(10);
    }
    
}
