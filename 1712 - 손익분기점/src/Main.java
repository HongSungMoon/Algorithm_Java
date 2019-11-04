import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int total = Integer.parseInt(inputs[0]);
        int one = Integer.parseInt(inputs[2]) - Integer.parseInt(inputs[1]);
        int count = 1;

        if(one <= 0)
            count = -1;
        else
            count = total / (one) + 1;

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
