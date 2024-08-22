package solid_principle;

public class open_closed_1 {
    
}



//open for extension but closed for modification



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


class InvoicePrinter{
    Invoice invoice;
    
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    
    public void print(){
        //print the DB
    }
}

//_________________________________________________________________

interface InvoiceDao{
    public void save(Invoice invoice);
}

class DataBaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice){
        //save to DB
    }
}

class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice){
        //save to file
    }
}
