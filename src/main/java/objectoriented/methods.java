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
        account newAccount = new account();
        
        newAccount.depositary(3000);
        
        System.out.println(newAccount.residue);
        
        newAccount.remove(100);
        
    }
    
}
