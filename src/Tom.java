import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Tom {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tom.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            String word = in.next();
            int score = 0;

            for (char a: word.toCharArray()) {
                score += 1 + map.getOrDefault(a, 0);
                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            System.out.println(score);
        }
    }
}
