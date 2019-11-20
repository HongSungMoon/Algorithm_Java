import java.io.*;
import java.util.ArrayList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int selectedCount = 0;
    static int[] idxs;
    static ArrayList<Integer> list = new ArrayList<>();
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {

        String[] inputs = br.readLine().split(" ");
        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);
        idxs = new int [n+1];

        dfs(1);

        bw.flush();
        bw.close();

    }

    static void dfs(int idx) throws IOException {

        if(selectedCount == m) {
            for(int i=0; i<list.size(); i++) {
                bw.write(list.get(i) + " ");
            }
            bw.newLine();
            return;
        }

        for(int i=1; i<=n; i++) {
            idxs[i]++;
            selectedCount++;
            list.add(i);
            dfs(i+1);
            idxs[i]--;
            selectedCount--;
            list.remove(list.size() - 1);
        }
    }
}
