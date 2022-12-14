package E09;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n = 3;
        side = 1;
    }
    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public void setN(int n){
        this.n = n;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getPerimeter(){
        return getSide() * getN();
    }
    public double getArea(){
        double area = (getN() * Math.pow(getSide(), 2)) /
                (4 * Math.tan(Math.PI / getN()));
        return area;
    }
}
