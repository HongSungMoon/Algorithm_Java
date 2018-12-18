import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		long number = a * b * c;
		
		short result[] = new short [10];
		int idx;
		
		while(true) {
			
			idx = (int) (number % 10);
			if(number == 0)
				break;
			result[idx]++;
			number/=10;
			
		}
		
		for(int i=0; i<10; i++) {
			bw.write(String.valueOf(result[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
