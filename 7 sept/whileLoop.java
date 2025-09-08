public class whileLoop {
    public static void main(String[] args){
        int i = 10;

        while (i >= 1){
            System.out.print(i + " ");
            i--;
        }

        System.out.print("\n");

        int hp = 100;
        while (hp > 0){
            int angkaRandom = (int)(Math.random() * 11) + 1;
            hp -= angkaRandom;
            System.out.println("HP tersisa: " + hp);
            if (hp < 0) hp = 0;
        }
    }
}
