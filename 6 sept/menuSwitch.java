import java.util.Scanner;

public class menuSwitch {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("1. Attack\n2. Defend\n3. Heal\n4. Run\nChoose your action: ");
            int choice = input.nextInt();

            switch(choice){
                case 1: System.out.println("You attack!"); break;
                case 2: System.out.println("Defending!"); break;
                case 3: System.out.println("Healing.."); break;
                case 4: System.out.println("Leaving the battle.."); break;
                default: System.out.println("Input Not Valid"); break;
            }
        }
    }
}
