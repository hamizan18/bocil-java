public class doWhile {
    public static void main(String[] args){
        int i = 0; int percobaan = 0;
        
        while (i < 100){
            int angkaRandom = (int)(Math.random() * 6) + 1;
            percobaan++;
            if (angkaRandom != 6){
                System.out.println("Dadu yang dilempar: " + angkaRandom);
            } else {
                System.out.println("Dadu yang dilempar: " + angkaRandom);
                System.out.println("Berhasil menampilkan angka 6!");
                System.out.println("Percobaan dilakukan sebanyak: " + percobaan);
                return;
            }
            i++;
        }
    }
}
