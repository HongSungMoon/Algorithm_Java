import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        Set<Integer> checker = new HashSet<>();
        int target = -1;
        int result = 0;
        while ((input = br.readLine()) != null) {
            target = Integer.parseInt(input) % 42;
            if (!checker.contains(target)) {
                checker.add(target);
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
