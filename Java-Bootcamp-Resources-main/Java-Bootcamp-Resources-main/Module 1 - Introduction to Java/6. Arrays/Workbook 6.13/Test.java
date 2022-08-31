import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        numbers[10%2][5%2] = 7;

        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        

    }
}
