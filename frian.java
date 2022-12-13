import java.util.*;

public class frian {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[5];

        System.out.println("Enter a number: ");
        for (int i = 0; i < list.length; i++) {
            int input = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                int num1 = list[i] , num2 = list[j]; 
                max = Math.max(num1 , num2);
            }
        }

        System.out.println(max);
 
    }
}
