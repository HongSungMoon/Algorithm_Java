import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;

public class Main {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		
		text = text.toUpperCase();
		
		int alpha_idx[] = new int ['z' - 'a' + 1];
		int length = text.length();
		
		for(int i=0; i<length; i++) {
			alpha_idx[text.charAt(i) - 'A']++;
		}
		
		int maxIdx = 0;
		boolean check = false;
		
		for(int i=1; i<26; i++) {
			if(alpha_idx[maxIdx] < alpha_idx[i]) {
				maxIdx = i;
				check = false;
			} else if(alpha_idx[maxIdx] == alpha_idx[i])
				check = true;
		}
		
		if(check)
			bw.write("?");
		else
			bw.write(maxIdx + 'A');
		
		bw.flush();
		bw.close();
		
	}

}
