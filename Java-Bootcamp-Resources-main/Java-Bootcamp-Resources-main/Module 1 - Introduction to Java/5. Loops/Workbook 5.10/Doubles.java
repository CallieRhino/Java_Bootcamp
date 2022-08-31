public class Doubles {

    public static int dice1 = rollDice();
    public static int dice2 = rollDice();
    public static void main(String[] args) {
        
        while (!checkDice()) {
            dice1 = rollDice();
            dice2 = rollDice();
        }
    }

    /** 
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */
     public static int rollDice() {
        double random = Math.random()*6;
        int randomNumber = (int)random + 1;
        return randomNumber;
     }

     public static boolean checkDice() {
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
        if (dice1 == dice2) {
            System.out.println("You rolled Doubles!\n");
            return true;
        }
        return false;
     }

}
