/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class account {
    double residue;
    int agency;
    int number;
    String holder;
    
    public void depositary(double value) {
        // residue += value;
        this.residue += value;
    }
    
    public boolean remove(double value) {
        if (this.residue >= value) {
            this.residue -= value;
            return true;
        }
        return false;
    }
    
    public boolean transfer(double value, account account) {
        if (this.residue >= value) {
            this.residue -= value;
            account.depositary(value);
            return false;
        } 
        return false;
    }
    
}
