import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String room_number = br.readLine().replace("9", "6");
		int number_counts[] = new int [9];
		
		for(int i=0; i<room_number.length(); i++) {
			number_counts[room_number.charAt(i) - '0']++;
		}
		
		if(number_counts[6] % 2 == 0)
			number_counts[6] = number_counts[6] / 2;
		else {
			number_counts[6] = (number_counts[6] / 2) + 1;
		}

		int max_idx = 0;
		for(int i=1; i<9; i++) {
			if(number_counts[i] > number_counts[max_idx])
				max_idx = i;
		}
		
		bw.write(String.valueOf(number_counts[max_idx]));
		bw.flush();
		bw.close();

	}

}
