/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author PC
 */
public class Nisit extends Person{
    Person person = new Person();
    private String subject;
    
    String AtoString(){
        return this.subject;
    }
    void setMajor(String s){
        this.subject = s;
        System.out.println("subject is "+this.subject);
    }
}
