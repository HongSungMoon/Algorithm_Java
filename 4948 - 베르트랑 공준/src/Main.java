import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> array = new ArrayList<>();

        while(true) {
            int target = Integer.parseInt(br.readLine());
            if(target == 0)
                break;
            array.add(target);
        }

        int max = Collections.max(array);
        int sqrt = (int)Math.sqrt(max * 2) + 1;
        boolean [] sosu = new boolean [(max * 2) + 1];

        Arrays.fill(sosu,true);

        for(int i=2; i< sqrt; i++) {
            for(int j=2; j<i; j++) {
                if(i % j == 0)
                    sosu[i] = false;
            }
        }

        for(int i=2; i<sqrt; i++) {
            if(sosu[i]) {
                for(int j=sqrt; j<=2*max; j++) {
                    if(j % i == 0)
                        sosu[j] = false;
                }
            }
        }

        for(int i=0; i<array.size(); i++) {
            int target = array.get(i);
            int count = 0;
            for(int j=target + 1; j<=target*2; j++) {
                if(sosu[j])
                    count++;
            }
            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
