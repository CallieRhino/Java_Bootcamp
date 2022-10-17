import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
         Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };

        Machine machine = new Machine(items);

        System.out.println(machine);

            

        while (true) {
            System.out.print("\n" + "Pick a row: ");
            int getRow = sc.nextInt();
            System.out.print("Pick a spot in the row: ");
            int getSpot = sc.nextInt();

            if (machine.dispense(getRow, getSpot)) {
                System.out.print("Enjoy your drink! Press 1 to purchase another: ");
                int nextPurchase = sc.nextInt();
                if (nextPurchase == 1) {
                    System.out.print("\n" + machine + "\n");
                    continue;
                } else {break;}
            } else if (!machine.dispense(getRow, getSpot)) {
                System.out.print("Sorry, we're out of this item. Press 1 to purchase another: ");
                int nextPurchase = sc.nextInt();
                if (nextPurchase == 1) {
                    System.out.print("\n" + machine + "\n");
                    continue;
                } else {break;}
            }

            System.out.println("\n" + machine);
            sc.close();
        }

      
    }
}
