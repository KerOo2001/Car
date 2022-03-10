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
public class Car {
    private int speed;
    private double regularPrice;
    private String color;
    
    public Car(){}
    
    public Car(int speed, double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    double getSalePrice(){
    return regularPrice;
    }

}
