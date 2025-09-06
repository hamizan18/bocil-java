import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            
            System.out.print("Masukkan angka n: ");
            int n = input.nextInt();

            if (n % 2 == 0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
