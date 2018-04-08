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

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    private static final int OVAL_SIZE = 50;
    private static final int OVAL_SPACING = 28;
    private static final int NUM_OVALS = 8;
    private static final Color BORDER_COLOR = Color.RED;


    /*
    * Draw the worm
    * */
    @Override
    public void run(){
        drawWorm();
    }

    /*
    * Draw colored worm circle parts in the center of the screen.
    * If screen is to small worm will be margin to the left or bottom or both.
    * */
    private void drawWorm() {
        double ovalRadius = OVAL_SIZE / 2;
        //                                               |fix to the left|
        double marginLeft = (getWidth() - OVAL_SIZE -(NUM_OVALS * ovalRadius)) / 2;
        //                                   |fix to the bottom|
        double centralTop = (getHeight() - OVAL_SIZE + ovalRadius) / 2;

        GOval oval;
        RandomGenerator gen = new RandomGenerator(); //using for color generation

        for(int i = 0; i < NUM_OVALS; i++){
            //                                                        -(i%2) = |worm hills|
            oval = drawOval(marginLeft + i * OVAL_SPACING,centralTop - (i%2) * OVAL_SPACING, OVAL_SIZE,BORDER_COLOR);
            add(oval);
            oval.setFillColor(gen.nextColor());
        }
    }

    /** Build oval
     * @param x The object margin x, starts from the left(0) and ends at the right side of the window
     * @param y The object margin y, starts from the top(0) end at the bottom of the window
     * @param size The object size
     * @param borderColor color of the border of the circle
     * */
    private GOval drawOval(double x, double y, double size, Color borderColor) {
        GOval oval = new GOval(x, y, size, size);
        oval.setFilled(true);
        oval.setFillColor(Color.BLACK);
        oval.setColor(borderColor);
        return oval;
    }

}
