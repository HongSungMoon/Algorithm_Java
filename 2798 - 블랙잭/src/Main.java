import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        inputs = br.readLine().split(" ");

        int[] nums = new int [n];

        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int max = 0;

        for(int i=0; i<n-2; i++) {
            for(int j=1; j<n-1; j++) {
                for(int k=2; k<n; k++) {
                    if(i != j && j != k && i != k) {
                        int tmp = nums[i] + nums[j] + nums[k];
                        if (m >= tmp && max < tmp)
                            max = tmp;
                    }
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }

}
