import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static boolean [] chessBoard;
    static int count = 0;
    static int result = 0;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        chessBoard = new boolean[n * n];

        for(int i=0; i<(n*n)-4; i++) {
            chessBoard[i] = true;
            count++;
            search(i);
            chessBoard[i] = false;
            count--;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    public static void search(int startIdx) throws IOException {

        if(count == n) {
            result++;
            return;
        }

        for(int i=startIdx + 1; i<n*n; i++) {
            boolean checker = true;
            for(int j=0; j<startIdx + 1; j++) {
                if(chessBoard[j]) {
                    if((i % n != j % n) && (i / n != j / n)) {
                        int diagL = i;
                        boolean isDiagL = false;;
                        while(diagL >= n) {
                            if(diagL % n == 0)
                                break;
                            diagL -= (n + 1);
                            if(diagL == j) {
                                isDiagL = true;
                                break;
                            }
                        }
                        int diagR = i;
                        boolean isDiagR = false;;
                        while(diagR >= n) {
                            if(diagR % n == n-1)
                                break;
                            diagR -= (n - 1);
                            if(diagR == j) {
                                isDiagR = true;
                                break;
                            }
                        }
                        if(isDiagL || isDiagR) {
                            checker = false;
                            break;
                        }
                    } else
                        checker = false;
                }
            }

            if(checker) {
                chessBoard[i] = true;
                count++;
                search(i);
                chessBoard[i] = false;
                count--;
            }
        }

    }
}
