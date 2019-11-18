import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int num = 666;

        while(n != cnt) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();

    }

}
