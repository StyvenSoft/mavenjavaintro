/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class AccountAccess {
    public static void main(String[] args) {
        Account testAccount = new Account();
        
        testAccount.depositary(400);
        testAccount.remove(300);
        
        System.out.println(testAccount.getBalance());
    }
}
