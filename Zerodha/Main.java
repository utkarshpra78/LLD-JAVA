public class Main {
    public static void main(String[] args) {
        StockBroker stockBroker=StockBroker.getInstance();

        User user1=new User("U001","utkarsh","utkarsh@gmail.com");
        stockBroker.createAccount(user1,10000);
        Account account1=stockBroker.getAccount("A001");

        Stock stock1=new Stock("PCJ","pc jwellers",15.23);
        Stock stock2=new Stock("IRFC","indian railway financial corporation",144);

        stockBroker.addStock(stock1);
        stockBroker.addStock(stock2);

        Order buyOrder1=new BuyOrder("O001",account1,stock1,60,15.23);
        Order buyOrder2=new BuyOrder("O002",account1,stock2,20,144);
        stockBroker.placeOrder(buyOrder1);
        stockBroker.placeOrder(buyOrder2);

        Order sellOrder1=new SellOrder("S001",account1,stock1,20,160);
        stockBroker.placeOrder(sellOrder1);

        System.out.println("Account balance is "+ account1.getBalance());
        System.out.println("portfolio "+ account1.getPortfolio().getHoldings());


        System.out.println("Hello, World!");
    }
}