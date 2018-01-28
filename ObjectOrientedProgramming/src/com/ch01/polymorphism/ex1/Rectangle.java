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
public class Rectangle extends Shape
{
    double length;
    double width;
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    @Override
    public double getArea()
    {
        double area = length * width;
        return area;
    }
}
