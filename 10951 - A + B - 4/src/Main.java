import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputs;
        String [] input;
        while ((inputs = br.readLine()) != null) {
            input = inputs.split(" ");
            bw.write(String.valueOf(Integer.parseInt(input[0]) + Integer.parseInt(input[1])));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
