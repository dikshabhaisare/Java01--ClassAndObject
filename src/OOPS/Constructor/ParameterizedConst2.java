package OOPS.Constructor;
class Employee{
    int eid;
    double ctc;
    Employee(int i, double d){
        eid = i;
        ctc = d;
    }
}
public class ParameterizedConst2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(104, 10.5);
        System.out.println("Eid : " + e1.eid);
        System.out.println("Ctc : " + e1.ctc);
        Employee e2 = new Employee(102,12.5);
        System.out.println("Eid : " + e2.eid);
        System.out.println("Ctc : " + e2.ctc);
    }
}
