package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;

import acm.graphics.GOval;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* File: Assignment2Part6
 * The Worm
 * ------------------------------------------
 * This program is build worm from ovals and display it.
 * */
public class Assignment2Part6 extends WindowProgram{

    public static final int APPLICATION_WIDTH = 200;
    public static final int APPLICATION_HEIGHT = 200;
    private static final int OVAL_SPACING = 20;
    private static final int NUM_OVALS = 15;
    private static final Color BORDER_COLOR = Color.RED;


    
    @Override
    public void run(){
        drawWorm();
    }

    private void drawWorm() {

        GOval oval;
        RandomGenerator gen = new RandomGenerator(); //using for color generation

        for(int i = 0; i < NUM_OVALS; i++){
            oval = drawOval(i * OVAL_SPACING,(i%2) * OVAL_SPACING, 50,BORDER_COLOR);
            add(oval);
            oval.setFillColor(gen.nextColor());
        }
    }

    private GOval drawOval(double x, double y, double size, Color borderColor) {
        GOval oval = new GOval(x, y, size, size);
        oval.setFilled(true);
        oval.setFillColor(Color.BLACK);
        oval.setColor(borderColor);
        return oval;
    }

}
