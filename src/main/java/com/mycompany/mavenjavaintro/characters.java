/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenjavaintro;

/**
 *
 * @author s7eveen
 */
public class characters {
    
    public void MainChar() {
        char character = 'a';
        System.out.println(character);
        
        character = 65 + 2;
        
        char secondChar = (char) (character + 3);
        
        System.out.println(secondChar);
        
        int counter = 0;
        int total = 0;
        
        while(counter <= 10) {
            total += counter;
        }
        System.out.println(total);
        
        for(int count = 0; count <= 20; count++) {
            System.out.println(count);
        }
        
        for(int counte = 0; counte <= 10; counte++) {
            for(int multip = 0; multip <=10; multip++) {
                System.out.print(counte * multip);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
