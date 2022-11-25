package E08;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
     speed = SLOW;
     on = false;
     radius = 5;
     color = "blue";
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public double getRadius(){
        return radius;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        String description;
        if(getOn()){
            description = "Fan Speed: " + getSpeed() + "\nColor is: " + getColor() + "\nRadius is " + getRadius();
        }else{
            description = "Fan is Off" + "\nFan color: " + getColor() + "\nRadius is: " + getRadius();
        }
        return description;
    }
}
