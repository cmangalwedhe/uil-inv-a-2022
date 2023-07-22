import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Sheal {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("sheal.dat"));
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            HashSet<String> visited = new HashSet<>();
            char[] word = in.next().toCharArray();
            dfs(word, "", visited, new boolean[word.length]);
            ArrayList<String> list = new ArrayList<>(visited);
            list.sort(String::compareTo);
            System.out.println(list.get(in.nextInt()));
        }
    }

    public static void dfs(char[] word, String curr, HashSet<String> set, boolean[] visited) {
        set.add(curr);

        for (int i = 0; i < word.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(word, curr+word[i], set, visited);
                visited[i] = false;
            }
        }
    }
}
