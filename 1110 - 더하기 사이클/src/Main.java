import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int start_num = Integer.parseInt(br.readLine());
		int temp_num = start_num;
		
		int tens_place, units_place;
		int result = -1;
		int repeat_count = 0;
		
		while(start_num != result) {
			
			repeat_count++;
			
			tens_place = (temp_num / 10);
			units_place = (temp_num % 10);
			
			result = (units_place * 10) + ((tens_place + units_place) % 10);
			
			temp_num = result;
			
		}
		
		bw.write(String.valueOf(repeat_count));
		bw.flush();
		bw.close();
		
	}
}
