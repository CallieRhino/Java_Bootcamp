import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */

        System.out.println("How many pizza toppings do you want?");
        int toppingsNum = scan.nextInt();
        scan.nextLine();

        String[] toppStrings = new String[toppingsNum];

        // Task 2 – Create the array here

        System.out.println("Great, enter each topping!");

        for (int i = 0; i < toppingsNum; i++) {
            System.out.print(i + ". ");
            String topping = scan.next();
            toppStrings[i] = topping;
        }

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        System.out.println("\nThank you, here are the toppings you ordered");

        for (int i = 0; i < toppStrings.length; i++) {
            System.out.println(i + ". " + toppStrings[i]);
        }

        System.out.println("Press anything to confirm your order.");

        scan.nextLine();
        scan.nextLine();

        System.out.println("Thanks, your order is on it's way!");

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}
