

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String []args) throws IOException {

		
		String sing = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan";
		String[] split_sing = sing.split(" ");
		
		int input_num = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		input_num = Integer.parseInt( br.readLine() ) - 1;
		
		int repeat_num = input_num / 14;
		int word_idx = (input_num % 14);
		int exception_check_idx = word_idx % 4;
		
		int ru = 0;
		
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		if(exception_check_idx < 2)
			bw.write(split_sing[word_idx]);
		else {
			
			StringBuilder result = new StringBuilder();
			result.append("tu");
			
			if(exception_check_idx % 2 == 0) {
				ru = 2;
			} else {
				ru = 1;
			}
			ru = ru + repeat_num;
			
			if(ru > 4) {
				result.append("+ru*" + ru);
			} else {
				for(int i=0; i<ru; i++)
					result.append("ru");
			}
			
			bw.write(result.toString());

		}
		
		bw.flush();
		bw.close();
        
    }
}
