import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test_case = Integer.parseInt(br.readLine());

		for (int t = 0; t < test_case; t++) {

			String[] inputs = br.readLine().split(" ");

			int M = Integer.parseInt(inputs[0]);
			int N = Integer.parseInt(inputs[1]);
			int x = Integer.parseInt(inputs[2]);
			int y = Integer.parseInt(inputs[3]);
			
			if(M > N) {
				int tmpx = M;
				M = N;
				N = tmpx;
				tmpx = x;
				x = y;
				y = tmpx;
			}
			
			int pivot = x % N;
			long count = 1;
			
			if(pivot == 0)
				pivot = y;

			if (x == y) {
				bw.write(String.valueOf(x));
				bw.newLine();
			} else {
				while (true) {
					if (pivot == y)
						break;
					pivot = (pivot + M) % N;
					if (pivot == 0)
						pivot = N;
					count++;
					if (count > N) {
						pivot = -1;
						break;
					}
				}
				bw.write(String.valueOf(pivot == -1 ? pivot : (count - 1) * M + x));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

	}
	
}
