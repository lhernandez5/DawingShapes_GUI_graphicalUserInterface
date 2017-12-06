/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * This is the class for line drawing
 *
 * @author luzhernandez
 */
public class Line extends Shape {

    private int startX; //The top left X coordinate
    private int startY; //The top left Y coordinate
    private int endX;   //The bottom right X coordinate
    private int endY;   //The bottom right Y coordinate
    private Color lineColor;    //Color for line

    /**
     *This is the class for line drawing
     * 
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param endX The bottom right X coordinate
     * @param endY The bottom right Y coordinate
     * @param lineColor Color for line
     */
    public Line(int startX, int startY, int endX, int endY, Color lineColor) {
        // draw solid line first
        super(startX, startY, endX, endY, lineColor);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.lineColor = lineColor;
    }

    /**
     * Draws the line
     *
     * @param g2d The graphics context needed for drawing
     */
    @Override
    public void draw(Graphics2D g2d) {
        //draws the solid line
        g2d.setColor(lineColor);    
        g2d.drawLine(startX, startY, endX, endY);
    }

    /**
     * This static method is used to draw a line without creating a line object
     * It is used while the user is dragging the mouse, in order to show the
     * line in real-time
     *
     * @param g2d The graphics context needed for drawing
     * @param x1 int x coordinate at one end
     * @param y1 int y coordinate at one end
     * @param x2 int x coordinate at the other end
     * @param y2 int y coordinate at the other end
     * @param color Color for line
     */
    public static void draw(Graphics2D g2d, int x1, int y1, int x2, int y2, Color color) {
        //draws the solid line
        g2d.setColor(color);
        g2d.drawLine(x1, y1, x2, y2);
    }
}
