import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] perm;
    private static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        checked = new boolean[n + 1];
        perm = new int[m];
        dfs(0);
        bw.flush();
    }

    private static void dfs(int idx) throws IOException{
        if (idx == perm.length) {
            for (int p : perm) {
                bw.write(p + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i < checked.length; i++) {
            if (!checked[i]) {
                checked[i] = true;
                perm[idx] = i;
                dfs(idx + 1);
                checked[i] = false;
            }
        }
    }
}

/*
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
*/

