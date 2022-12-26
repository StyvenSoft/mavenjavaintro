/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Account testAccount = new Account(12);
        Client testClient = new Client();
        
        testClient.setFullName("Steveen");
        testClient.setDocument("1066224455");
        testClient.setPhone("322445121");
        
        testAccount.setHolder(testClient);
        
        System.out.println(testClient.getFullName());
        
        System.out.println(testAccount.getHolder().getFullName());
    }
}
