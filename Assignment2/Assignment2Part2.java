package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;
/* File: Assignment2Part2
 * FIRST ILLUSION
 * ------------------------------------------
 * This program is build illusion from four black circles and one white square.
 * */
import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 450;
    public static final int APPLICATION_HEIGHT = 450;
    private static final double CIRCLE_DIAMETER = 150;

    /*
    *draws figure named "optical illusion"
    * */
    @Override
    public void run() {
        buildIllusion();
    }


    /*
     *draws four circles then one square in the middle point
     * */
    private void buildIllusion(){
        double margin = CIRCLE_DIAMETER / 2;

        double widestX = getWidth() - CIRCLE_DIAMETER;
        double lowestY = getHeight() - CIRCLE_DIAMETER;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                addCircle(i * widestX, j  * lowestY);
            }
        }
        addRect(margin, widestX, lowestY);
    }
    /**
    * Draws Circle in different positions
    * @param x - is margin width
     *@param y - is margin height
    * */
    private void addCircle(double x, double y){
        GOval circle;
        circle = new GOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle.setFillColor(Color.black);
        circle.setFilled(true);
        add(circle);
    }
    /*
    * Draws a Rect
    * */
    private void addRect(double margin, double rectWidth, double rectHeight){
        //rect position is a window size minus is half circle size(margin)
        GRect rect = new GRect(margin, margin, rectWidth, rectHeight);
        rect.setFillColor(Color.WHITE);
        rect.setColor(Color.WHITE);
        rect.setFilled(true);
        add(rect);
    }
}
