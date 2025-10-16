package OOPS.ClassAndObject;
class Account {
    long accNum;
    double accBal;
    void withdraw(double amt){
        accBal = accBal - amt;
        System.out.println("Withdraw from " + accNum + " Balance " + accBal);
    }
    void deposit(double amt){
        accBal = accBal + amt;
        System.out.println("Deposit to " + accNum + " Balance " + accBal);
    }
}
public class objAndClass6 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.accNum = 3239847984927982743l;
        a1.accBal = 25000.0;
        System.out.println("Account Balance " + a1.accBal);
        a1.withdraw(300.0);
        a1.deposit(5000.0);
        System.out.println("---------------------------------");
        Account a2 = new Account();
        a2.accNum = 344789379836439643l;
        a2.accBal = 40000.0;
        System.out.println("Account Balance " + a2.accBal);
        a2.withdraw(10000.0);
        a2.deposit(5000.0);
    }
}
