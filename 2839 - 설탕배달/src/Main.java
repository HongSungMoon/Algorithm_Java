import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int kilogram = Integer.parseInt(br.readLine());
		int three = 0;
		
		while(true) {
			if(kilogram % 5 == 0) {
				bw.write(((kilogram / 5) + three) + "");
				break;
			} else if(kilogram < 3) {
				bw.write("-1");
				break;
			}
			kilogram -= 3;
			three += 1;
		}
		
		bw.flush();
		bw.close();
		
	}

}
