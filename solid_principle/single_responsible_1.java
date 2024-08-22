package solid_principle;

public class single_responsible_1 {
    
}



/*

Avoid duplicates
easy to maintain
easy to understand
flexible software
reduce complexity

*/

// A class should have only one reason to change

class Marker{
    String name;
    String colour;
    int year;
    int price;

    public Marker(String name,String colour,int year,int price){
        this.name=name;
        this.colour=colour;
        this.year=year;
        this.price=price;
    }
}



class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int CalculateTotal(){
        int price=((marker.price)*quantity);
        return price;
    } 
}

class InvoiceDao{
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDb(){
        //save in to DB
    }
}

class InvoicePrinter{
    Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    
    public void print(){
        //print the DB
    }
}
