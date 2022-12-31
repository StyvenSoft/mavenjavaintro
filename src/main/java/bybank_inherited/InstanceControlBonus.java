/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class InstanceControlBonus {
    
    public static void main(String[] args) {
        Functionary userTwo = new Functionary();
    
        userTwo.setSalary(750000);
        
        Manager userThree = new Manager();
        userThree.setSalary(860000);
        
        ControlBonification controlBonus = new ControlBonification();
        
        controlBonus.registerSalary(userTwo);
    }
}
