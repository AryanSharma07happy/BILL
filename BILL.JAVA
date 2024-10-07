public class Main {
    public static void main(String[] args) {
        // Sample data to print in columns
        String[] names = {"Apple", "Banana", "Orange", "Grapes"};
        int[] quantities = {50, 20, 75, 100};
        double[] prices = {1.25, 0.75, 0.99, 2.50};

        // Print header
        System.out.printf("%-10s %10s %10s%n", "Item", "Quantity", "Price");

        // Print data in columns
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %10d %10.2f%n", names[i], quantities[i], prices[i]);
        }
    }
}