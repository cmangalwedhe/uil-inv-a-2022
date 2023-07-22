import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Harold {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("harold.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            DecimalFormat format = new DecimalFormat("0." + "#".repeat((""+num).length()) + "E0");
            System.out.println(num + "=" + format.format(num).replaceAll("E", "*10^"));
        }
    }
}
