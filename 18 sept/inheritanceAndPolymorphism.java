class Character {
    String name;
    int hp;
    int power;

    void attack(Character target) {
        System.out.println(name + " menyerang!");
    }
    void showStatus() {

    }
}

class Hero extends Character {
    Hero(String name, int hp, int atkPower) {
        this.name = name;
        this.hp = hp;
        this.power = atkPower;

        void attack(int name) {
            System.out.println(name + " menggunakan pedang!" );
        }
    }
}

class Enemy extends Character {

}

public class inheritanceAndPolymorphism {
    public static void main(String[] args) {

        int randomDamage(int min, int max) {
            return (int)(Math.random()* min) + max;
        }

        int enemyDamage = randomDamage(10, 20);
        int heroDamage = randomDamage(15, 25);
        int bossDamage = randomDamage(18, 20);

        Hero hero1 = new Hero("Mingjaan", 100, heroDamage);

    }
}