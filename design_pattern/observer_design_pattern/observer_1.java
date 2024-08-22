package design_pattern.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class observer_1 {
    public static void main(String[] args) {
      StockObservable iphoneStockObservable =  new IphoneObservable();
      NotificationAlertObserver observer1 = new EmailAlertObserverImpl("up7856@gmail.com", iphoneStockObservable);
      NotificationAlertObserver observer2 = new EmailAlertObserverImpl("upp7856@gmail.com", iphoneStockObservable);

      iphoneStockObservable.add(observer1);
      iphoneStockObservable.add(observer2);

      iphoneStockObservable.setStockCount(10);
    }
}

/*
  it has two class OBSERVABLE and OBSERVER when there is state change in OBSERVABLE it notify the OBSERVER
 */
interface NotificationAlertObserver{
  public void update();
}

class EmailAlertObserverImpl implements NotificationAlertObserver{
  String emailId;
  StockObservable observable;

  public EmailAlertObserverImpl(String emailId,StockObservable observable){
    this.emailId=emailId;
    this.observable=observable;
  }

  @Override
  public void update(){
    sendMail(emailId,"product is ready hurry up");
  }

  private void sendMail(String mailId,String msg){
    System.out.println("mail sent to "+mailId);
  }
}

interface StockObservable{
  public void add(NotificationAlertObserver observer);
  public void remove(NotificationAlertObserver observer);
  public void notifySubscriber();
  public void setStockCount(int newStockAdded);
  public int getStockCount();
}

class IphoneObservable implements StockObservable{
  public List<NotificationAlertObserver> observerList = new ArrayList<>();
  public int stockCount=0;

  @Override
  public void add(NotificationAlertObserver observer){
    observerList.add(observer);
  }

  @Override
  public void remove(NotificationAlertObserver observer){
    observerList.remove(observer);
  }

  @Override

  public void notifySubscriber(){
    for(NotificationAlertObserver obs:observerList){
      obs.update();
    }
  }

  public void setStockCount(int newStockAdded){
    if(stockCount==0){
      notifySubscriber();
    }
    stockCount = stockCount+newStockAdded;
  }

  public int getStockCount(){
    return stockCount;
  }
}