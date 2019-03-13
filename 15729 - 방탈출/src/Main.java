import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		String str = br.readLine().replaceAll(" ", "");

		boolean[] result = new boolean[str.length() + 2];
		boolean[] target = new boolean[str.length() + 2];

		Arrays.fill(result, false);
		Arrays.fill(target, false);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				target[i] = true;
			}
		}

		int idx = 0;
		int count = 0;

		while (true) {
			if (idx == length) {
				break;
			}
			if (result[idx] != target[idx]) {
				count++;
				result[idx + 2] = !result[idx + 2];
				result[idx + 1] = !result[idx + 1];
			}
			idx++;
		}
		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();

	}

}