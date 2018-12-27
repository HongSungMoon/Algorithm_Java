import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int count = 0;
		int sum = 0;
		int min_sosu = 0;

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
				if (min_sosu == 0)
					min_sosu = i;
				count++;
				sum += i;
			}
		}

		if (count < 1)
			bw.write(String.valueOf(-1));
		else {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min_sosu));
		}
			bw.flush();
			bw.close();
	}

}
