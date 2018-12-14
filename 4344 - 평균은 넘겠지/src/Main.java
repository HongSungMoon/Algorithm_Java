import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num_of_test = Integer.parseInt(br.readLine());
		StringTokenizer st;
		double average;
		
		for(int i=0; i<num_of_test; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int num_of_student = Integer.parseInt(st.nextToken());
			average = 0;
			
			int scores[] = new int [num_of_student];
			for(int j=0; j<num_of_student; j++){
				scores[j] = Integer.parseInt(st.nextToken());
				average += scores[j]; 
			}
			
			average /= num_of_student;
			int num_of_above_average = 0;
			
			for(int j=0; j<num_of_student; j++) {
				if(average < scores[j])
					num_of_above_average++;
			}
			
			bw.write(String.format("%.3f", (double)num_of_above_average / num_of_student * 100));
			bw.write("%\n");
			
		}
		
		bw.flush();
		bw.close();
				
	}

}
