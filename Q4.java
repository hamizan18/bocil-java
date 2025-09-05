import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)){

            System.out.print("Nama: ");
            String name = in.nextLine();

            System.out.print("Usia: ");
            int usia = in.nextInt();

            System.out.print("Tinggi: ");
            double tinggi = in.nextDouble();

            System.out.print("Student (true/false): ");
            boolean stat = in.nextBoolean();

            System.out.print("Nama: " + name + ", Usia: " + usia + " Tahun, Tinggi: " + tinggi + "cm, Student: " + stat);
        }
    }
}
