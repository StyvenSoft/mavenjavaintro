/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

import objectoriented.Account;

/**
 *
 * @author s7eveen
 */
public class SavingsAccount extends Account {
    
    public SavingsAccount(int agency) {
        super(agency);
    }

    @Override
    public void depositary(double value) {
        this.residue = this.residue + value;
    }
}
