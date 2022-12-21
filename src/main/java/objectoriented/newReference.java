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
        account firstAccount = new account();
        firstAccount.residue = 23000;
        
        account secondAccount = firstAccount;
        
        secondAccount.residue = 1200;
        
        System.out.println("Saldo primera cuenta: " + "cuenta: " + firstAccount.residue);
        System.out.println("Saldo segunda cuenta: " + "cuenta: " + secondAccount.residue);
        
        secondAccount.residue += 400;
        System.out.println("Saldo primera: " + "cuenta: " + firstAccount.residue);

    }
}
