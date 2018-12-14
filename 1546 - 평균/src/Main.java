import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num_of_subject = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int scores[] = new int[num_of_subject];
		int max = 0;
		
		for(int i=0; i<num_of_subject; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if (max < scores[i])
				max = scores[i];
		}
		
		double average = 0;
		
		for(int i=0; i<num_of_subject; i++) {
			average += (double)scores[i] / max * 100;
		}
		
		bw.write(String.valueOf(average / num_of_subject));
		bw.flush();
		bw.close();
		
	}

}
