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
		
		int alpha_idx[] = new int ['z'-'a' + 1];
		Arrays.fill(alpha_idx, -1);
		
		for(int i=0; i<alpha_idx.length; i++) {
			alpha_idx[i] = input.indexOf(i + 'a');
		}
		
		for(int i=0; i<alpha_idx.length; i++) {
			bw.write(String.valueOf(alpha_idx[i]));
			bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		
	}

}
