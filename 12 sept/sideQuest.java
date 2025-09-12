public class sideQuest{
    public static void main(String[] args){
        int[] damage = {10, 20, 30, 40};
        int i, result = 0;
        for (i = 0;i < damage.length;i++){
            System.out.println("Damage yang diberikan: " + damage[i]);
            result += damage[i];
        }
        System.out.println("Total damage yang diberikan: " + result);
    }
}