import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String commands = br.readLine();
            int arrSize = Integer.parseInt(br.readLine());
            String arrStr = br.readLine();

            Deque<Integer> deque = new LinkedList<>();
            boolean sequential = true;
            StringBuilder sb = new StringBuilder();
            boolean isError = false;

            String[] arr = arrStr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

            if (arrSize > 0) {
                for (int j = 0; j < arr.length; j++) {
                    deque.add(Integer.parseInt(arr[j]));
                }
            }

            for (int j = 0; j < commands.length(); j++) {
                switch (commands.charAt(j)) {
                    case 'R':
                        sequential = !sequential;
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            isError = true;
                        }
                        if (sequential) {
                            deque.pollFirst();
                        } else {
                            deque.pollLast();
                        }
                        break;
                }
            }

            if (isError) {
                sb.append("error");
            } else {
                sb.append("[");
                if (sequential) {
                    if (!deque.isEmpty())
                        sb.append(String.valueOf(deque.pollFirst()));
                    int size = deque.size();
                    for (int j = 0; j < size; j++) {
                        sb.append("," + String.valueOf(deque.pollFirst()));
                    }
                } else {
                    if (!deque.isEmpty())
                        sb.append(String.valueOf(deque.pollLast()));
                    int size = deque.size();
                    for (int j = 0; j < size; j++) {
                        sb.append("," + String.valueOf(deque.pollLast()));
                    }
                }
                sb.append("]");
            }

            bw.write(sb.toString());
            bw.newLine();

        }

        bw.flush();
        bw.close();

    }

}
