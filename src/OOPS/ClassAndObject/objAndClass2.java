package OOPS.ClassAndObject;

class Employee{
    int eid;
    double ctc;
    void work(){
        System.out.println("Working...");
    }
}

public class objAndClass2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.eid = 123;
        System.out.println(emp1.eid);
        emp1.ctc = 4.5;
        System.out.println(emp1.ctc);
        emp1.work();
        System.out.println("-------------------------------");
        Employee emp2 = new Employee();
        emp2.eid = 456;
        System.out.println(emp2.eid);
        emp2.ctc = 5.5;
        System.out.println(emp2.ctc);
        emp2.work();
        System.out.println("-------------------------------");
        Employee emp3 = new Employee();
        emp3.eid = 789;
        System.out.println(emp3.eid);
        emp3.ctc = 6.5;
        System.out.println(emp3.ctc);
        emp3.work();

    }
}
