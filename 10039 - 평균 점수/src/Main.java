import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int grade = 0;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			grade = Integer.parseInt(br.readLine());
			if(grade > 40)
				sum += grade;
			else
				sum += 40;
		}
		
		bw.write(String.valueOf(sum / 5));
		bw.flush();
		bw.close();
		
	}

}
