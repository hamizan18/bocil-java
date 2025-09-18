class Hero {
    String name;
    int hp;
    int attackPower;

    int attack(Enemy enemy) {
        System.out.println(name + " menyerang " + enemy.name + " dengan " + attackPower + " damage!");
        enemy.hp -= attackPower;
        return enemy.hp;
    }
    int heal(int amount) {
        System.out.println("Healing..[+" + amount + "hp]");
        hp += amount;
        return hp;
    }
    void showStatus() {
        System.out.println("Player HP: " + hp + "\t| Attack: " + attackPower);
    }
}
class Enemy {
    String name;
    int hp;
    int attackPower;

    int attack(Hero hero) {
        System.out.println(name + " menyerang " + hero.name + " dengan " + attackPower + " damage!");
        hero.hp -= attackPower;
        return hero.hp;
    }
    void showStatus() {
        System.out.println("Enemy HP: " + hp + "\t| Attack: " + attackPower);
    }
}
public class classnObject {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Mingjaan";
        hero1.hp = 100;
        hero1.attackPower = 15;
        int amount = (int)(Math.random()* 8) + 12;

        Hero hero2 = new Hero();
        hero2.name = "Hemroo";
        hero2.hp = 30;
        hero2.attackPower = (int)(Math.random()* 10) + 25;

        Enemy enemy1 = new Enemy();
        enemy1.name = "Goblin";
        enemy1.hp = 80;
        enemy1.attackPower = 28;

        System.out.println("--- BEFORE WAR ---");
        hero1.showStatus();
        hero2.showStatus();
        enemy1.showStatus();

        System.out.println("\n[HERO]");
        enemy1.hp = hero1.attack(enemy1);
        hero1.heal(amount);
        enemy1.hp = hero2.attack(enemy1);

        System.out.println("\n[ENEMY]");
        hero1.hp = enemy1.attack(hero1);
        hero2.hp = enemy1.attack(hero2);

        System.out.println("\n--- AFTER WAR ---");
        hero1.showStatus();
        hero2.showStatus();
        enemy1.showStatus();

    }
}