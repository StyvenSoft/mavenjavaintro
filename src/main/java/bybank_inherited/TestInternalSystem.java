/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class TestInternalSystem {
    
    public static void main(String[] args) {
        InternalSystem system = new InternalSystem();
        
        Manager managerOne = new Manager();
        
        Administrator admin = new Administrator();
        
        system.authentic(managerOne);
        system.authentic(admin);
    }
}
