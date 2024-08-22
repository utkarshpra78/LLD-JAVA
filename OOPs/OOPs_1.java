package OOPs;

public class OOPs_1 {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball-pen";

        pen1.printColour();
        pen2.printColour();

    }
}



class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void printColour(){
        System.out.println(this.color);
    }
}


