package OOPS.Constructor;

class Delta{
    int num;
    void play(){
        System.out.println("Excuting Play()...");
    }
    Delta(){
        System.out.println("Delta() constructor");
        num = 25;
    }
}
public class UserDefineConst {
    public static void main(String[] args) {
        Delta del = new Delta();
        System.out.println(del.num);
        del.play();
    }
}
