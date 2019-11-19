import java.io.*;
import java.util.Stack;

public class Main {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        for(int i=1; i<=n; i++) {
            stack = new Stack<>();
            stack.push(i);
            find(m-1, n, m);
        }

    }

    public static void find(int num, int n, int m) {

        if(stack.size() == m) {

            for(int i=0; i<stack.size(); i++)
                System.out.print(stack.get(i) + " ");
            System.out.println();

            for(int i=m-stack.size(); i<=num; i++) {
                stack.pop();
            }

            return;
        }

        for(int i=1; i<=n; i++) {
            if(stack.contains(i))
                continue;
            stack.push(i);
            find(num - 1, n, m);
        }

        for(int i=m-stack.size(); i<=num; i++) {
            stack.pop();
        }
    }

}
