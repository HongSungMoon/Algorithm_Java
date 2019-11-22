import java.io.*;
import java.util.ArrayList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int m;
    static int n;
    static int selectedCount = 0;

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        String[] inputs = br.readLine().split(" ");

        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);

        for(int i=1; i<=n; i++) {
            arr.add(i);
            selectedCount++;
            fuc(2);
            arr.remove(arr.size() - 1);
            selectedCount--;
        }


        bw.flush();
        bw.close();

    }

    public static void fuc(int idx) throws IOException {

        if(arr.size() == m) {
            for(int i=0; i<arr.size(); i++) {
                bw.write(arr.get(i) + " ");
            }
            bw.newLine();
            return;
        }

        for(int i=1; i<=n; i++) {
            if(!arr.isEmpty() && arr.get(arr.size() - 1) <= i) {
                arr.add(i);
                selectedCount++;
                fuc(2);
                arr.remove(arr.size() - 1);
                selectedCount--;
            }
        }

    }
}
