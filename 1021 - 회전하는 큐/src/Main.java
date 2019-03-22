import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] infos = br.readLine().split(" ");
        String[] inputs = br.readLine().split(" ");

        int size = Integer.parseInt(infos[0]);
        int pickCount = Integer.parseInt(infos[1]);

        int total = 0;
        int location = 1;

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= size; i++) {
            deque.addLast(i);
        }

        for(int i=0; i<pickCount; i++) {
            int right = 0;
            int target = Integer.parseInt(inputs[i]);
            while(true) {
                if(deque.getFirst() == target) {
                    deque.pollFirst();
                    break;
                }
                right++;
                int temp = deque.pollFirst();
                deque.addLast(temp);
            }
            int left = deque.size() - right + 1;
            if(left > right)
                total += right;
            else
                total += left;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();

    }

}
