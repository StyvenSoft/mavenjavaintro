/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class UserFunctionary {
    
    public static void main(String[] args) {
        Functionary userOne = new Accountant();
        
        userOne.setFullName("Steveen Silva");
        userOne.setDocument("10855445511");
        userOne.setSalary(350000);
        userOne.setType(0);
        
        System.out.println("Salario: " + userOne.getSalary());
        System.out.println("10% salario: " + userOne.getBonus());
    }
}
