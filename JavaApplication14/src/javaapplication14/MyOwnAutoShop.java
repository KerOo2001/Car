/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Kerolos
 */
public class MyOwnAutoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sedan sedan = new Sedan(300, 450, "black", 30);
        
        Ford ford1 = new Ford(250, 200, "yellow", 2021, 35);
        Ford ford2 = new Ford(200, 170, "red", 2020, 40);
        Car car = new Car(100, 100, "white");
        System.out.println("Sedan: " + sedan.getSalePrice());
        System.out.println("Ford1: " + ford1.getSalePrice());
        System.out.println("Ford2: " + ford2.getSalePrice());
        System.out.println("Car: " + car.getSalePrice());
    }
    
}
