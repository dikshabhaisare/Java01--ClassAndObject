package OOPS.ClassAndObject;
class Email{
    String from;
    String to;

    void compose(){
        System.out.println("Composing the Mail to send to : " + to);
    }
    void readMail(){
        System.out.println("Reading the mail send by : " + from);
    }
}
public class objAndClass8 {
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.from = "deekshabhaisare10@gmail.com";
        e1.to = "vartikabhaisare24@gmail.com";
        e1.compose();
        e1.readMail();
    }
}
