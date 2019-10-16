import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int[] values = new int [3];
        int result = 0;

        for(int i=0; i<3; i++) {
            values[i] = num1 * (num2 % (int)Math.pow(10, i+1) / (int)Math.pow(10, i));
            result += (values[i] * (int)Math.pow(10, i));
            bw.write(String.valueOf(values[i]));
            bw.newLine();
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}
