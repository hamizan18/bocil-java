import java.util.Scanner;

public class miniQuest {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int hp = 100;
            int enemyHp = 50;
            int choice = 0;
            
            while (hp > 0 && enemyHp > 0){
                int damageRandom = (int)(Math.random() * 11) + 1;
                int healing = (int)(Math.random() * 5) + 1;

                System.out.print("1. Attack\n2. Heal\n3. Run\nChoose your action: ");
                choice = input.nextInt();

                switch(choice){
                    case 1: 
                        enemyHp -= damageRandom; 
                        hp -= damageRandom;
                        if (hp < 0) hp = 0;
                        if (enemyHp < 0) enemyHp = 0;
                        System.out.println("hp Player: " + hp); 
                        System.out.println("hp Enemy: " + enemyHp);
                        break;
                    case 2: 
                        hp += healing;
                        System.out.println("hp Player increased!\n Player hp: " + hp);
                        break;
                    case 3:
                        System.out.println("Leaving war..");
                        return;
                    default: System.out.println("Choose 1 - 3!");
                        return;
                }
            }
        }
    }
}
