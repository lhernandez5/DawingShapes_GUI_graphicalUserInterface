/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * This is the class for oval drawing
 * 
 * @author luzhernandez
 */
public class Oval extends Shape {

    private int width;
    private int height;
    private Color fillColor;

    /**
     * This is the class for oval drawing
     * 
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param endX The bottom right X coordinate
     * @param endY The bottom right Y coordinate
     * @param lineColor Color for line
     * @param fillColor Fill Color
     */
    public Oval(int startX, int startY, int endX, int endY, Color lineColor, Color fillColor) {
        // draw solid oval first
        super(startX, startY, endX, endY, lineColor);
        this.fillColor = fillColor;
        
        //width is calculated with the x coordinates
        width = Math.abs(endX - startX);
        //height is calculated with the y coordinates
        height = Math.abs(endY - startY);
    }

    /**
     * Draws the oval 
     * 
     * @param g2d The graphics context needed for drawing
     */
   
    @Override
    public void draw(Graphics2D g2d) {
        // draw solid oval first
        g2d.setColor(fillColor);
        g2d.fillOval(getStartX(), getStartY(), width, height);
        
        // draw outline oval on top
        g2d.setColor(getLineColor());
        g2d.drawOval(getStartX(), getStartY(), width, height);
    }

    /**
     * This static method is used to draw an oval before an actual oval
     * object is created It is used to give the user interactive feedback as
     * they are dragging the cursor
     * 
     * @param g2d The graphics context needed for drawing
     * @param x1 int x coordinate from where mouse pressed down
     * @param y1 int y coordinate from where mouse pressed down
     * @param x2 int x coordinate from where mouse released
     * @param y2 int y coordinate from where mouse released
     * @param lc Color for line color
     * @param fc Color for fill color
     */
    public static void draw(Graphics2D g2d, int x1, int y1, int x2, int y2, Color lc, Color fc) {
        // draw solid oval first
        g2d.setColor(fc);
        g2d.fillOval(
                Math.min(x1, x2),
                Math.min(y1, y2),
                Math.abs(x2 - x1),
                Math.abs(y2 - y1));
        
        // draw outline on top
        g2d.setColor(lc);
        g2d.drawOval(
                Math.min(x1, x2),
                Math.min(y1, y2),
                Math.abs(x2 - x1),
                Math.abs(y2 - y1));
    }

}
