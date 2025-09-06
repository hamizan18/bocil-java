import java.util.Scanner;

public class gradeConverter {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan nilai untuk di convert: ");
            int nilaiAwal = input.nextInt();

            if (nilaiAwal >= 90 && nilaiAwal <= 100){
                System.out.println("A");
            } else if (nilaiAwal >= 80 && nilaiAwal < 90){
                System.out.println("B");
            } else if (nilaiAwal >= 70 && nilaiAwal < 80){
                System.out.println("C");
            } else if (nilaiAwal >= 60 && nilaiAwal < 70){
                System.out.println("D");
            } else if (nilaiAwal < 60){
                System.out.println("E");
            } else {
                System.out.println("Tidak valid");
            }
        }
    }
}
