/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * This is the class for triangle drawing
 * 
 * @author luzhernandez
 */
public class Triangle extends Shape {

    private int width;  //width of triangle    
    private int startX; //The top left X coordinate
    private int startY; //The top left Y coordinate
    private int endX;   //The bottom right X coordinate
    private int endY;   //The bottom right Y coordinate
    private Color lineColor;    //line color
    private Color fillColor;    //fill color

    /**
     * This is the class for triangle drawing
     * 
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param endX The bottom right X coordinate
     * @param endY The bottom right Y coordinate
     * @param lineColor Color for line
     * @param fillColor Fill Color
     */
    public Triangle(int startX, int startY, int endX, int endY, Color lineColor, Color fillColor) {
         // draw solid triangle first
        super(startX, startY, endX, endY, lineColor);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
 
    }

    /**
     * This is the class for triangle drawing
     * 
     * @param g2d The graphics context needed for drawing
     */
    @Override
    public void draw(Graphics2D g2d) {
        // draw solid triangle first
        g2d.setColor(fillColor);
        g2d.fillPolygon(new int[] {startX, Math.abs(startX + (width/2)), endX}, new int[] {startY, endY, startY}, 3);
        
        // draw outline triangle on top
        g2d.setColor(lineColor);
        g2d.drawPolygon(new int[] {startX, Math.abs(startX + (width/2)), endX}, new int[] {startY, endY, startY}, 3);
    }

    /**
     * This static method is used to draw a triangle before an actual triangle
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
        // draw solid triangle first
        g2d.setColor(fc);
        g2d.fillPolygon(new int[] {x1, Math.abs(x1 + ((x2-x1)/2)), x2}, new int[] {y1, y2, y1}, 3);
        
        // draw outline on top
        g2d.setColor(lc);
        g2d.drawPolygon(new int[] {x1, Math.abs(x1 + ((x2-x1)/2)), x2}, new int[] {y1, y2, y1}, 3);
    }
}
