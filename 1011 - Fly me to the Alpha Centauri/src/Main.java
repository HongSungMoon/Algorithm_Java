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
			long distance = Long.parseLong(inputs[1]) - Integer.parseInt(inputs[0]);
			
			long half = 0;
			long movement = 0;
			
			while(true)  {
				movement++;
				half += movement;
				if((half * 2) - movement > distance) {
					half -= movement;
					movement --;
					break;
				}
			}
			
			if((half * 2) - movement  == distance)
				movement = (movement * 2) - 1;
			else if((half * 2) < distance)
				movement = (movement * 2) + 1;
			else
				movement = (movement * 2);
			
			bw.write(String.valueOf(movement));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
