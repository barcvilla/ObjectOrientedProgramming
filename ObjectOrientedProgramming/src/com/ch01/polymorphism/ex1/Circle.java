/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch01.polymorphism.ex1;

/**
 *
 * @author barcvilla
 */
public class Circle extends Shape
{
    double radius;
    
    public Circle(double r)
    {
        this.radius = r;
    }
    
    @Override
    public double getArea()
    {
        double area = 3.14 * (radius * radius);
        return area;
    }
}
