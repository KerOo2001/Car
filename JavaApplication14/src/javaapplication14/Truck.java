package javaapplication14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerolos
 */
public class Truck extends Car {
    private int weight;
    
    public Truck(){}
    
    public Truck(int speed, double regularPrice,String color , int weight){
        super(speed ,regularPrice , color);
        this.weight = weight;
    }
    public double getSalePrice(){
        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80); 
    }
}
