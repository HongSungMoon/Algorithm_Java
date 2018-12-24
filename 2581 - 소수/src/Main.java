import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inputs = br.readLine().split(" ");
		int min = Integer.parseInt(inputs[0]);
		int max = Integer.parseInt(inputs[1]);

		for (int i = min; i <= max; i++) {
			if (i == 1)
				continue;
			boolean check = false;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}
			if (!check) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
			bw.flush();
			bw.close();
	}

}
