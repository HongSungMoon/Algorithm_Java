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
		
		int repeatCount = text.length() / 10; 
		
		for(int i=0; i<repeatCount ; i++) {
			bw.write(text.substring(i * 10, (i * 10 + 10)));
			bw.newLine();
		}
		bw.write(text.substring(repeatCount * 10));
		
		bw.flush();
		bw.close();
		
	}
}
