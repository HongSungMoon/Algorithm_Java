import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputSize; i++) {

            String command = br.readLine();
            String data = null;
            switch (command) {
                case "pop_front":
                    data = String.valueOf(deque.pollFirst());
                    if ("null".equals(data)) {
                        sb.append(String.valueOf("-1") + "\n");
                    } else {
                        sb.append(data + "\n");
                    }
                    break;
                case "pop_back":
                    data = String.valueOf(deque.pollLast());
                    if ("null".equals(data)) {
                        sb.append(String.valueOf("-1") + "\n");
                    } else {
                        sb.append(data + "\n");
                    }
                    break;
                case "size":
                    sb.append(String.valueOf(deque.size() + "\n"));
                    break;
                case "empty":
                    int empty = deque.isEmpty() ? 1 : 0;
                    sb.append(String.valueOf(empty + "\n"));
                    break;
                case "front":
                    data = String.valueOf(deque.peekFirst());
                    if ("null".equals(data)) {
                        sb.append(String.valueOf("-1") + "\n");
                    } else {
                        sb.append(data + "\n");
                    }
                    break;
                case "back":
                    data = String.valueOf(deque.peekLast());
                    if ("null".equals(data)) {
                        sb.append(String.valueOf("-1") + "\n");
                    } else {
                        sb.append(data + "\n");
                    }
                    break;
                default:
                    String[] commands = command.split(" ");
                    int temp = Integer.parseInt(commands[1]);
                    if ("push_front".equals(commands[0])) {
                        deque.addFirst(temp);
                    } else {
                        deque.addLast(temp);
                    }
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();

    }

}