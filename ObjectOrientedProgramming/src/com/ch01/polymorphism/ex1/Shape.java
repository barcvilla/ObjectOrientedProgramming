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
public abstract class Shape {
    // valor del area de la forma
    private double area;
    // metodo abstract para que la subclase implemente el comportamiento
    public abstract double getArea();
}
