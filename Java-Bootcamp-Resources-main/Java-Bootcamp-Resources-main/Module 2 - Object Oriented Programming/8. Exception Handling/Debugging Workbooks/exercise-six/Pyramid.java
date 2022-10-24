public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else if (j == i) {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }
}
