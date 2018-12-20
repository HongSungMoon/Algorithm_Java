import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String croatia_alphas[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		String input = br.readLine();
		
		for(int i=0; i<croatia_alphas.length; i++) {
			input = input.replace(croatia_alphas[i], "a");
		}
		
		bw.write(String.valueOf(input.length()));
		bw.flush();
		bw.close();
		
	}
}
