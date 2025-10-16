package OOPS.ClassAndObject;

class Mobile{
    String model;
    double price;
    void call(){
        System.out.println("Calling");
    }
    void message(){
        System.out.println("Message...");
    }
}

public class objAndClass4 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.model = "Iphone16ProMax";
        System.out.println(m1.model);
        m1.price = 1.5;
        System.out.println(m1.price);
        m1.call();
        m1.message();
        System.out.println("------------------------------");
        Mobile m2 = new Mobile();
        m2.model = "SamsungS25UltraProMax";
        System.out.println(m2.model);
        m2.price = 2.0;
        System.out.println(m2.price);
        m2.call();
        m2.message();
    }
}
