/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import java.util.Scanner;
/**
 *
 * @author PC
 */

public class Test 

{

    public static void main(String[] args) {
        Priceable t = new TV();
        t.setPrice(50000);
        int money = t.getPrice();
        System.out.println("TV's price is "+money);
        Bird b = new Bird();
        b.setPrice(200);
        System.out.println("Bird's price is "+b.getPrice());
        Animal a = new Cat();
        System.out.println(a.calculate(5,10));
        a.eat("Cat");
        a.fly("Cat");
        Cat c = new Cat();
        c.Sleep("Cat");
        System.out.println("____________________________________________________");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(4, 5);

        double totalArea = ShapeArray.sumArea(shapes);
        System.out.println("Total area of shapes: " + totalArea);
        System.out.println("____________________________________________________");
        Scanner input = new Scanner(System.in);
        System.out.println("Enther Name");
        String name = input.nextLine();
        Person p = new Person();
        p.setName(name);
        System.out.println("Person name = "+p.getName());
        System.out.println("Enther Major");
        String Lastname = input.nextLine();
         Nisit n = new Nisit();
         n.setName(name);
         n.setMajor(Lastname);
         System.out.println(name+" "+Lastname);
    }
}
