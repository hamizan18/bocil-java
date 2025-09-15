class Hero {
    String name;
    int hp;
    int attackPower;

    int attack(Enemy enemy) {
        System.out.println(name + " menyerang " + enemy.name + " dengan " + attackPower + " damage!");
        enemy.hp -= attackPower;
        return enemy.hp;
    }
    void showStatus() {
        System.out.println("Player HP: " + hp + " | Attack: " + attackPower);
    }
}
class Enemy {
    String name;
    int hp;
    int attackPower;

    int attack(Hero hero) {
        System.out.println(name + " menyerang " + hero + " dengan " + " damage!");
        hero.hp -= attackPower;
        return hero.hp;
    }
    void showStatus() {
        System.out.println("HP: " + hp + " | Attack: " + attackPower);
    }
}
public class classnObject {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Mingjaan";
        hero1.hp = 100;
        hero1.attackPower = 15;

        Enemy enemy1 = new Enemy();
        enemy1.name = "Goblin";
        enemy1.hp = 80;
        enemy1.attackPower = 12;

        hero1.showStatus();
        enemy1.showStatus();

        hero1.attack(enemy1);
        enemy1.attack(hero1);
    }
}