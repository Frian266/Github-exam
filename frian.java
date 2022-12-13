import java.util.*;

public class frian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // product code 
        String[][] list = {
        // code desc price
            {"101A", "Spotify Premium", "500.00"},
            {"SB28", "Facebook", "300.00"},
            {"34DS", "Twitter", "150.00"},
            {"9DB3", "Youtube", "250.00"},
            {"03CN", "Instagram", "400.00"}
        };
        
        System.out.print("Enter a Product Code: ");
        String input = sc.nextLine();
        System.out.print("Quantity: "); 
        int quanti = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < 2; j++) {

                 if (input.equals(list[i][0])) {
                    System.out.println("Item is found. ");
                    System.out.println("Product code: " + list[i][0]);
                    System.out.println("Description: " + list[i][1]);
                    System.out.println("Price: " + list[i][2]);
                    System.out.println("Quantity: " + quanti);
                    double price = Double.valueOf(list[i][2]);
                    double amount = quanti * price;
                    System.out.println("Amount: " + amount + "0");
                    System.out.println("");
                    System.out.println("Thank you for your business!");
                } 
            }
        }
    }
}
