import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Krish {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("krish.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            long n = in.nextLong();
            long c = Math.abs(n);
            String reverse = n < 0 ? "-" + new StringBuilder("" + Math.abs(n)).reverse() : new StringBuilder("" + n).reverse().toString();
            long rev = Long.parseLong(reverse);

            long sum = sum(c), prod = prod(c);
            if ((reverse.replaceAll("0", "").length() - 1) % 2 == 1 && n < 0)
                prod *= -1;

            System.out.printf("%d %d %d %d %d%n", n, n < 0 ? -sum : sum, prod, rev, n * rev);
        }
    }

    public static long sum(long n) {
        long sum = 0;
        long copy = n;
        n = Math.abs(n);

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return copy < 0 ? -sum : sum;
    }

    public static long prod(long n) {
        long prod = 1;

        while (n != 0) {
            if (n % 10 == 0) {
                n /= 10;
                continue;
            }

            prod *= n % 10;
            n /= 10;
        }

        return prod;
    }
}
