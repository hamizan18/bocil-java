import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
        
            System.out.print("Nama kamu? ");
            String name = in.nextLine();
            
            System.out.println("Haloo, " + name);
            
            System.out.print("Angka fav? ");
            int fav = in.nextInt();

            System.out.println("Angka favoritmu x2 adalah " + fav * 2 );
        }
    }
}
