import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			
			String inputs[] = br.readLine().split(" ");
			int h = Integer.parseInt(inputs[0]);
			int w = Integer.parseInt(inputs[1]);
			int n = Integer.parseInt(inputs[2]);
			
			int room_num = 101;
			
			for(int j=1; j<n; j++) {
				room_num += 100;
				if(room_num > h * 100 + w)
					room_num = room_num - (h * 100) + 1;
			}
			
			bw.write(String.valueOf(room_num));
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		
	}
}
