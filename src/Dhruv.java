import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Dhruv {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dhruv.dat"));
        String line;
        HashMap<Integer, String> map = new HashMap<>();

        while (!(line=in.nextLine()).matches("\\d+")) {
            String[] split = line.split(" ");
            map.put(Integer.valueOf(split[1]), split[0]);
        }

        int N = Integer.parseInt(line);

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            int dist = Integer.MAX_VALUE;
            int key = -1;

            if (num < 535 || num > 1605) {
                System.out.println("BAD INPUT");
                continue;
            }

            for (int station: map.keySet()) {
                int diff = Math.abs(num - station);

                if (diff == dist && station > key || diff < dist) {
                    key = station;
                    dist = diff;
                }
            }

            System.out.println(map.get(key));
        }
    }
}
