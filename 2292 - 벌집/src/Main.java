import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int room_number = Integer.parseInt(br.readLine());

		int count = 1;
		int pivot = 1;

		while (room_number > pivot) {
			pivot += count * 6;
			count++;
		}
		
		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();

	}

}
