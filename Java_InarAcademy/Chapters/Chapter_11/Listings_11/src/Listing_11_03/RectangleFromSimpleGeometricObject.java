package Listing_11_03;

import Listing_11_01.SimpleGeometricObject;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(){
    }

    public RectangleFromSimpleGeometricObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return  2 * (width + height);
    }

    public void setWidth(double width){
       this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
}
