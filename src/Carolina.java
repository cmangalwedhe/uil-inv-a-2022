import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Carolina {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("carolina.dat"));
        double totalPrice = 0, taxedTotal = 0;

        while (in.hasNext()) {
            double price = in.nextDouble();
            totalPrice += price;
            String product = in.nextLine();

            double tax = price * .0825;
            taxedTotal += Double.parseDouble(String.format("%.2f", price + tax));
            System.out.printf("$%.2f + $%.2f = $%.2f%s%n", price, tax, price + tax, product);
        }

        double tax = totalPrice * .0825;
        System.out.printf("$%.2f + $%.2f = $%.2f Combined Single Purchase%n", totalPrice, tax, totalPrice + tax);
        System.out.printf("$%.2f Sum of Individual Purchases", taxedTotal);
    }
}
