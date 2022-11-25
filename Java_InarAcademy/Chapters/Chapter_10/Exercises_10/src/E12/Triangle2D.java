package E12;

import E04.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(){
        this(new MyPoint(0,0),new MyPoint(1,1),new MyPoint(2,5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP1(MyPoint p1){
        this.p1 = p1;
    }

    public void setP2(MyPoint p2){
        this.p2 = p2;
    }

    public void setP3(MyPoint p3){
        this.p3 = p3;
    }

    public MyPoint getP1(){
        return p1;
    }

    public MyPoint p2(){
        return p2;
    }

    public MyPoint p3(){
        return p3;
    }



}
