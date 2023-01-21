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
public class CurrentAccount extends Account {
    
    public CurrentAccount(int agency) {
        super(agency);
    }
    
    // Metodo sobreescrito
    @Override
    public void remove(double value) {
        double commission = 0.2;
        super.remove(value + commission);
    }    

    @Override
    public void depositary(double value) {
        this.residue = this.residue + value;
    }
    
}
