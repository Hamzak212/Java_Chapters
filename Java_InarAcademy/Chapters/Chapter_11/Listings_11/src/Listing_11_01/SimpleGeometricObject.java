package Listing_11_01;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Created on: " + dateCreated + "\nColor is: " + color + " and filled " + filled;
    }
}
