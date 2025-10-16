package OOPS.ClassAndObject;
class Players{
    String name = "Kohli";
}
public class objAndClass10 {
    public static void main(String[] args) {
        Players p1 = new Players();
        Players p2 = new Players();
        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.name = "Rohit";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}


