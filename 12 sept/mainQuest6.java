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
        if (hp > 0 && enemyHp >  0){
            System.out.println("Player HP: " + hp + " | Enemy HP: " + enemyHp);
        } else if (hp < 0){
            System.out.println("Player HP: " + hp + " | Enemy HP: " + enemyHp);
            System.out.println("Player lose!");
        } else if (enemyHp < 0){
            System.out.println("Player HP: " + hp + " | Enemy HP: " + enemyHp);
            System.out.println("Enemy lose!");
        } else {
            System.out.println("Player HP: " + hp + " | Enemy HP: " + enemyHp);
            System.out.println("Draw!");
        }
    }
    public static int enemyAttack(int hp, int dmg){
        return hp -= dmg;
    }
    public static int playerCorrection(int hp){
        if (hp < 0) {
            return hp = 0;
        }
        return hp;
    }
    public static int enemyCorrection(int enemyHp){
        if (enemyHp < 0) {
            return enemyHp = 0;
        }
        return enemyHp;
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int playerHp = 100, enemyHp = 80, choice, attack, chosenSkill;

            while (playerHp > 0 && enemyHp > 0){
                int damageRandom = (int)(Math.random() * 12) + 18;
                int enemyDamage = (int)(Math.random() * 12) + 20; 
                int randomRegen = (int)(Math.random() * 5) + 10;

                System.out.print("1. Attack\n2. Heal\n3. Run\nChoose your action: ");
                choice = input.nextInt();
                switch(choice){
                    case 1: 
                        enemyHp = attack("Fireball", damageRandom, enemyHp); 
                        playerHp = enemyAttack(playerHp, enemyDamage);
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        break;
                    case 2: 
                        playerHp = heal(playerHp, randomRegen); 
                        playerHp = enemyAttack(playerHp, enemyDamage);
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        break;
                    case 3: 
                        System.out.println("You leave the battle..");
                        playerHp = playerCorrection(playerHp);
                        enemyHp = enemyCorrection(enemyHp);
                        showStatus(playerHp, enemyHp); 
                        return;
                }
            }
        }
    }
}