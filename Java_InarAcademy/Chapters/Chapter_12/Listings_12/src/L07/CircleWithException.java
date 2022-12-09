package L07;

public class CircleWithException {
    private double radius;
    private int numberOfObjects = 0;

    public CircleWithException() {
        this(1);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius Cannot be Negative!");
        }
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
    public String toString(){
        return "Radius: " + getRadius() + "\nArea: " + findArea();
    }
}



