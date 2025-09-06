import java.util.Scanner;

public class mixQuest {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){

            System.out.print("Input hp: ");
            int hp = input.nextInt();

            if (hp <= 0){
                System.out.println("Hero is dead..");
            } else if (hp > 0) {
                System.out.print("1. Attack\n2. Heal\n3. Run\nChoose your action: ");
                int choice = input.nextInt();

                    switch(choice){
                        case 1: System.out.println("Hero deals damage!"); break;
                        case 2: 
                            hp+= 20; 
                            System.out.println("Healing..");
                            System.out.println("Your hp: " + hp); break;
                        case 3: System.out.println("Hero fled the battle!"); break;
                        default: System.out.println("Stress ya?"); break;
                }
            }
        }
    }
}
