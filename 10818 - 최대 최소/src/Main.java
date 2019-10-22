import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCount = Integer.parseInt(br.readLine());
        String [] nums = br.readLine().split(" ");

        int min = 1000001;
        int max = -1000001;

        for(int i=0; i<numCount; i++) {
            int target = Integer.parseInt(nums[i]);
            if(min > target)
                min = target;
            if(max < target)
                max = target;
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();

    }

}
