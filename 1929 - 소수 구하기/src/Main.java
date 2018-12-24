import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inputs = br.readLine().split(" ");
		int min = Integer.parseInt(inputs[0]);
		int max = Integer.parseInt(inputs[1]);
		boolean[] sosu = new boolean[max - min + 1];
		Arrays.fill(sosu, true);

		for (int i = min, j = 0; i <= Math.sqrt(max); i++, j++) {
			
		}

		for (int i = 0; i < sosu.length; i++) {
			if (sosu[i]) {
				bw.write(String.valueOf(min + i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}

}
