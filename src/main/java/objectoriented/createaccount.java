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
        Account firstAccount = new Account();
        
        firstAccount.residue = 16000;
        
        System.out.println(firstAccount.residue);
        
        Account secondAccount = new Account();
        
        secondAccount.residue = 5000;
        
        System.out.println(secondAccount.residue);
        
    }
}
