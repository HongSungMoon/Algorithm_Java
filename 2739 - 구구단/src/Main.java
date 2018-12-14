import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<10; i++) {
			bw.write(String.valueOf(num));
			bw.write(" * ");
			bw.write(String.valueOf(i));
			bw.write(" = ");
			bw.write(String.valueOf(num * i));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
