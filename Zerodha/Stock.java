public class Stock {
    private final String symbol;
    private final String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        System.out.println("stock created with symbol "+symbol);
    }

    public synchronized void updatePrice(double price){
        this.price=price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
