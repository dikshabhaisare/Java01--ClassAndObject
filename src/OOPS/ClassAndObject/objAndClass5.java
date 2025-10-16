package OOPS.ClassAndObject;

class Bike {
    int cc;
    double mileage;
    void drive(){
        System.out.println("Driving...");
    }
}
public class objAndClass5 {
    public static void main(String[] args) {
        Bike ktm = new Bike();
        ktm.cc = 390;
        System.out.println(ktm.cc);
        ktm.mileage = 14.0;
        System.out.println(ktm.mileage);
        ktm.drive();
        System.out.println("----------------------------");
        Bike re = new Bike();
        re.cc = 650;
        System.out.println(re.cc);
        re.mileage = 16.0;
        System.out.println(re.mileage);
        re.drive();
        System.out.println("---------------------------");
        Bike sp = new Bike();
        sp.cc = 100;
        System.out.println(sp.cc);
        sp.mileage = 60.0;
        System.out.println(sp.mileage);
        sp.drive();
    }
}
