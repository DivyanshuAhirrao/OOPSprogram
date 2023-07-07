package operation;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Zoo z1 = new Zoo();

        System.out.println("Enter the Bird name..");
        String b1 = sc.next();
        z1.peacock(b1);
        System.out.println("-----------------------------------------");
        System.out.println("Enter the Bird name..");
        String b2 = sc.next();
        z1.Owl(b2);
        System.out.println("-----------------------------------------");

        z1.tiger();
        System.out.println("-----------------------------------------");
        z1.elephant();
        System.out.println("-----------------------------------------");
        z1.peacock();
        System.out.println();
        System.out.println("========x========x=========x========x=======x=======");
    }
}
