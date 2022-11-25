package E02;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String newSymbol, String newName){
        name = newName;
        symbol = newSymbol;
    }
    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;
        return (change / previousClosingPrice) * 100;
    }
}
