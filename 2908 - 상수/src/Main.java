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
		
		String inputs[] = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder(inputs[0]);
		sb.reverse();
		
		int a = Integer.parseInt(sb.toString());
		
		sb = new StringBuilder(inputs[1]);
		sb.reverse();
		int b = Integer.parseInt(sb.toString());
		
		bw.write(String.valueOf(Math.max(a, b)));
		
		bw.flush();
		bw.close();
		
	}

}
