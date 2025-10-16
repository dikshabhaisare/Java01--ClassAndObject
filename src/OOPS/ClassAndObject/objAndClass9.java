package OOPS.ClassAndObject;

class Bottle{
    int capacity;

    void fill(){
        System.out.println("Filling...");
    }
    void clean(){
        System.out.println("Clean...");
    }
}

public class objAndClass9 {
    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        b1.capacity = 2;
        System.out.println(b1.capacity);
        b1.fill();
        b1.clean();
        System.out.println("------------------------");
        Bottle b2 = new Bottle();
        b2.capacity = 4;
        System.out.println(b2.capacity);
        b2.fill();
        b2.clean();
    }
}
