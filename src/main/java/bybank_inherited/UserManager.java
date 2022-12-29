/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class UserManager {
    
    public static void main(String[] args) {
        // Functionary managerOne = new Functionary();
        Manager managerOne = new Manager();
        
        managerOne.setSalary(600000);
        managerOne.setPassword("abc");
        managerOne.setType(1);
        
        System.out.println(managerOne.getBonus());
        System.out.println(managerOne.login("abc"));
    }
}
