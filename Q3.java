import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)){

            System.out.print("Hero name: ");
            String hero = in.nextLine();

            int level = 1;
            double hp = 99.5;
            boolean ready = true;

            System.out.println("Hero: " + hero + " | Hero Level: " + level + " | HP: " + hp + "| Status: " + ready);

            System.out.println("\n=== Side Quest ===");
            int a = 10; int b = 3;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a + (double)b);
            System.out.println(a % b);

            int x = 5; x += 3; x *= 2;

            System.out.println(x);

        }
    }
}