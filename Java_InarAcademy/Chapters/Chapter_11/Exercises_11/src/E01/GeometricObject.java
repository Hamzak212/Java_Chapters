package E01;
import java.util.*;


public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this("Black", false);
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return ("Created on : " + dateCreated + "\nColor is : " + color + "\nIs Filled = " + filled );
    }


    public void setFilled(Boolean filled){
        this.filled = filled;
    }

}
