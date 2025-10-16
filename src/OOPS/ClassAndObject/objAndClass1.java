package OOPS.ClassAndObject;

 class student {
    String name;
    double cgpa;
    void study(){
        System.out.println("Studying...");
    }
    void write(){
        System.out.println("Writing...");
    }
}

public class objAndClass1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Deeksha";
        System.out.println(s1.name);
        s1.cgpa = 9.2;
        System.out.println(s1.cgpa);
        s1.study();
        s1.write();
        System.out.println("-------------------------");
        student s2 = new student();
        s2.name = "Vinni";
        System.out.println(s1.name);
        s2.cgpa = 9.8;
        System.out.println(s1.cgpa);
        s2.study();
        s2.write();
    }
}