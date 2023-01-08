/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class TestAccount {
    
    public static void main(String[] args) {
        
        CurrentAccount ca = new CurrentAccount(10);
        SavingsAccount sa = new SavingsAccount(11);
        
        ca.depositary(300);
        ca.transfer(200, sa);
        
        System.out.println(ca.getBalance()); // Obtener Salgo
        System.out.println(sa.getBalance());
    }
}
