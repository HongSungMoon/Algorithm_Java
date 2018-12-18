import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			
			String inputs[] = br.readLine().split(" ");
			
			int repeat_count = Integer.parseInt(inputs[0]);
			String text = inputs[1];
			
			StringBuilder sb = new StringBuilder();
			
			for(int j=0; j<text.length(); j++) {
				for(int k=0; k<repeat_count; k++) {
					sb.append(text.charAt(j));
				}
			}
			bw.write(sb.toString());
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
