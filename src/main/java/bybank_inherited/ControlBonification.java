/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class ControlBonification {
    
    private double sum;
    
    public double registerSalary(Functionary functionary) {
        
        this.sum = functionary.getBonus() + this.sum;
        System.out.println("Total actual: " + this.sum);
        return this.sum;
    }
}
