import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		
		int times[] = new int ['z' - 'a' + 1];
		int counts[] = {3, 3, 3, 3, 3, 4, 3, 4};
		
		
		int temp = 3;
		int alphaIdx = 0;
		
		for(int i=0; i<counts.length; i++) {
			for(int j=0; j<counts[i]; j++) {
				times[alphaIdx] = temp;
				alphaIdx++;
			}
			temp++;
		}
		
		int result = 0;
		
		for(int i=0; i<text.length(); i++) {
			result += times[text.charAt(i) - 'A'];
		}
		
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		
	}
}
