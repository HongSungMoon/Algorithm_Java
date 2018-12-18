import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int  repeat_num = Integer.parseInt(br.readLine());
		
		String input = null;
		int length = 0;
		
		for(int i=0; i<repeat_num; i++) {
			
			input = br.readLine();
			length = input.length();
			
			int score = 0;
			int oCount = 0;
			
			for(int k=0; k<length; k++) {
				
				if(input.charAt(k) == 'O') {
					oCount++;
					score += oCount;
				}
				else if(input.charAt(k) == 'X') {
					oCount = 0;
				}
					
			}
			
			bw.write(String.valueOf(score));
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
