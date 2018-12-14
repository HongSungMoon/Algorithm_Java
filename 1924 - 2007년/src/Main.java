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
		
		int month = Integer.parseInt(text[0]);
		int day = Integer.parseInt(text[1]);
		
		String days[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int maxDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int dayIdx = 0;
		
		for(int i=0; i<month - 1; i++) {
			day += maxDay[i];
		}
		
		dayIdx = --day % 7;
		
		bw.write(days[dayIdx]);
		bw.flush();
		bw.close();
		
	}
}
