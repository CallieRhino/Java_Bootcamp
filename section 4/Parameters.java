public class Parameters {
    public static void main(String[] args) {
        measureRectangle(15, 25);
    }

    public static void measureRectangle(double len, double wid) {
        double area = len * wid;
        System.out.println("The area of the rectangle is " + area + "\n");
    }
}
