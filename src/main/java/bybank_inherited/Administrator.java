/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bybank_inherited;

/**
 *
 * @author s7eveen
 */
public class Administrator extends Functionary implements Authenticable {
    
    @Override
    public double getBonus(){
        return 0;
    }

    @Override
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean login(String password) {
        return false;
    }
    
}
