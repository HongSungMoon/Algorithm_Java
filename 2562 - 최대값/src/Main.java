import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int max = 0;
        int maxIdx = 0;
        int idx = 1;
        while ((input = br.readLine()) != null) {
            int tmp = Integer.parseInt(input);
            if(max < tmp) {
                max = tmp;
                maxIdx = idx;
            }
            idx++;
        }

        bw.write(String.valueOf(max));
        bw.newLine();;
        bw.write(String.valueOf(maxIdx));
        bw.flush();
        bw.close();

    }

}
