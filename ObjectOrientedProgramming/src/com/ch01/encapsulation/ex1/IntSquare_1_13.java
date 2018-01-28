/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch01.encapsulation.ex1;

/**
 *
 * @author barcvilla
 */
public class IntSquare_1_13 {
    // atributo privado
    private double squareValue;
    
    // interface publica
    public double getSquare(int value)
    {
        squareValue = calculateSquare(value);
        return squareValue;
    }
    
    // implementacion privada
    private double calculateSquare(int value)
    {
        /* cambiamos la implementacion
        return value * value;
        */
        return Math.pow(value, 2);
    }
}
