import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        double r;
        double a;
        double formul;

        System.out.print("Yarıçapını Giriniz: ");
        r = scanner.nextDouble();
        System.out.print("Merkez Açısını Giriniz: ");
        a = scanner.nextDouble();
        formul = (pi*(r*r)*a)/360;
        System.out.println(formul);
    }
}
