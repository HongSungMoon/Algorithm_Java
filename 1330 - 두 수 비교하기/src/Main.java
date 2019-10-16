import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" " );

        if (inputs[0].equals(inputs[1])) {
            bw.write("==");
        } else if (Integer.parseInt(inputs[0]) > Integer.parseInt(inputs[1])) {
            bw.write(">");
        } else {
            bw.write("<");
        }

        bw.flush();
        bw.close();

    }

}
