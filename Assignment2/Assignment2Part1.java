package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;
/* File: Assignment2Part1
* THE QUADRATIC EQUATION
* ------------------------------------------
* This program is calculate quadratic equation.
* Input 3 arguments from console and find out a discriminant.
* Then program find out the root(s) "x" for this formula: a*(x^2) + b*x + c = 0 , if them are exist
* */

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    /*
     * input 3 values to call discriminant calculator
     * */
    @Override
    public void run() {
        //read a != 0, read b, read c
        discriminantAndRoots(readANotZero(), readDouble("enter b: "), readDouble("enter c: "));
    }

    /*
    * one of the cases for calculation is a != 0
    * */
    private double readANotZero() {
        double a = readDouble("enter a: "); //read a
        while(a == 0) {
            println(" \"a\" can't be 0 ");
            a = readDouble("enter a: ");
        }
        return a;
    }


    /*
     *  function that calculate and show on console discriminant and roots - if last ones are exist
     *  param: three doubles what are parts of formula
     *  return: discriminant and roots values
     * */
    private static void discriminantAndRoots(double a, double b, double c){

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double xx = (-b - Math.sqrt(discriminant)) / 2 * a; // root x1
        double xy = (-b + Math.sqrt(discriminant)) / 2 * a; // root x2

        System.out.println("Discriminant is: " + discriminant);

        if(discriminant < 0) {                              //no roots
            System.out.println("There are no real roots.");
        } else
        if(discriminant == 0 ) {                            //one root
            System.out.println("There is one root: " + xx);
        } else {                                            //two roots
            System.out.println("There are two roots: " + xx + " " + xy);

        }
    }

}
