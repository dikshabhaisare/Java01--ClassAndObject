package OOPS.Constructor;
class Example{
    int a;
    char b;
    double c;

    Example(){
        a = 10;
        b = 'D';
        c = 10.0;
    }
}
public class DefaultConst2 {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.a);
        System.out.println(ex.b);
        System.out.println(ex.c);
    }
}
