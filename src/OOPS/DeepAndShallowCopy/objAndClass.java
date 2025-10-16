package OOPS.DeepAndShallowCopy;
class Laptop{
    String wallpaper = "alia.jpeg";
}
public class objAndClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = l1;
        System.out.println(l1.wallpaper);
        System.out.println(l2.wallpaper);
        l2.wallpaper = "Kiara.jpeg";
        System.out.println(l1.wallpaper);
        System.out.println(l2.wallpaper);
    }
}
