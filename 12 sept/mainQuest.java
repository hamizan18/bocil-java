public class mainQuest{
    public static void main(String[] args){
        String[] inventory = {"Potion", "Sword", "Shield"};
        int i;

        for (i = 0;i < inventory.length;i++){
            System.out.printf("\nItem [%d] dari inventory: %s", i+1, inventory[i]);
        }

        String[] addInventory = new String[inventory.length + 1];
        for (i = 0;i < inventory.length;i++){
            addInventory[i] = inventory[i];
        }
        addInventory[addInventory.length - 1] = "Bow";

        System.out.println("\n\nAfter adding bow: ");
        for (i = 0;i < addInventory.length;i++){
            System.out.printf("\nItem [%d] dari inventory: %s", i+1, addInventory[i]);
        }
    }
}