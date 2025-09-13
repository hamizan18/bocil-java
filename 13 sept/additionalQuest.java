import java.util.Scanner;

public class additionalQuest {
    static Scanner input = new Scanner(System.in);
    public static int attack(int chosenSkill, String[] skills, int[] dmg, int enemyHp){
        int i;
        for (i = 0;i < skills.length;i++){
            if (chosenSkill == i){
                System.out.println("Hero uses " + skills[i] + "! Enemy takes " + dmg[i] + " damage.");
                enemyHp -= dmg[i];
            }
        }
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
    public static int playerCorrection(int hp){
        if (hp < 0) {
            return hp = 0;
        }
        return hp = hp;
    }
    public static int enemyCorrection(int enemyHp){
        if (enemyHp < 0) {
            return enemyHp = 0;
        }
        return enemyHp = enemyHp;
    }
    public static int printSkill(String[] skills, int[] dmg){
        int i, chosen = 0;
        for (i = 0;i < skills.length;i++){
            System.out.printf("%d. %s [%d damage dealt]\n", i+1, skills[i], dmg[i]);
        }
        System.out.print("Choose your skill to attack: ");
        chosen = input.nextInt();
        return chosen-1;
    }
    public static int chooseSkill(int choice, int[] dmg, int playerHp){
        int i;
        for (i = 0;i < dmg.length;i++){
            if (choice == i){
                playerHp -= dmg[choice];
            }
        }
        return playerHp;
    }
    public static void main(String[] args)
    {
        int playerHp = 100, enemyHp = 80, choice, attack, chosenSkill;
        String[] skills = {"Slash", "Fireball", "Thunder"};
        int[] damage = {15, 20, 25};

        while (playerHp > 0 && enemyHp > 0){
            int randomRegen = (int)(Math.random() * 5) + 10;
            int damageRandom = (int)(Math.random() * 12) + 18;

            System.out.print("1. Attack\n2. Heal\n3. Run\nChoose your action: ");
            choice = input.nextInt();
            switch(choice){
                case 1: 
                    chosenSkill = printSkill(skills, damage);
                    playerHp = chooseSkill(chosenSkill, damage, playerHp);
                    enemyHp = attack(chosenSkill, skills, damage, enemyHp);
                    playerHp = playerCorrection(playerHp);
                    enemyHp = enemyCorrection(enemyHp);
                    showStatus(playerHp, enemyHp); 
                    break;
                case 2: 
                    playerHp = heal(playerHp, randomRegen); 
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