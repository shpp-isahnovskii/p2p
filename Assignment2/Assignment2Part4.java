package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;
/* File: Assignment2Part4, FLAG BUILDER
 * THE FLAG
 * ------------------------------------------
 * This program build a flag from vertical and horizontal lines.
 * */
import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;
    private static final double FLAG_WIDTH = 500;
    private static final double FLAG_HEIGHT = 350;
    private static final int FLAG_PARTS = 3; //change this if you change flag lines quantity
    private static final boolean FLAG_LINES_IS_HORIZONTAL = true; // vertical [|] or horizontal [-] flag
    private static final Color COLOR_ONE = new Color(0, 87, 184);
    private static final Color COLOR_TWO = new Color(255, 215, 0);
    private static final Color COLOR_THREE = new Color(46, 220, 119);

    private static final String COUNTRY_NAME = "Flag of Ukraine";


    /*
    * build the flag
    * */
    @Override
    public void run() {
        buildFlag();
        printName();
    }
    /*
    * The flag constructor.
    * */
    private void buildFlag() {
        buildFlagPart(0, COLOR_ONE);
        buildFlagPart(1, COLOR_TWO);
        //buildFlagPart(2, COLOR_THREE);
    }
    /**
    * Flag parts builder.
    * @param part - The specific rectangle part in flag structure, start from 0
    * @param lineColor - The specific color of the flag rectangle part
    * */
    private void buildFlagPart(int part, Color lineColor) {
        if(lineColor == null){
            return;
        }

        double marginX = (getWidth() - FLAG_WIDTH) /2;
        double marginY = (getHeight() - FLAG_HEIGHT) /2;

        /*flagPartLine - parameter to margin lines from each-others "down" if FLAG_LINES_IS_HORIZONTAL,
        * or margin "left" if flag have vertical structure.
        * */
        double flagPartLine;
        GRect rect;

        if(FLAG_LINES_IS_HORIZONTAL) {
            flagPartLine = FLAG_HEIGHT / FLAG_PARTS; // Y flag parts margin
            rect = buildRect(marginX, marginY + part * flagPartLine, FLAG_WIDTH, flagPartLine); // vertical flag lines
        } else {
            flagPartLine = FLAG_WIDTH / FLAG_PARTS; // x flag parts margin
            rect = buildRect(marginX + part * flagPartLine, marginY, flagPartLine, FLAG_HEIGHT); //horizontal flag lines
        }
        rect.setFillColor(lineColor);
        add(rect);
    }


    /** Build rect
     * @param x - The object margin x, starts from the left(0) and ends at the right side of the window(FLAG_WIDTH)
     * @param y - The object margin y, starts from the top(0) end at the bottom of the window (FLAG_HEIGHT)
    * */
    private GRect buildRect(double x, double y, double rectWidth, double rectHeight){
        GRect rect = new GRect(x,y,rectWidth,rectHeight);
        rect.setFilled(true);
        rect.setFillColor(Color.BLACK); //color by default
        rect.setColor(Color.BLACK);
        return rect;
    }

    /*
    * positing name of country at bottom right corner and print it
    * */
    private void printName() {
        GLabel label = printLabel(COUNTRY_NAME);

        double x = getWidth() - label.getWidth();
        double y = getHeight() - label.getDescent();

        add(label, x, y);
    }
    /*
    * create name of the country
    * */
    private GLabel printLabel(String countryName) {
        GLabel label = new GLabel(countryName);
        label.setFont("Monospaced-24-BOLD");
        label.setVisible(true);
        label.setColor(Color.BLACK);
        return label;
    }
}

