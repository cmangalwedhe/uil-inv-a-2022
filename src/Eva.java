import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eva {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("eva.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            String out = "";
            int height = in.nextInt();
            System.out.println("Start of Triangle #" + (i + 1));

            for (int j = 1; j <= height; j++) {
                out += " ".repeat(height - j) + "*".repeat(cnt) + "\n";
                cnt += 2;
            }

            System.out.print(out);
            System.out.println("End of Triangle #" + (i + 1));
        }
    }
}
