import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean [] idxs;
    static int selectedCount = 0;

    public static void main(String[] args) throws IOException {

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        idxs = new boolean [n + 1];

        dfs(1, n, m);

        bw.flush();
        bw.close();

    }

    static void dfs(int idx, int n, int m) throws IOException {

        if(selectedCount == m) {
            for (int i=1; i<=n; i++) {
                if(idxs[i])
                    bw.write(i + " ");
            }
            bw.newLine();
            return;
        }

        for(int i=idx; i<=n; i++) {
            idxs[i] = true;
            selectedCount++;
            dfs(i + 1, n, m);
            idxs[i] = false;
            selectedCount--;
        }


    }

}
