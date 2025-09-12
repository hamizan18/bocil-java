import java.util.Scanner;

public class bonusQuest{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int playerHp = 100, enemyHp = 80, i;
            String[] skills = {"Slash", "Fireball", "Thunder"};
            int[] damage = {15, 20, 25};
            int randDamage = (int)(Math.random()* 8) + 18;

            while(playerHp > 0 && enemyHp > 0)
            {
                for (i = 0;i < skills.length;i++){
                    System.out.printf("%d. %s", i+1, skills[i]);
                    System.out.print("\n");
                }
                int choice = 0;
                System.out.print("-----------------------------------\nChoose your skill: ");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        enemyHp -= damage[0];
                        playerHp -= randDamage;
                        if (playerHp < 0) {playerHp = 0; System.out.println("PLAYER LOSE!");}
                        if (enemyHp < 0) {enemyHp= 0; System.out.println("ENEMY LOSE!");}
                        System.out.println("\nHP Player: " + playerHp);
                        System.out.println("HP Enemy: " + enemyHp);
                        break;
                    case 2:
                        enemyHp -= damage[1];
                        playerHp -= randDamage;
                        if (playerHp < 0) {playerHp = 0; System.out.println("PLAYER LOSE!");}
                        if (enemyHp < 0) {enemyHp= 0; System.out.println("ENEMY LOSE!");}
                        System.out.println("\nHP Player: " + playerHp);
                        System.out.println("HP Enemy: " + enemyHp);
                        break;
                    case 3: 
                        enemyHp -= damage[2];
                        playerHp -= randDamage;
                        if (playerHp < 0) {playerHp = 0; System.out.println("PLAYER LOSE!");}
                        if (enemyHp < 0) {enemyHp= 0; System.out.println("ENEMY LOSE!");}
                        System.out.println("\nHP Player: " + playerHp);
                        System.out.println("HP Enemy: " + enemyHp);
                        break;
                    default:
                        System.out.println("\nPlayer just have skill 1 - 3!");
                        break;
                }
            }
        }
    }
}