public class Account {
    private final String id;
    private final User user;
    private double balance;
    private final Portfolio portfolio;


    public Account(String id, User user, double balance) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.portfolio=new Portfolio(this);
    }

    public void addFund(double amount){
        balance=balance+amount;
    }

    public synchronized void withdrawFund(double amount){
        if(amount>balance){
            System.out.println("insufficient fund");
        }else{
            System.out.println("fund executed");
            balance=balance-amount;
        }
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}
