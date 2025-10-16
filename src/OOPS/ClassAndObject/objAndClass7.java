package OOPS.ClassAndObject;
class Login{
    String username;
    String password;

    void login(){
        System.out.println("Login Success with : username " + username + " , Password " + password);
    }

    void forgetPassword(){
        System.out.println("Recovery link shared to Email : " + username);
    }
}
public class objAndClass7 {
    public static void main(String[] args) {
        Login l1 = new Login();
        l1.username = "Deeksha";
        l1.password = "Deeksha123";
        l1.login();
        System.out.println("-------------------------------------");
        Login l2 = new Login();
        l2.username = "Diksha";
        l2.forgetPassword();
    }
}
