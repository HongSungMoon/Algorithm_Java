import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(text[0]);
		int b = Integer.parseInt(text[1]);
		int c = Integer.parseInt(text[2]);
		
		bw.write(((a+b)%c) + "\n" + ((a%c + b%c) %c) + "\n" + (a*b)%c + "\n" + ((a%c * b%c)%c));
		bw.flush();
		bw.close();
		
	}
}
