import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] inputs = br.readLine().split(" " );

        int hour = Integer.parseInt(inputs[0]);
        int minute = Integer.parseInt(inputs[1]);

        if (minute - 45 < 0) {
            hour--;
            minute += 15;
        } else {
            minute -= 45;
        }

        if (hour < 0) {
            hour = 23;
        }

        bw.write(hour + " " + minute);
        bw.flush();
        bw.close();

    }

}
