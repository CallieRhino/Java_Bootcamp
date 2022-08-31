import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "a" : System.out.println("What is your budget?");
                    int budget = scan.nextInt();
                    if (budget >= 10000) {
                        System.out.println("Great! A Nissan Altima is available");
                    } else {
                        System.out.println("We don't sell cars under $10,000");
                    }
            case "b" : System.out.println("you chose option " + option); break;
            default : System.out.println("invalid option");
            scan.close();
        }
    }
}
