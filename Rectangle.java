/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * This is the class for rectangle drawing
 * 
 * @author luzhernandez
 */
public class Rectangle extends Shape {

    private int topLeftX;   //The top left X coordinate
    private int topLeftY;   //The top left Y coordinate
    private int width;  //width of the rectangle
    private int height; //height of rectangle
    private Color fillColor;    //Fill color

    /**
     * This is the class for rectangle drawing
     * 
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param endX The bottom right X coordinate
     * @param endY The bottom right Y coordinate
     * @param lineColor Color for line
     * @param fillColor Fill Color
     */
    public Rectangle(int startX, int startY, int endX, int endY, Color lineColor, Color fillColor) {
        // draw solid rectangle first
        super(startX, startY, endX, endY, lineColor);
        this.fillColor = fillColor;
        topLeftX = Math.min(startX, endX);
        topLeftY = Math.min(startY, endY);
        
        //width is calculated with the x coordinates
        width = Math.abs(startX - endX);
        //height is calculated with the y coordinates
        height = Math.abs(startY - endY);
    }

    /**
     * Draws the rectangle
     *
     * @param g2d The graphics context needed for drawing
     */
    @Override
    public void draw(Graphics2D g2d) {
        // draw solid rectangle first
        g2d.setColor(fillColor);
        g2d.fillRect(topLeftX, topLeftY, width, height);
        
        // draw outline rectangle on top
        g2d.setColor(getLineColor());
        g2d.drawRect(topLeftX, topLeftY, width, height);
    }

    /**
     * This static method is used to draw a rectangle before an actual rectangle
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
        // draw solid rectangle first
        g2d.setColor(fc);
        g2d.fillRect(
                Math.min(x1, x2),
                Math.min(y1, y2),
                Math.abs(x1 - x2),
                Math.abs(y1 - y2));
        
        // draw outline on top
        g2d.setColor(lc);
        g2d.drawRect(
                Math.min(x1, x2),
                Math.min(y1, y2),
                Math.abs(x1 - x2),
                Math.abs(y1 - y2));

    }
}
