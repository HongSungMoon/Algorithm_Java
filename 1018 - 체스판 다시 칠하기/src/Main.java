import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int row = Integer.parseInt(inputs[0]);
        int col = Integer.parseInt(inputs[1]);

        String[] chessBoard = new String [row];

        for(int i=0; i<row; i++) {
            chessBoard[i] = br.readLine();
        }

        int firstCount = 0;
        int secondCount = 0;
        int min = 64;

        for(int i=0; i<=row-8; i++) {
            for(int j=0; j<=col-8; j++) {
                firstCount = 0;
                secondCount = 0;
                for(int a=i; a<i+8; a++) {
                    for(int b=j; b<j+8; b++) {
                        if((a + b) % 2 == 0) {
                            if(chessBoard[a].charAt(b) == 'W')
                                firstCount++;
                            if(chessBoard[a].charAt(b) == 'B')
                                secondCount++;
                        } else {
                            if(chessBoard[a].charAt(b) == 'B')
                                firstCount++;
                            if(chessBoard[a].charAt(b) == 'W')
                                secondCount++;
                        }
                    }
                }
                if(min > firstCount)
                    min = firstCount;
                if(min > secondCount)
                    min = secondCount;
            }
        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();

    }
}
