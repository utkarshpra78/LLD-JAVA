public class BuyOrder extends Order{

    public BuyOrder(String orderId, Account account, Stock stock, int quantity, double price){
        super(orderId,account,stock,quantity,price);
    }

    @Override
    public void execute() {
        double totalCost=quantity*price;
        if(account.getBalance()>=totalCost){
            account.withdrawFund(totalCost);
            status=OrderStatus.EXECUTED;
            account.getPortfolio().addStock(stock,quantity);
            System.out.println("order executed ");
        }else{
            status=OrderStatus.REJECTED;
            System.out.println("order rejected due to insufficient fund ");
        }
    }
}
