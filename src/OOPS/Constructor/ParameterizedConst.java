
package OOPS.Constructor;
class Container{
    int capacity;
    Container(int arg){
        capacity = arg;
    }
}
public class ParameterizedConst {
    public static void main(String[] args) {
        Container c1 = new Container(500);
        System.out.println(c1.capacity);
        System.out.println("-----------------------");
        Container c2 = new Container(2500);
        System.out.println(c2.capacity);
        System.out.println("-----------------------");
        Container c3 = new Container(1200);
        System.out.println(c3.capacity);
    }
}
