package solid_principle;

public class interface_segment_1 {
    
}

/*
 interface should be such that client should implement unncessary function they do not need
 */

interface WaiterInterafce{
    void serverCustomer();
    void takeOrder();
}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}

class waiter implements WaiterInterafce{ 

    public void serverCustomer(){
        System.out.println("server to customer");
    }

    public void takeOrder(){
        System.out.println("take order");
    }
}