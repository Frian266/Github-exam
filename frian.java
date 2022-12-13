import java.util.*;

public class frian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // product code 
        String[][] list = {
        // code desc price
            {"101A", "Spotify Premium", "500"},
            {"1,0", "1,1", "1,2"},
            {"2,0", "2,1", "2,2"},
            {"3,0", "3,1", "3,2"},
            {"4,0", "4,1", "4,2"}
        };
        
        System.out.print("Enter a Product Code: ");
        String input = sc.nextLine();
        System.out.print("Quantity: ");
        int quanti = sc.nextInt();

        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < 2; j++) {

                 if (input.equals(list[i][0])) {
                    System.out.println("Item is found. ");
                    System.out.println("Product code: " + list[i][0]);
                    System.out.println("Description: " + list[i][1]);
                    System.out.println("Price: " + list[i][2]);
                    System.out.println("Quantity: " + quanti);
                    int price = Integer.valueOf(list[i][2]);
                    int amount = quanti * price;
                    System.out.println("Amount: " + amount );
                    
                } 
            }
        }
    }
}
