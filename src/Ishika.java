import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ishika {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("ishika.dat"));
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            int[] a = new int[in.nextInt()];

            for (int j = 0; j < a.length; j++) {
                a[j] = in.nextInt();
            }

            int out = Integer.MAX_VALUE;

            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (j == k) continue;

                    if (a[k] + a[j] >= 20) {
                        out = Math.min(out, a[k] + a[j]);
                    }
                }
            }

            System.out.println(out == Integer.MAX_VALUE ? "NOT POSSIBLE" : out);
        }
    }
}
