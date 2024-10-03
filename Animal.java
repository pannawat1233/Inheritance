/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author PC
 */
public class Animal extends Priceable{
    
    private int whatisthis; 
    
    public void eat(String NameAnimal){
        System.out.println(NameAnimal+" eat");
    }
    public void Sleep(String NameAnimal){
        System.out.println(NameAnimal+" Sleep");
    }
    public void fly(String NameAnimal){
        System.out.println(NameAnimal+" fly");
    }
    public int calculate(int a1,int b1){
        int C1 = a1*b1;
        this.whatisthis = C1;
        return this.whatisthis;
    }
}
