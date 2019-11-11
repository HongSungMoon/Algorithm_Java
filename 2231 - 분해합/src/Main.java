import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(br.readLine());

        int tmp = 1;
        int count = 1;

        while (target / tmp != 0) {
            tmp*=10;
            count += 1;
        }

        int startNum = target - (9 * (count - 1));
        int result = 0;

        for(int i=startNum; i<target; i++) {
            result = 0;
            int temp = i;
            int sum = 0;
            while(temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            if(i + sum == target) {
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
