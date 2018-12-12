import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text[] = br.readLine().split(" ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(text[0]);
		int b = Integer.parseInt(text[1]);
		
		bw.write((a-b) + "");
		bw.flush();
		bw.close();
		
	}
}
