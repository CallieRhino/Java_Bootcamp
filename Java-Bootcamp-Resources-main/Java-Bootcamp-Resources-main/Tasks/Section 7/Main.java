import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
        Car nissan2 = new Car(nissan);
        Car dodge = new Car("Dodge", 8500, 2019, "blue", parts);

        nissan2.setColor("yellow");
        nissan2.setParts(new String[] {"tires", "filter"});
        System.out.println(Arrays.toString(nissan2.getParts()));
    
    }
}
