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
		
		int length = text.length;
		int interval = text[0].charAt(0) - text[1].charAt(0);
		
		boolean check = true;
		
		for(int i=1; i<length - 1; i++) {
			 
			if(text[i].charAt(0) - text[i+1].charAt(0) != interval)
				check = false;
			
		}
		
		if(check) {
			if(interval == -1)
				bw.write("ascending");
			else
				bw.write("descending");
		} else {
			bw.write("mixed");
		}
		
		bw.flush();
		bw.close();
		
	}

}
