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
		
		int test_case = Integer.parseInt(br.readLine());
		
		String text = null;
		int group_word_count = 0;
		int alphas[] = new int ['z' - 'a' + 1];
		
		for(int i=0; i<test_case; i++) { 
			
			text = br.readLine();
			text = text.toLowerCase();
			char pivot = text.charAt(0);
			alphas[text.charAt(0) - 'a']++;
			
			boolean checker = true;
			
			for(int j=1; j<text.length(); j++) {
				if(pivot == text.charAt(j)) {
					alphas[text.charAt(j) - 'a']++;
				} else if(alphas[text.charAt(j) - 'a'] == 0) {
					pivot = text.charAt(j);
					alphas[text.charAt(j) - 'a']++;
				} else {
					checker = false;
				}
			}
			if(checker)
				group_word_count++;
			
			Arrays.fill(alphas, 0);
		}
		
		bw.write(String.valueOf(group_word_count));
		bw.flush();
		bw.close();
		
	}

}
