public class forLoop {
    public static void main(String[] args){
        int i, j;
        
        System.out.println("---");
        for (i = 1;i <= 10;i++) System.out.printf("%d ", i);
        System.out.println("\n---");

        for (i = 0;i <= 100;i++) System.out.printf("%d ", i*2);
        System.out.println("\n---");
        
        for (i = 0;i < 5;i++){
            for (j = 0;j < 1+i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
