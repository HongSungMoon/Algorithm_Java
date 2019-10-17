import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeatCount = Integer.parseInt(br.readLine());

        for (int i=0; i<repeatCount; i++) {
            String[] inputs = br.readLine().split(" ");
            bw.write(String.valueOf(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1])));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
