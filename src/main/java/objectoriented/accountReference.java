/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class accountReference {
    
    public static void main(String[] args) {
        Account accountUser = new Account(13);
        
        System.out.println(accountUser.holder.getFullName()); // Null
    }
}
