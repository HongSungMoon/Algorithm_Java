import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int left = 1, right = 1;
		boolean right_asc = true;

		int i = 1;
		
		while (i != num) {

			if (left == 1 || right == 1) {
				if (right_asc) {
					right_asc = false;
					right++;
				} else {
					right_asc = true;
					left++;
				}
				i++;
			}
			
			if (i == num)
				break;

			if (right_asc) {
				right++;
				left--;
			} else {
				right--;
				left++;
			}
			i++;

		}

		bw.write(String.valueOf(left) + "/" + String.valueOf(right));
		bw.flush();
		bw.close();

	}

}
