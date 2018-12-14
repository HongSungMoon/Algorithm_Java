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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int numCount = Integer.valueOf(st.nextToken());
		int pivot = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int num;
		
		for(int i=0; i<numCount; i++) {
			num = Integer.valueOf(st.nextToken());
			if(num < pivot) {
				bw.write(String.valueOf(num));
				bw.write(" ");
			}
		}
		
		bw.flush();
		bw.close();
			
	}

}
