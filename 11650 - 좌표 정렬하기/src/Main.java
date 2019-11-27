import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(br.readLine());
        Point[] points = new Point[count];

        String[] inputs = null;
        int x;
        int y;

        for(int i=0; i<count; i++) {
            inputs = br.readLine().split(" ");
            x = Integer.parseInt(inputs[0]);
            y = Integer.parseInt(inputs[1]);
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, (o1, o2) -> {
            if(o1.x == o2.x) {
                return Integer.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.x, o2.x);
        });

        for(int i=0; i<count; i++) {
            bw.write(points[i].x + " " + points[i].y);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
