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
public class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    public Ford(){}

    
    public Ford(int speed, double regularPrice,String color , int year , int manufacturerDiscount){
        super(speed ,regularPrice , color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
    
}
