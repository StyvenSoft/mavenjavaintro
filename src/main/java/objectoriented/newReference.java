/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class newReference {
    
    public void newReference() {
        Account firstAccount = new Account();
        firstAccount.setBalance(23000);
        
        Account secondAccount = firstAccount;
        
        secondAccount.setBalance(1200);
        
        System.out.println("Saldo primera cuenta: " + "cuenta: " + firstAccount.getBalance());
        System.out.println("Saldo segunda cuenta: " + "cuenta: " + secondAccount.getBalance());
        
        // secondAccount.residue += 400;        
        secondAccount.setBalance(400);

        System.out.println("Saldo primera: " + "cuenta: " + firstAccount.getBalance());

    }
}
