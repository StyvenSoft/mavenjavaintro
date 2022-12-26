/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

/**
 *
 * @author s7eveen
 */
public class Account {
    private double residue;
    private int agency;
    private int number;
    Client holder = new Client();
    
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
    
    public boolean transfer(double value, Account account) {
        if (this.residue >= value) {
            this.residue -= value;
            account.depositary(value);
            return false;
        } 
        return false;
    }
    
    // Metodo encapsulamiento
    public double getBalance() {
        return this.residue;
    }
    
    public void setBalance(double residue) {
        this.residue = residue;
    }
    
    public void setAgency(int agency) {
        if(agency > 0) {
            this.agency = agency;
        } else {
            System.out.println("No permitido valores negativos: Agencia");
        }
    }
    
    public int getAgency() {
        return agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }
    
}
