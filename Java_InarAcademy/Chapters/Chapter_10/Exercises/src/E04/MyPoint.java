package E04;

import E03.MyInteger;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0,0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(double x, double y){
        int pX = (int) (Math.pow(getX() - x, 2));
        int pY = (int) (Math.pow(getY() - y, 2));

        return Math.sqrt(pX + pY);
    }

    public double distance(MyPoint point) {
        int pX = (int) (Math.pow(getX() - point.getX(), 2));
        int pY = (int) (Math.pow(getY() - point.getY(), 2));

        return Math.sqrt(pX + pY);
    }
}