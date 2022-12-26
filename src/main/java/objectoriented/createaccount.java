/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class createaccount {
    
    public void mainCreate() {
        Account firstAccount = new Account(15);
        
        firstAccount.setBalance(16000);
        
        System.out.println(firstAccount.getBalance());
        
        Account secondAccount = new Account(16);
        
        secondAccount.setBalance(5000);
        
        System.out.println(secondAccount.getBalance());
        
        System.out.println(Account.getTotal());
    }
}
