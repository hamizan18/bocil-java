import java.util.Scanner;

public class mainQuest6 {
    public static int attack(String skill, int dmg, int enemyHp){
        System.out.println("Hero uses " + skill + "! Enemy takes " + dmg + " damage.");
        enemyHp -= dmg;
        if (enemyHp < 0) enemyHp = 0;
        return enemyHp;
    }
    public static int heal(int hp, int amount){
        System.out.println("HP INCREASED: [" + amount + "hp]");
        hp += amount;
        if (hp > 100) hp = 100;
        return hp;
    }
    public static void showStatus(int hp, int enemyHp){
        System.out.println("Player HP: " + hp + "| Enemy HP: " + enemyHp);
    }
    public static int enemyAttack(int hp, int dmg){
        return hp -= dmg;
    }
    public static int playerCorrection(int hp){
        if (hp < 0) return hp = 0;
    }
    public static int enemyCorrection(int enemyHp){
        if (enemyHp < 0) return enemyHp = 0;
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int playerHp = 100, enemyHp = 80, choice;

            while (playerHp > 0 && enemyHp > 0){
                int damageRandom = (int)(Math.random() * 12) + 18;
                int randomRegen = (int)(Math.random() * 5) + 10;

                System.out.print("1. Attack\n2. Heal\n3. Run\nChoose your action: ");
                choice = input.nextInt();
                switch(choice){
                    case 1: 
                        enemyHp = attack("Fireball", damageRandom, enemyHp); 
                        playerHp = enemyAttack(playerHp, damageRandom);
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        break;
                    case 2: 
                        playerHp = heal(playerHp, randomRegen); 
                        playerHp = enemyAttack(playerHp, damageRandom);
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        break;
                    case 3: 
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        return;
                }
            }
        }
    }
}