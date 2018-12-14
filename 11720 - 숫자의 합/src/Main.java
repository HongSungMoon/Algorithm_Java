import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numCount = Integer.parseInt(br.readLine());
		
		String text = br.readLine();
		
		int result = 0;
		
		for(int i=0; i<numCount; i++) {
			result += (text.charAt(i) - '0');
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		
	}

}
