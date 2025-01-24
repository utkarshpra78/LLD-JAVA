public class SellOrder extends Order{

    public SellOrder(String orderId, Account account, Stock stock, int quantity, double price){
        super(orderId,account,stock,quantity,price);
    }

    @Override
    public void execute() {
        double totalCost=quantity*price;
        status=OrderStatus.EXECUTED;
        account.addFund(totalCost);
        account.getPortfolio().removeStock(stock,quantity);
    }
}
