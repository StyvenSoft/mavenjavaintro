/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectoriented;

import bybank_inherited.InsufficientBalanceException;

/**
 *
 * @author s7eveen
 */
public abstract class Account {
    protected double residue;
    private int agency;
    private int number;
    Client holder = new Client();
    // Total de cuentas
    private static int total = 0;
        
    // Metodo constructor
    public Account(int agency) {
        if(agency <= 0) {
            System.out.println("No se permite valor: 0");
        }
        total++;
        System.out.println("Total de cuentas creadas: " + total);
        this.agency = agency;
    }
    
    public abstract void depositary(double value);
    
    public void remove(double value) {
        if(this.residue < value) {
            throw new InsufficientBalanceException("No tiene valor!");
        }
        this.residue -= value;
        
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
    
    public static int getTotal() {
        return Account.total;
    }
}
