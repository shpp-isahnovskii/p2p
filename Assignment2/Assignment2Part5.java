package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;
/* File: Assignment2Part5
 * SECOND ILLUSION
 * ------------------------------------------
 * This program is build illusion from black squares which are in grid form.
 * */
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Assignment2Part5 extends WindowProgram{
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 60;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;


    /*
    * build illusion figure
    * */
    @Override
    public void run(){
        buildIllusionGrid();
    }

    /*
    * Builder for illusion. Create a boxes grid from constant parameters
    * */
    private void buildIllusionGrid() {

        double marginLeft = (getWidth() - (BOX_SIZE + BOX_SPACING) * NUM_ROWS) / 2;
        double marginTop = (getHeight() - (BOX_SIZE + BOX_SPACING) * NUM_COLS) / 2;

        for(int i = 0; i < NUM_COLS; i++){
            for(int j = 0; j < NUM_ROWS; j++){
                printBox(marginLeft + j * (BOX_SPACING + BOX_SIZE),
                        marginTop + i * (BOX_SPACING + BOX_SIZE),
                          BOX_SIZE);
            }
        }
    }
    /** Build rect
     * @param x - The object margin x, starts from the left(0) and ends at the right side of the window
     * @param y - The object margin y, starts from the top(0) end at the bottom of the window
     * */
    private void printBox(double x, double y, double boxSize) {
        GRect rect = new GRect(x, y, boxSize, boxSize);
        rect.setFillColor(Color.BLACK);
        rect.setFilled(true);
        add(rect);
    }
}
