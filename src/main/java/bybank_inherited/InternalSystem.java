/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class InternalSystem {
    
    private String newpassword = "12345";
    
    public boolean authentic(Manager manager) {
        
        boolean canLogin = manager.login(newpassword);
        
        if(canLogin) {
            System.out.println("Login exitoso!");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
