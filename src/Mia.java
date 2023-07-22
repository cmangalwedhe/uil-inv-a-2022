import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mia {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("mia.dat"));
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            int N = in.nextInt();
            int[][] mat = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    mat[j][k] = in.nextInt();
                }
            }

            boolean notIdentity = false;

            for (int j = 0; j < mat[0].length; j++) {
                int cnt = 0;

                for (int k = 0; k < mat.length; k++) {
                    if (mat[k][j] == 1) cnt++;
                }

                if (cnt > 1 || cnt == 0) {
                    System.out.printf("Matrix %d: This is not an Identity Matrix%n", i+1);
                    notIdentity = true;
                    break;
                }
            }

            if (notIdentity) continue;

            if (idenity(mat) && !notIdentity) {
                System.out.printf("Matrix %d: Identity Matrix - No swaps needed%n", i + 1);
                continue;
            }

            if (!notIdentity) {
                System.out.printf("Matrix %d: Identity Matrix - Swaps needed%n", i+1);
                continue;
            }


        }
    }

    public static boolean idenity(int[][] mat) {
        for (int j = 0, k = 0; j < mat.length && k < mat[0].length; j++, k++)
            if (mat[j][k] == 0) return false;

        return true;
    }
}
