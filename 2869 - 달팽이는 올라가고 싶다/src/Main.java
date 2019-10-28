import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int up = Integer.parseInt(inputs[0]);
        int down = Integer.parseInt(inputs[1]);
        int goal = Integer.parseInt(inputs[2]);

        double result = (goal - up) / (double)(up - down);

        bw.write(String.valueOf((int)Math.ceil(result) + 1));
        bw.flush();
        bw.close();

    }

}
