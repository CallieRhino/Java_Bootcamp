public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] items = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        // Task 2 - Populate your 2D array with values from the table (see article)

        // Task 3 - Print the prices for each department. See the article for the expected output. 
        
        for (int i = 0; i < items.length; i++) {
            switch (i) {
                case 1: System.out.print("Beverage: "); break;
                case 0: System.out.print("Baking: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + " ");
            }
            
            System.out.println("\t");
        }



    }
}