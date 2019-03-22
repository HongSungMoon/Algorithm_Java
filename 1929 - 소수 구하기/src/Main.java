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
		boolean[] sosu = new boolean[(int)Math.sqrt(max) + 1 + 5];
		Arrays.fill(sosu, true);

		for (int i = 1; i <= Math.sqrt(max) + 5; i++) {
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
				sosu[i] = false;
			}
		}

		boolean results[] = new boolean [max - min + 1];
		Arrays.fill(results, true);
		for(int i=1; i<sosu.length; i++) {
			if(sosu[i] == false)
				for(int j=min; j<=max; j++)
					if(j % i == 0 && i != j)
						results[j-min] = false;
		}

		if(min == 1)
			results[0] = false;

		for (int i = 0; i < results.length; i++) {
			if (results[i]) {
				bw.write(String.valueOf(min + i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}

}
