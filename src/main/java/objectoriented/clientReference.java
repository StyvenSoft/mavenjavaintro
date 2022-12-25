/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class clientReference {
    
    public static void main(String[] args) {
        Client userClient = new Client();
        
        userClient.fullName = "Diego Perez";
        userClient.document = "1085544452";
        userClient.phone = "311444556";
        
        Account accountUser = new Account();
        accountUser.setAgency(1);
        // Crear objeto por refencia
        accountUser.holder = userClient;
        
        System.out.println(accountUser.holder.document);
        
        
    }
}
