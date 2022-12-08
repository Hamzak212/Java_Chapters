package Listing_11_02;

import Listing_11_01.SimpleGeometricObject;

import javax.print.attribute.standard.PresentationDirection;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject(){
    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The Circle Was Created " + getDateCreated() + " and the radius is " + radius);
    }
}
