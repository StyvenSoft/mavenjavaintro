/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class Manager extends Functionary {
    
    private String password;
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String password) {
        return "abc".equals(password);
    }
    
    public double getBonus() {
        return super.getSalary() + // acceso a los metodos de la clase padre
                super.getBonus(); // sobre escritura de metodo
    }
}
