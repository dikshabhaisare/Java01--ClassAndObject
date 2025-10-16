package OOPS.Constructor;
class Product{
    int pid;
    double price;
    double rating;

    Product(int pid, double price, double rating){
        this.pid = pid;
        this.price = price;
        this.rating = rating;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Product p = new Product(2245,4500.0,4.2);
        System.out.println("Pid : " + p.pid);
        System.out.println("Price : " + p.price);
        System.out.println("Rating : " + p.rating);
    }
}


