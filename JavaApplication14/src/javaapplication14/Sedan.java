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
public class Sedan extends Car{
    private int length;
    
    public Sedan()
    {
    }
    
    public Sedan(int speed, double regularPrice,String color , int lenght){
        super(speed ,regularPrice , color);
        this.length = lenght;
    }

    
    public double getSalePrice(){
        return super.getSalePrice()*(length >20 ? 0.95 : 0.90);
    }
}
