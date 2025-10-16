package OOPS.ClassAndObject;

class Player{
    String name;
    int jerseyNumber;
    void play(){
        System.out.println("Playing...");
    }
}

public class objAndClass3 {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Subhman Gill";
        System.out.println(p1.name);
        p1.jerseyNumber = 14;
        System.out.println(p1.jerseyNumber);
        p1.play();
    }
}
