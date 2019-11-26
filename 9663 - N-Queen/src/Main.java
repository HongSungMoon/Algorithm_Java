import java.io.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int result = 0, N;
    private static int col[];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            col[1] = i;
            dfs(1);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }

    private static void dfs(int x) {
        if (x == N) {
            result++;
        } else {
            for (int i = 1; i <= N; i++) {
                int temp = x + 1;
                col[temp] = i;
                for (int j = 1; j <= x; j++) {
                    if (col[j] == i || Math.abs(j - temp) == Math.abs(col[j] - i)) {
                        col[temp] = 0;
                        break;
                    }
                }
                if (col[temp] == i) dfs(temp);
            }
        }
        col[x] = 0;
    }
}


//import java.io.*;
//
//public class Main {
//
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    static int n;
//    static boolean [] chessBoard;
//    static int count = 0;
//    static int result = 0;
//
//    public static void main(String[] args) throws IOException {
//
//        n = Integer.parseInt(br.readLine());
//
//        chessBoard = new boolean[n * n];
//
//        for(int i=0; i<(n*n)-4; i++) {
//            chessBoard[i] = true;
//            count++;
//            search(i);
//            chessBoard[i] = false;
//            count--;
//        }
//
//        bw.write(String.valueOf(result));
//        bw.flush();
//        bw.close();
//
//    }
//
//    public static void search(int startIdx) throws IOException {
//
//        if(count == n) {
//            result++;
//            return;
//        }
//
//        for(int i=startIdx + 1; i<n*n; i++) {
//            boolean checker = true;
//            for(int j=0; j<startIdx + 1; j++) {
//                if(chessBoard[j]) {
//                    boolean col = (i % n == j % n);
//                    boolean row = (i / n == j / n);
//                    boolean diag = (i / n) - (i % n) == (j / n) - (j % n);
//                    boolean diag2 = (i / n) + (i % n) == (j / n) + (j % n);
//
//                    if (col || row || diag || diag2) {
//                            checker = false;
//                            break;
//                    }
//                }
//            }
//
//            if(checker) {
//                chessBoard[i] = true;
//                count++;
//                search(i);
//                chessBoard[i] = false;
//                count--;
//            }
//        }
//
//    }
//}
