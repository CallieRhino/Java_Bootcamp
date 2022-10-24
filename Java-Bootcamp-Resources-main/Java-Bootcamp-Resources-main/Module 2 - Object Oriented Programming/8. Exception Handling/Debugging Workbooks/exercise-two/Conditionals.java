public class Conditionals {
    public static void main(String[] args) {

        int age = 3;
        double debt = 0;

        String creditScore = debt <= 0 ? "Good" : "Bad";
        
        boolean canApply = age > 18;

        if (canApply && creditScore.equals("Good")) {
            System.out.println("We're processing your application");
        } else {
            System.out.println("You cannot apply");
        }

    }
}
