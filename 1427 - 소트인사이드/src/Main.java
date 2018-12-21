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

		String input = br.readLine();
		char[] char_arr = input.toCharArray();
		Arrays.sort(char_arr);

		for(int i=char_arr.length - 1; i>=0; i--) {
			bw.write(char_arr[i]);
		}
		
		bw.flush();
		bw.close();
		
	}

}
