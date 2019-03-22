import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Long.parseLong(br.readLine());

        long a = 0;
        long b = 1;
        long c = 1;

        if(input == 1) {
            bw.write("1");
            bw.flush();
            bw.close();
            return;
        }
        for (long i = 1; i < input; i++) {
            if(a > 1000000 && b > 1000000) {
                a %= 1000000;
                b %= 1000000;
            }
            c = a + b;
            a = b;
            b = c;
        }
        bw.write(String.valueOf(c));
        bw.newLine();
        bw.write(String.valueOf(c % 1000000));
        bw.flush();
        bw.close();

    }

}
