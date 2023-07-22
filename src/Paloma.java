import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Paloma {
    static int[] ary;

    static {
        ary = new int[21];
        ary[0] = ary[1] = 1;

        for (int i = 2; i < ary.length; i++)
            ary[i] = ary[i - 1] + ary[i - 2];
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("paloma.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(ary[in.nextInt()]);
        }
    }
}
