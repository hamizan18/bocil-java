import java.util.Scanner;

public class elif {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan jumlah hp: ");
            int hp = input.nextInt();

            if (hp > 70 && hp <= 100){
                System.out.println("Hero sehat!");
            } else if (hp > 30 && hp <= 70){
                System.out.println("Hero mulai lemah..");
            } else if (hp <= 30){
                System.out.println("Hero kritis!");
            } else {
                System.out.println("Tidak valid");
            }
        }
    }
}
