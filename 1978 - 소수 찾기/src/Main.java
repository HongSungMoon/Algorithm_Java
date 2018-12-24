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
		String[] inputs = br.readLine().split(" ");
		int num = 0;
		int count = 0;
		
		for(int i=0 ; i<test_case; i++) {
			num = Integer.parseInt(inputs[i]);
			if(num == 1)
				continue;
			boolean check = false;
			for(int j=2; j<=num/2; j++) {
				if(num % j == 0)
					check = true;
				break;
			}
			if(!check)
				count++;
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		
	}

}
