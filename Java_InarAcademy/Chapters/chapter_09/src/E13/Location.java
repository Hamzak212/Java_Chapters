package E13;

public class Location {
    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public double getMaxValue(){
        return maxValue;
    }

    public int getRow(){
        return row;
    }

    public int getColumn() {
        return column;
    }
    public String toString(){
        String output;
        output = "The location of the largest element is " +
                getMaxValue() + " at (" + getRow() + ", " +
                getColumn() + ")";

        return output;

    }
}
