/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class methods {
    
    public static void main(String[] args) {
        Account newAccount = new Account();
        
        newAccount.depositary(3000);
        
        System.out.println(newAccount.getBalance());
        
        newAccount.remove(100);
        System.out.println(newAccount.getBalance());
        
        Account accountUser = new Account();
        accountUser.depositary(1000);
        
        boolean conTransfer = accountUser.transfer(400, newAccount);
        
        if(conTransfer) {
            System.out.println("Transferencia exitosa!");
        } else {
            System.out.println("Lo sentimos, no se puede realizar la transferencia");
        }
    }
    
}
