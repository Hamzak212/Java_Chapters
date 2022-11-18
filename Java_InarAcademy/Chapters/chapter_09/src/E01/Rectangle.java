package E01;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(){
        height = 1;
        width = 1;
    }
    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
