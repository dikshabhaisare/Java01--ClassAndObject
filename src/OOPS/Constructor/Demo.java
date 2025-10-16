package OOPS.Constructor;

public class Demo {
    int val = 10;
    void test(){
        System.out.println("Executing Test....");
    }
    public static void main(String[] args) {
      Demo ref = new Demo();
        System.out.println(ref.val);
        ref.test();
    }
}
