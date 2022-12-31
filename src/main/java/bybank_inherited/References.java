/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class References {
    
    public static void main(String[] args) {
        // Elemeto mas generico puede ser adacpado al elemento mas especifico
        Functionary functionary = new Manager();
        functionary.setFullName("Paula");
        
        Manager manager = new Manager();
        manager.setFullName("Jimena");
        
        functionary.setSalary(550000);
        manager.setSalary(860000);
        
    }
}
