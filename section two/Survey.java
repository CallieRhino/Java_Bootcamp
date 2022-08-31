import java.util.Scanner;
import java.util.Locale;;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        int counter = 0;
        System.out.println("Welcome. Thank you for taking the survey");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\n" + "Thank you " + name + " for answering all " + counter + " questions");
        System.out.println("\nYour fast food expenses are " + (foodPrice/coffeePrice) + " times more than your coffee expenses");
        System.out.println("\nWeekly you spend in $" + (coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("\nWeekly you spend $" + (foodAmount*coffeePrice) + " on food");

        scan.close();
    }
}
