package com.shpp.p2p.cs.ISakhnovskyi.Assignment2;
/* File: Flag
 * ------------------------------------------
 * This program is a flag builder.
 * Constants are regulating flag parameters.
 * */
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Flag extends WindowProgram {
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;
    private static final double FLAG_WIDTH = 350;
    private static final double FLAG_HEIGHT = 350;
    private static final int FLAG_PARTS = 3;
    private static final boolean FLAG_VERTICAL_LINES = true;
    private static final String COUNTRY_NAME = "Ukraine";



    public void run() {
        buildFlag();
    }

    private void buildFlag() {
        for(int i = 0; i < FLAG_PARTS; i++) {
                BuildFlagPart(i);
        }
    }

    private void BuildFlagPart(int iFlagPart) {

        double flagOnePartSize = FLAG_WIDTH / FLAG_PARTS;

        buildRect(margin() + iFlagPart * flagOnePartSize, margin(),
                FLAG_WIDTH / FLAG_PARTS, FLAG_HEIGHT / FLAG_PARTS);
    }

    private double margin() {
        double margin = 0;
        if (!FLAG_VERTICAL_LINES) {
            margin = (getWidth() - FLAG_WIDTH) / 2;
        } else{
            margin = (getHeight() - FLAG_HEIGHT) / 2;
        }
        return margin;
    }

    /** Build some rect.
     * @param x - The object margin x starts from the left(0) and ends at the right side of the window(FLAG_WIDTH)
     * @param y - The object margin y starts from the top(0) end at the bottom of the window (FLAG_HEIGHT)
    * */
    private void buildRect(double x, double y, double rectWidth, double rectHeight){
        GRect rect = new GRect(x,y,rectWidth,rectHeight);
        rect.setFilled(true);
        rect.setFillColor(Color.GREEN);
        rect.setColor(Color.BLACK);
        add(rect);
    }







}

