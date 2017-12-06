/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * This is the superclass Shape class that will be extended for all shapes
 * 
 * @author luzhernandez
 */
public abstract class Shape {

    private int startX; //The top left X coordinate
    private int startY; //The top left Y coordinate
    private int endX;   //The bottom right X coordinate
    private int endY;   //The bottom right Y coordinate
    private Color lineColor;

    /**
     * Constructor to build a shape
     * 
     * @param startX The top left X coordinate
     * @param startY The top left Y coordinate
     * @param endX The bottom right X coordinate
     * @param endY The bottom right Y coordinate
     * @param lineColor color of line
     */
    public Shape(int startX, int startY, int endX, int endY, Color lineColor) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.lineColor = lineColor;
    }

    /**
     * Abstract method for drawing
     * 
     * @param g2d The graphics context needed for drawing 
     */
    public abstract void draw(Graphics2D g2d);

    /**
     * Gets the top left X coordinate
     * 
     * @return int top left X coordinate
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Sets the top left X coordinate
     * 
     * @param startX int top left X coordinate
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Gets the top left X coordinate
     * 
     * @return int top left Y coordinate
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Sets the top left Y coordinate
     * 
     * @param startY int top left Y coordinate
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Get bottom right X coordinate
     * 
     * @return int bottom right X coordinate
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Sets the bottom right X coordinate
     * 
     * @param endX int bottom right X coordinate
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Get the bottom right Y coordinate
     * 
     * @return int bottom right Y coordinate
     */
    public int getEndY() {
        return endY;
    }

    
    /**
     * Set the bottom right Y coordinate
     * 
     * @param endY int bottom right Y coordinate
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Get the color of the line
     * 
     * @return color of the line
     */
    public Color getLineColor() {
        return lineColor;
    }

}
