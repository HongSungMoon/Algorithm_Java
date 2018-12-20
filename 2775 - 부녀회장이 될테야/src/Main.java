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
			
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int persons[] = new int [n];
			for(int j=0; j<n; j++)
				persons[j] = j+1;
			
			for(int j=0; j<k; j++) {
				int sum  = 0;
				for(int l=0; l<n; l++) {
					sum += persons[l];
					persons[l] = sum;
				}
			}
			
			bw.write(String.valueOf(persons[n - 1]));
			bw.newLine();
			
		}

		bw.flush();
		bw.close();

	}

}
