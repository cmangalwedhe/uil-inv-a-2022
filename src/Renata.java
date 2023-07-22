import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Renata {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("renata.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int dimensions = in.nextInt();
            int[][] mat = new int[dimensions][dimensions];

            for (int j = 0; j < dimensions; j++) {
                for (int k = 0; k < dimensions; k++) {
                    mat[j][k] = in.nextInt();
                }
            }

            int T = in.nextInt();
            int score = 0;

            for (int j = 0; j < T; j++) {
                score += mat[in.nextInt()-1][in.nextInt()-1];
            }

            System.out.printf("%d: %d%n", i+1, score);
        }
    }
}
